package com.ehs.mihonline;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ehs.mihonline.dto.CommunityEmsPDFFieldNames;
import com.ehs.mihonline.pdfform.PdfFormReader;
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
	CommunityEmsPDFFieldNames	 fieldNames;
	
	@Autowired
	MihEmail mihEmail;

	public static void main(String[] args) {
		SpringApplication.run(MihBatchApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
	 
	 //File file = new File("C:\\Users\\vsubramaniyan\\workspace\\JavaPDF\\test_with_attachment_20170526.pdf");
		//Files.newDirectoryStream(Paths.get("C:\\Users\\vsubramaniyan\\workspace\\JavaPDF\\pdf_processing\\"),
		Files.newDirectoryStream(Paths.get("O:\\MIH\\Import\\"),
										path -> (  path.toFile().isFile() && path.toFile().getName().toLowerCase().endsWith("pdf")))
										.forEach(path ->{
											try {
												loadFile(path.toFile(), Files.getFileAttributeView(path, FileOwnerAttributeView.class));
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										} );
		
	 //File file = new File(System.getProperty("pdf_file_name"));
	/* PDDocument doc = PDDocument.load(file);
	 Map<String, String> formKeyValue = PdfFormReader.listFields(doc);
	 //System.out.println("formKeyValue count -->"+ formKeyValue.size());
	 doc.close();
	 mapCommunityEmsData.mapDatatoModel(formKeyValue);
	logger.debug("Completed loading the applications");*/
	}
	
	public void loadFile(File file, FileOwnerAttributeView attributes) throws Exception
	{
		try {
		PDDocument doc = PDDocument.load(file);
		UserPrincipal userprincipal = attributes.getOwner();
		System.out.println("Processing File name  =================================>>>>>>>>>>>>>>>"+file.getName());
		System.out.println("Processing File name  =================================>>>>>>>>>>>>>>>"+userprincipal.getName());
		 Map<String, String> formKeyValue = PdfFormReader.listFields(doc);
		 formKeyValue.put("File_owner_name", userprincipal.getName());
		 
		 //System.out.println("formKeyValue count -->"+ formKeyValue.size());
		 doc.close();
		 mapCommunityEmsData.mapDatatoModel(formKeyValue);
		 //file.renameTo(new File("C:\\Users\\vsubramaniyan\\workspace\\JavaPDF\\pdf_processing\\PROCESSED\\"+formKeyValue.get(fieldNames.getPdf_application_number()) + ".pdf"));
		 
		 file.renameTo(new File("O:\\MIH\\Processed\\"+formKeyValue.get(fieldNames.getPdf_application_number()) + ".pdf"));
		 //mihEmail.send();
		 }
		 catch(Exception ex){
			 ex.printStackTrace();
		 }
		logger.debug("Completed loading the applications");
	}
	
}
