/**
 * 
 */
package com.ehs.mihonline.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ehs.mihonline.dto.MIHConstantproperties;
import com.ehs.mihonline.entity.Ambulance;
import com.ehs.mihonline.entity.Applications;
import com.ehs.mihonline.entity.FileDetails;
import com.ehs.mihonline.entity.Organization;
import com.ehs.mihonline.entity.Person;
import com.ehs.mihonline.entity.WorkFlowDetails;
import com.ehs.mihonline.repository.AmbulanceRepository;
import com.ehs.mihonline.repository.ApplicationsRepository;
import com.ehs.mihonline.repository.FileDetailsRepository;
import com.ehs.mihonline.repository.WorkflowDetailsRepository;

/**
 * @author vsubramaniyan
 *
 */
@Component
public class MapCommunityEmsData {

	private static final Logger logger = LoggerFactory.getLogger(MapCommunityEmsData.class);
	@Autowired
	private AmbulanceRepository ambulanceRepository;
	@Autowired
	private ApplicationsRepository applicationsRepository;
	@Autowired
	private WorkflowDetailsRepository  workflowDetailsRepository;
	@Autowired
	private FileDetailsRepository  fileDetailsRepository;
	
	@Autowired	
	MIHConstantproperties	 properties;
	Map<String, String> formKeyValue;
	
	String pdfApplicationId;
	
	SimpleDateFormat sdf;
	
	@Transactional
	public void mapDatatoModel(Map<String, String> formKeyValue, FileDetails fd) throws NumberFormatException, ParseException{
		
		 sdf = new SimpleDateFormat(properties.getMihPlainDateFormat());
		 //properties = new MIHConstantproperties();
		 this.formKeyValue=formKeyValue;
		 pdfApplicationId=formKeyValue.get(properties.getInp_app_pdf_application_number());
		 logger.debug("Processing application ID================>"+pdfApplicationId);
		 formKeyValue.get(properties.getInp_date_submission());
		 logger.debug("Input Date of submission================>"+properties.getInp_date_submission());
		 logger.debug("Cli Phone================>"+properties.getInp_sec1_person_cli_phone());
		 
		 
		 Applications appl = mapApplicationToModel();
		 mapAmbulancetoModel();
		 fd.setApplicationId(appl.getAppId());
		 fileDetailsRepository.saveAndFlush(fd);
		 formKeyValue.put(appl.getUniquePDFAppId(), String.valueOf(appl.getAppId()));
		 
	}
	
	
	public Applications mapApplicationToModel() throws NumberFormatException, ParseException{
		 
		Organization org = new Organization(formKeyValue.get(properties.getInp_org_name()),
											 formKeyValue.get(properties.getInp_org_address_street()), 
											 formKeyValue.get(properties.getInp_org_name()), 
											 formKeyValue.get(properties.getInp_org_address_city()), 
											 formKeyValue.get(properties.getInp_org_address_state()), 
											 formKeyValue.get(properties.getInp_org_address_zip()));
		 System.out.println("Org --> "+org);
		 Person contactPersonId = new Person(formKeyValue.get(properties.getInp_sec1_person_name()), 
											 formKeyValue.get(properties.getInp_sec1_person_title()), 
											 //Long.parseLong(formKeyValue.get(properties.getInp_sec1_person_phone())), 
											 formKeyValue.get(properties.getInp_sec1_person_phone()), 
											 formKeyValue.get(properties.getInp_sec1_person_email()), "External");
		 System.out.println("contactPersonId --> "+contactPersonId);
		 Person primaryMedicalDirectorId = new Person(formKeyValue.get(properties.getInp_sec1_person_cli_name()), 
														formKeyValue.get(properties.getInp_sec1_person_cli_title()), 
														//Long.parseLong(formKeyValue.get(properties.getInp_sec1_person_cli_phone())),
														 formKeyValue.get(properties.getInp_sec1_person_cli_phone()), 
														formKeyValue.get(properties.getInp_sec1_person_cli_email()), "External");

		 System.out.println("primaryMedicalDirectorId --> "+primaryMedicalDirectorId);
		 
		 Applications appl = new Applications(pdfApplicationId,
				 								org, 
				 								parseDate(formKeyValue.get(properties.getInp_date_submission())),
				 								contactPersonId, 
				 								primaryMedicalDirectorId, 
				 								parseDate( formKeyValue.get(properties.getInp_sec1_prog_start_date())), 
					 							Integer.parseInt(formKeyValue.getOrDefault(properties.getInp_num_ems(), "0")),  
					 							Integer.parseInt(formKeyValue.getOrDefault(properties.getInp_num_emt(), "0")), 
				 								formKeyValue.get(properties.getInp_health_care_org()), 
				 								formKeyValue.get(properties.getInp_app_resubmission()),
				 								formKeyValue.get(properties.getInp_app_category()), 
				 								new Date(), 
					 							new Date(),  
				 								System.getProperty("user.name"),  
				 								new SimpleDateFormat("MM/dd/yyyy").parse(formKeyValue.get(properties.getInp_date_submission())), 
				 								"PENDING",
				 								new Date(), 
				 								null, 
				 								null);
		 System.out.println("appl --> "+appl);
		 Set<WorkFlowDetails> workFlowDetailsList = new HashSet<WorkFlowDetails>();
/*		 workFlowDetailsList.add(new WorkFlowDetails(appl, 1, "APPROVER_1", "PENDING", null, null, null));
		 workFlowDetailsList.add(new WorkFlowDetails(appl, 2, "APPROVER_2", "PENDING", null, null, null));
		 workFlowDetailsList.add(new WorkFlowDetails(appl, 3, "APPROVER_3", "PENDING", null, null, null));
		 workFlowDetailsList.add(new WorkFlowDetails(appl, 4, "APPROVER_4", "PENDING", null, null, null));*/

		 appl.setWorkflowDetails(workFlowDetailsList);
		 applicationsRepository.saveAndFlush(appl);
		 workFlowDetailsList.add(new WorkFlowDetails(appl.getAppId(), 1, "APPROVER_1", "PENDING", null, null, null));
		 workFlowDetailsList.add(new WorkFlowDetails(appl.getAppId(), 2, "APPROVER_2", "PENDING", null, null, null));
		 workFlowDetailsList.add(new WorkFlowDetails(appl.getAppId(), 3, "APPROVER_3", "PENDING", null, null, null));
		 workFlowDetailsList.add(new WorkFlowDetails(appl.getAppId(), 4, "APPROVER_4", "PENDING", null, null, null));
		 
		 workflowDetailsRepository.saveAll(workFlowDetailsList);
		 
		 for(Applications appls : applicationsRepository.findAll())
		 {
			 logger.debug("Applications Details"+appls.toString());
		 }
		 
		 return appl;
	}
	
