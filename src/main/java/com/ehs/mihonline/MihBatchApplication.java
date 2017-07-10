package com.ehs.mihonline;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ehs.mihonline.dto.MIHConstantproperties;
import com.ehs.mihonline.entity.FileDetails;
import com.ehs.mihonline.entity.FormValidation;
import com.ehs.mihonline.exception.FormValidationFailedException;
import com.ehs.mihonline.exception.TargetFileExistsException;
import com.ehs.mihonline.pdfform.PdfFormReader;
import com.ehs.mihonline.repository.ApplicationsRepository;
import com.ehs.mihonline.repository.FileDetailsRepository;
import com.ehs.mihonline.repository.FormValidationRepository;
import com.ehs.mihonline.util.EmailUtil;
import com.ehs.mihonline.util.MapCommunityEmsData;

/**
 * @author vsubramaniyan
 *
 */
@SpringBootApplication
public class MihBatchApplication  implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(MihBatchApplication.class);

	@Autowired
	MapCommunityEmsData mapCommunityEmsData;
	
	@Autowired	
	MIHConstantproperties	 properties;
	
	@Autowired
	EmailUtil mihEmail;

	@Autowired
	FileDetailsRepository  fileDetailsRepository;
	
	@Autowired
	FormValidationRepository formValidationRepository ;
	
	@Autowired
	ApplicationsRepository applicationsRepository;
	
	Map<String, String> formKeyValue=null;

	List<FormValidation> validations = null;
	
	@Override
	public void run(String... arg0) throws Exception {
	 
/*		//TODO Remove Hard coding
		Files.newDirectoryStream(Paths.get(properties.getMihInputDirectory()), properties.getMhPdfExtension())
										//path -> (  path.toFile().isFile() && path.toFile().getName().toLowerCase().endsWith("pdf")))
										.forEach(path ->{
															try {
																loadFile(path.toFile(), Files.getFileAttributeView(path, FileOwnerAttributeView.class));
															} catch (Exception e) {
																// TODO Auto-generated catch block
																e.printStackTrace();
															}
														} );*/
		logger.debug("Started MIH Batch Application");
		validations = formValidationRepository.findAll();
		logger.debug(validations.toString());
		Files.list( Paths.get(properties.getMihInputDirectory()))
			  .filter(path -> (  path.toFile().isFile() && path.toFile().getName().toLowerCase().endsWith("pdf")))
			  .sorted((s1, s2)
	                    -> s1.toFile().lastModified()
	                    >= s2.toFile().lastModified() ? 1 : -1)
			  .forEachOrdered(path ->{
								try {
									logger.debug("Processing File =="+path.toFile().getName());
									loadFile(path.toFile(), Files.getFileAttributeView(path, FileOwnerAttributeView.class));
									logger.debug("Completed Processing File =="+path.toFile().getName());
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} );
		logger.debug("Completed MIH Batch Application");	
	}
	
	public String loadFile(File file, FileOwnerAttributeView attributes) 
	{
		String uploadStatus = properties.getMihFileUploadErrorStatus();
		boolean targetFileExists = false;
		FileDetails fd=null;
		PDDocument doc = null;
		StringJoiner missingFields = new StringJoiner(properties.getMihErrorFieldsSeperator());
		String targetDir = properties.getMihErrorDir();
		String targetFileName = file.getName();
		File targetFile = new File(targetDir+targetFileName);
		try {
				if(targetFile.exists()) {
					//TODO   Rename the error file if exists
					logger.debug("File exists already in the Error Directory "+targetFile);
				}
				doc = PDDocument.load(file);
				UserPrincipal userprincipal = attributes.getOwner();
				logger.debug("Loading PDF Fields File >>>>>>>>>>>>>>> "+file.getName()+" Created by >>>>>>>>>>>>>>> "+userprincipal.getName());
				formKeyValue = PdfFormReader.listFields(doc);
				String pdfAppNumber =  formKeyValue.get(properties.getInp_app_pdf_application_number());
				logger.debug("Loaded PDF Field Details. File name : "+targetFileName+"PDF Application Number :"+pdfAppNumber);
				formKeyValue.put("File_owner_name", userprincipal.getName());
				formKeyValue.put("File_name", file.getName());				
				fd = new FileDetails(0, pdfAppNumber, file.getName(), userprincipal.getName(), new Date(), uploadStatus, null);
				
				
				targetFileName=pdfAppNumber+ properties.getMhPdfExtension().substring(1);
				targetDir=properties.getMihProcessedDir();
				File tempTargetFile = new File(targetDir+targetFileName);
				if(!tempTargetFile.exists()) {
					
					String appType = formKeyValue.get(properties.getInp_app_category());
					if(appType == null || !validatePdfFormValue(appType, missingFields)) { 			 
						throw new FormValidationFailedException("Missing Fields: "+missingFields);
					}					 
					mapCommunityEmsData.mapDatatoModel(formKeyValue, fd);
					
					uploadStatus=properties.getMihFileUploadSucStatus();
				 	fd.setUploadStatus(uploadStatus);
				 	targetFile = tempTargetFile;
				}
				else {
					targetFileExists=true;
					throw new TargetFileExistsException("Application Already Processed");
					
				}
				
				
				 
				//TODO
				//mihEmail.sendEmail(properties.getMihEmail1(), "Processed files", "Files are uploaded the following files has some issues");
			}
		//TODO Excpetion messages should be changed accordingly
/*		 catch(TargetFileExistsException  | FormValidationFailedException ex){
			 ex.printStackTrace();
		 }*/
		 catch(Exception ex){
			 ex.printStackTrace();
			 fd.setUploadComments(ex.getMessage());
		 }
		finally
		{	
			if(doc != null && file != null)
			try{	
				doc.close();
				if( fileDetailsRepository != null && fd !=null) {
					 fileDetailsRepository.saveAndFlush(fd);
					 logger.debug("Saved File Upload status "+fd.toString());
				}
				
				//if(!targetFileExists) {
				 Files.copy(file.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
				 logger.debug("Copied file to the destination directory "+targetFile);
				 file.deleteOnExit();
				 //file.delete();
				//}
			}
			catch(Exception e ){
				e.printStackTrace();
			}
		}
		
		logger.debug("Completed loading the applications");
		return uploadStatus;
	}

	
	public boolean validatePdfFormValue(String appType, StringJoiner missingFiledsCsv){
		
		boolean status = false;	
		String previousAppid = formKeyValue.get(properties.getInp_app_previous_number());
		if( formKeyValue.get(properties.getInp_app_resubmission()) == "Yes"   ){
				if (previousAppid == null || previousAppid.trim().equals("")){
					missingFiledsCsv.add("Previous App Number is empty ");
				}
				else if(applicationsRepository.findByUniquePDFAppId(previousAppid) == null) {
					missingFiledsCsv.add("Previous App Number : "+previousAppid+" does not exist.");	
				} 
		}
		else {
			validations.stream()
					   .filter(validation -> validation.getAppType()==Integer.parseInt(appType))
					   .forEach(validation -> {	 
											String value = formKeyValue.get(validation.getFieldName());
											//logger.debug("value ******** "+value+" validation  "+validation);
											if (value ==null || value.equals(""))
												missingFiledsCsv.add(validation.getFieldName());
						});
		}	
		logger.debug("MissingFiledsCsv "+missingFiledsCsv);
		if(missingFiledsCsv.length() == 0){
			status = true;
		}
		return status;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MihBatchApplication.class, args);
	}
}
