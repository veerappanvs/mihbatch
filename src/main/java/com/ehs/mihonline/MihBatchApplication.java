package com.ehs.mihonline;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
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
import com.ehs.mihonline.pdfform.PdfFormReader;
import com.ehs.mihonline.repository.FileDetailsRepository;
import com.ehs.mihonline.repository.FormValidationRepository;
import com.ehs.mihonline.util.MapCommunityEmsData;
import com.ehs.mihonline.util.MihEmail;

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
	MihEmail mihEmail;

	@Autowired
	FileDetailsRepository  fileDetailsRepository;
	
	@Autowired
	FormValidationRepository formValidationRepository ;
	
	Map<String, String> formKeyValue=null;

	@Override
	public void run(String... arg0) throws Exception {
	 
		//TODO Remove Hard coding
		Files.newDirectoryStream(Paths.get(properties.getMihInputDirectory()), properties.getMhPdfExtension())
										//path -> (  path.toFile().isFile() && path.toFile().getName().toLowerCase().endsWith("pdf")))
										.forEach(path ->{
															try {
																loadFile(path.toFile(), Files.getFileAttributeView(path, FileOwnerAttributeView.class));
															} catch (Exception e) {
																// TODO Auto-generated catch block
																e.printStackTrace();
															}
														} );
	}
	
	public String loadFile(File file, FileOwnerAttributeView attributes) 
	{
		
		FileDetails fd=null;
		PDDocument doc = null;
		StringJoiner missingFields = new StringJoiner(properties.getMihErrorFieldsSeperator());
		try {
		doc = PDDocument.load(file);
		UserPrincipal userprincipal = attributes.getOwner();
		System.out.println("Processing File name  =================================>>>>>>>>>>>>>>>"+file.getName());
		System.out.println("Processing File name  =================================>>>>>>>>>>>>>>>"+userprincipal.getName());
		formKeyValue = PdfFormReader.listFields(doc);
		formKeyValue.put("File_owner_name", userprincipal.getName());
		formKeyValue.put("File_name", file.getName());
		 
		 fd = new FileDetails(0, formKeyValue.get(properties.getInp_app_pdf_application_number()), file.getName(), userprincipal.getName(), new Date(), "ERROR", null);
		 String appType = formKeyValue.get("inp_app_category");
		 if(appType == null || !validatePdfFormValue(appType, missingFields)) { 			 
			fd.setUploadComments(missingFields.toString());
			 throw new Exception("Form Validation Failed- Missing Fields : "+missingFields);
		 }
		 mapCommunityEmsData.mapDatatoModel(formKeyValue, fd);
		 
		 //file.renameTo(new File("C:\\Users\\vsubramaniyan\\workspace\\JavaPDF\\pdf_processing\\PROCESSED\\"+formKeyValue.get(properties.getPdf_application_number()) + ".pdf"));
		 
		 //TODO comment should be removed

		 //mihEmail.send();
		 }
		//TODO Excpetion messages should be changed accordingly
		 catch(Exception ex){
			 
			 ex.printStackTrace();
		 }
		finally
		{	
			if(doc != null)
			try{	
				doc.close();
				if( fileDetailsRepository != null && fd !=null) {
					 fileDetailsRepository.saveAndFlush(fd);
				}
			}
			catch(Exception e ){
				e.printStackTrace();
			}
		}
		logger.debug("Completed loading the applications");
		return fd.getUploadStatus();
	}

	
	public boolean validatePdfFormValue(String appType, StringJoiner missingFiledsCsv){
		boolean status = false;	
		//List<FormValidation> validations =  formValidationRepository.findAllByAppType(Integer.parseInt(appType));
		List<FormValidation> validations =  formValidationRepository.findAll();
		//System.out.println("Validations are "+validations);
		validations.stream()
		.filter(validation -> validation.getAppType()==Integer.parseInt(appType)).forEach(validation -> 
		{	 
			
			String value = formKeyValue.get(validation.getFieldName());
			//System.out.println("value ******** "+value+" validation  "+validation);
			if (value ==null || value.trim() =="")
				missingFiledsCsv.add(validation.getFieldName());
		}	
		);
		
		System.out.println("missingFiledsCsv 90909090909090"+missingFiledsCsv);
		if(missingFiledsCsv.length() == 0)
			status = true;
		
		return status;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MihBatchApplication.class, args);
	}
}