	public void mapAmbulancetoModel(){
		
		 HashSet<Ambulance> ambulanceList = new HashSet<Ambulance>();
		 if(formKeyValue.get(properties.getInp_amb_loca_jursd_1()) !=null )
		 {
			 	Ambulance amb1 = new Ambulance(
			 							formKeyValue.get(properties.getInp_amb_service_name_1()),
			 							formKeyValue.get(properties.getInp_amb_loca_jursd_1()) , 
				 						formKeyValue.get(properties.getInp_amb_lic_num_1()),
				 						formKeyValue.get(properties.getInp_amb_person_name_1()),
				 						formKeyValue.get(properties.getInp_amb_cont_phone_1()), 
				 						formKeyValue.get(properties.getInp_amb_cont_email_1())
				 						);
			 	ambulanceList.add(amb1);
		 }
		 
		 if(formKeyValue.get(properties.getInp_amb_loca_jursd_2()) !=null )
		 {
			 Ambulance amb2 = new Ambulance(
					 					formKeyValue.get(properties.getInp_amb_service_name_2()),
					 					formKeyValue.get(properties.getInp_amb_loca_jursd_2()) , 
										formKeyValue.get(properties.getInp_amb_lic_num_2()),
										formKeyValue.get(properties.getInp_amb_person_name_2()),
										formKeyValue.get(properties.getInp_amb_cont_phone_2()), 
										formKeyValue.get(properties.getInp_amb_cont_email_2())
										);
		 	ambulanceList.add(amb2);
		 }
		 
		 if(formKeyValue.get(properties.getInp_amb_loca_jursd_3()) !=null )
		 {
			 Ambulance amb3 = new Ambulance(
					 					formKeyValue.get(properties.getInp_amb_service_name_3()),
					 					formKeyValue.get(properties.getInp_amb_loca_jursd_3()) , 
										formKeyValue.get(properties.getInp_amb_lic_num_3()),
										formKeyValue.get(properties.getInp_amb_person_name_3()),
										formKeyValue.get(properties.getInp_amb_cont_phone_3()), 
										formKeyValue.get(properties.getInp_amb_cont_email_3())
										);
		 	ambulanceList.add(amb3);
		 }
		 
		 if(formKeyValue.get(properties.getInp_amb_loca_jursd_4()) !=null )
		 {
			 Ambulance amb4 = new Ambulance(
					 					formKeyValue.get(properties.getInp_amb_service_name_4()),
					 					formKeyValue.get(properties.getInp_amb_loca_jursd_4()) , 
										formKeyValue.get(properties.getInp_amb_lic_num_4()),
										formKeyValue.get(properties.getInp_amb_person_name_4()),
										formKeyValue.get(properties.getInp_amb_cont_phone_4()), 
										formKeyValue.get(properties.getInp_amb_cont_email_4())
										);
		 	ambulanceList.add(amb4);
		 }
		
		 if(ambulanceList.size()>0)
			 	ambulanceRepository.saveAll(ambulanceList);
		 else
			 System.out.println("No Ambulance details to save");
		 for(Ambulance ambl : ambulanceRepository.findAll())
		 {
			 System.out.println("ambl value"+ambl.toString());
			 logger.debug("ambl value"+ambl.toString());
		 }
		 //if (ambulanceList.size()>0)
			 //throw new RuntimeException("Test Trascation");
	}

/*	public void storeFileDetails(){
			
		fileDetailsRepository.saveAndFlush(new FileDetails(applicationId, uniqueid, fileName, createdBy, createdTime, uploadStatus, uploadComments));
	}*/
	
	/*public void mapProgramFundToModel() throws NumberFormatException, ParseException{
		 
		ProgramFund org = new ProgramFund
		 applicationsRepository.saveAndFlush(appl);
		 
		 for(Applications appls : applicationsRepository.findAll())
		 {
			 logger.debug("ambl value"+appls.toString());
		 }
	}*/
	
	public Date parseDate(String date) throws ParseException
	{
		if (date != null)
				return sdf.parse(date);
		else return null;
	}
	
}
