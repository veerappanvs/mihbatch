package com.ehs.mihonline.dto;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:pdffieldmapping.properties")
public class CommunityEmsPDFFieldNames {

	@Value("${inp_app_pdf_application_number_ro}")
	private String inp_app_pdf_application_number;
	
	@Value("${inp_app_category}")
	private String  inp_app_category; 
	
	@Value("${inp_evidence_support}")
	private String  inp_evidence_support; 
	
	@Value("${inp_app_resubmission}")
	private String  inp_app_resubmission; 
	
	@Value("${inp_org_name}")
	private String  inp_org_name; 
	
	@Value("${inp_date_submission}")
	private String  inp_date_submission;
	
	@Value("${inp_org_address_street}")
	private String  inp_org_address_street;
	
	@Value("${inp_org_address_city}")
	private String  inp_org_address_city; 
	
	@Value("${inp_org_address_state}")
	private String  inp_org_address_state; 
	
	@Value("${inp_org_address_zip}")
	private String  inp_org_address_zip;
	
	@Value("${inp_sec1_person_name}")
	private String  inp_sec1_person_name; 
	
	@Value("${inp_sec1_person_title}")
	private String  inp_sec1_person_title; 
	
	@Value("${inp_sec1_person_phone}")
	private String  inp_sec1_person_phone; 
	
	@Value("${inp_sec1_person_email}")
	private String  inp_sec1_person_email; 
	
	@Value("${inp_sec1_sign_person_name}")
	private String  inp_sec1_sign_person_name; 
	
	@Value("${inp_sec1_sign1}")
	private String  inp_sec1_sign1; 
	
	@Value("${inp_sec1_person_cli_name}")
	private String  inp_sec1_person_cli_name; 
	
	@Value("${inp_sec1_person_cli_title}")
	private String  inp_sec1_person_cli_title; 
	
	@Value("${inp_sec1_person_cli_phone}")
	private String  inp_sec1_person_cli_phone; 
	
	@Value("${inp_sec1_person_cli_email}")
	private String  inp_sec1_person_cli_email; 
	
	@Value("${inp_sec1_prog_start_date}")
	private String  inp_sec1_prog_start_date; 
	
	@Value("${inp_num_ems}")
	private String  inp_num_ems; 
	
	@Value("${inp_num_emt}")
	private String  inp_num_emt; 
	
	@Value("${inp_health_care_org}")
	private String  inp_health_care_org; 
	
	@Value("${inp_prog_fnd_agency}")
	private String  inp_prog_fnd_agency; 
	
	@Value("${inp_prog_fnd_grant}")
	private String  inp_prog_fnd_grant; 
	
	@Value("${inp_prog_fnd_party}")
	private String  inp_prog_fnd_party; 
	
	@Value("${inp_prog_fnd_other}")
	private String  inp_prog_fnd_other; 
	
	@Value("${inp_prog_fnd_other_descr}")
	private String  inp_prog_fnd_other_descr; 
	
	@Value("${inp_amb_service_name_1}")
	private String  inp_amb_service_name_1; 
	
	@Value("${inp_amb_service_name_2}")
	private String  inp_amb_service_name_2; 
	
	@Value("${inp_amb_service_name_3}")
	private String  inp_amb_service_name_3; 
	
	@Value("${inp_amb_service_name_4}")
	private String  inp_amb_service_name_4; 
	
	@Value("${inp_amb_loca_jursd_1}")
	private String  inp_amb_loca_jursd_1; 
	
	@Value("${inp_amb_loca_jursd_2}")
	private String  inp_amb_loca_jursd_2; 
	
	@Value("${inp_amb_loca_jursd_3}")
	private String  inp_amb_loca_jursd_3; 
	
	@Value("${inp_amb_loca_jursd_4}")
	private String  inp_amb_loca_jursd_4; 
	
	@Value("${inp_amb_lic_num_1}")
	private String  inp_amb_lic_num_1; 
	
	@Value("${inp_amb_lic_num_2}")
	private String  inp_amb_lic_num_2; 
	
	@Value("${inp_amb_lic_num_3}")
	private String  inp_amb_lic_num_3; 
	
	@Value("${inp_amb_lic_num_4}")
	private String  inp_amb_lic_num_4; 
	
	@Value("${inp_amb_person_name_1}")
	private String  inp_amb_person_name_1; 
	
	@Value("${inp_amb_person_name_2}")
	private String  inp_amb_person_name_2; 
	
	@Value("${inp_amb_person_name_3}")
	private String  inp_amb_person_name_3; 
	
	@Value("${inp_amb_person_name_4}")
	private String  inp_amb_person_name_4; 
	
	@Value("${inp_amb_cont_phone_1}")
	private String  inp_amb_cont_phone_1; 
	
	@Value("${inp_amb_cont_phone_2}")
	private String  inp_amb_cont_phone_2; 
	
	@Value("${inp_amb_cont_phone_3}")
	private String  inp_amb_cont_phone_3; 
	
	@Value("${inp_amb_cont_phone_4}")
	private String  inp_amb_cont_phone_4;
		
	@Value("${inp_amb_cont_email_1}")
	private String  inp_amb_cont_email_1; 
	
	@Value("${inp_amb_cont_email_2}")
	private String  inp_amb_cont_email_2;
	
	@Value("${inp_amb_cont_email_3}")
	private String  inp_amb_cont_email_3;
	
	@Value("${inp_amb_cont_email_4}")
	private String  inp_amb_cont_email_4;
	

	@Value("${inp_attest_sign_1}")
	private String  inp_attest_sign_1; 
	
	@Value("${inp_attest_sign_person_date_1}")
	private String  inp_attest_sign_person_date_1; 
	
	@Value("${inp_attest_sign_person_name_1}")
	private String  inp_attest_sign_person_name_1; 
	
	@Value("${inp_attest_sign_person_title_1}")
	private String  inp_attest_sign_person_title_1; 
	
	@Value("${inp_attest_sign_2}")
	private String  inp_attest_sign_2; 
	
	@Value("${inp_attest_sign_person_date_2}")
	private String  inp_attest_sign_person_date_2; 
	
	@Value("${inp_attest_sign_person_name_2}")
	private String  inp_attest_sign_person_name_2; 
	
	@Value("${inp_attest_sign_person_title_2}")
	private String  inp_attest_sign_person_title_2; 
	
	@Value("${inp_attest_sign_3}")
	private String  inp_attest_sign_3; 
	
	@Value("${inp_attest_sign_person_date_3}")
	private String  inp_attest_sign_person_date_3; 
	
	@Value("${inp_attest_sign_person_name_3}")
	private String  inp_attest_sign_person_name_3; 
	
	@Value("${inp_attest_sign_person_title_3}")
	private String  inp_attest_sign_person_title_3; 
	
	@Value("${inp_attest_sign_4}")
	private String  inp_attest_sign_4; 
	
	@Value("${inp_attest_sign_person_date_4}")
	private String  inp_attest_sign_person_date_4; 

	@Value("${inp_attest_sign_person_name_4}")
	private String  inp_attest_sign_person_name_4; 

	@Value("${inp_attest_sign_person_title_4}")
	private String  inp_attest_sign_person_title_4; 

	@Value("${inp_attest_sign_5}")
	private String  inp_attest_sign_5; 
	
	@Value("${inp_attest_sign_person_date_5}")
	private String  inp_attest_sign_person_date_5; 

	@Value("${inp_attest_sign_person_name_5}")
	private String  inp_attest_sign_person_name_5; 
	
	@Value("${inp_attest_sign_6}")
	private String  inp_attest_sign_6; 
	
	@Value("${inp_attest_sign_person_date_6}")
	private String  inp_attest_sign_person_date_6; 
	
	@Value("${inp_attest_sign_person_name_6}")
	private String  inp_attest_sign_person_name_6; 
	
	@Value("${inp_attest_sign_person_title_6}")
	private String  inp_attest_sign_person_title_6; 
	
	@Value("${inp_sec2_text}")
	private String  inp_sec2_text; 
	
	@Value("${inp_sec4_attest_sign_1}")
	private String  inp_sec4_attest_sign_1; 
	
	@Value("${inp_sec4_attest_sign_person_date_1}")
	private String  inp_sec4_attest_sign_person_date_1; 
	
	@Value("${inp_sec4_attest_sign_person_name_1}")
	private String  inp_sec4_attest_sign_person_name_1; 
	
	@Value("${inp_sec4_attest_sign_person_title_1}")
	private String  inp_sec4_attest_sign_person_title_1; 
	
	@Value("${inp_sec4_attest_sign_2}")
	private String  inp_sec4_attest_sign_2; 
	
	@Value("${inp_sec4_attest_sign_person_date_2}")
	private String  inp_sec4_attest_sign_person_date_2; 
	
	@Value("${inp_sec4_attest_sign_person_name_2}")
	private String  inp_sec4_attest_sign_person_name_2; 
		
	@Value("${inp_sec4_attest_sign_person_title_2}")
	private String  inp_sec4_attest_sign_person_title_2; 
	
	@Value("${inp_app_file_date_time_ro}")
	private String  inp_app_file_date_time;
	

	/**
	 * @return the inp_app_pdf_application_number
	 */
	public String getInp_app_pdf_application_number() {
		return inp_app_pdf_application_number;
	}

	/**
	 * @param inp_app_pdf_application_number the inp_app_pdf_application_number to set
	 */
	public void setInp_app_pdf_application_number(String pdf_application_number) {
		this.inp_app_pdf_application_number = pdf_application_number;
	}

	/**
	 * @return the inp_app_category
	 */
	public String getInp_app_category() {
		return inp_app_category;
	}

	/**
	 * @param inp_app_category the inp_app_category to set
	 */
	public void setInp_app_category(String inp_app_category) {
		this.inp_app_category = inp_app_category;
	}

	/**
	 * @return the inp_evidence_support
	 */
	public String getInp_evidence_support() {
		return inp_evidence_support;
	}

	/**
	 * @param inp_evidence_support the inp_evidence_support to set
	 */
	public void setInp_evidence_support(String inp_evidence_support) {
		this.inp_evidence_support = inp_evidence_support;
	}

	/**
	 * @return the inp_org_name
	 */
	public String getInp_org_name() {
		return inp_org_name;
	}

	/**
	 * @param inp_org_name the inp_org_name to set
	 */
	public void setInp_org_name(String inp_org_name) {
		this.inp_org_name = inp_org_name;
	}

	/**
	 * @return the inp_app_resubmission
	 */
	public String getInp_app_resubmission() {
		return inp_app_resubmission;
	}

	/**
	 * @param inp_app_resubmission the inp_app_resubmission to set
	 */
	public void setInp_app_resubmission(String inp_app_resubmission) {
		this.inp_app_resubmission = inp_app_resubmission;
	}

	/**
	 * @return the inp_date_submission
	 */
	public String getInp_date_submission() {
		return inp_date_submission;
	}

	/**
	 * @param inp_date_submission the inp_date_submission to set
	 */
	public void setInp_date_submission(String inp_date_submission) {
		this.inp_date_submission = inp_date_submission;
	}

	/**
	 * @return the inp_org_address_street
	 */
	public String getInp_org_address_street() {
		return inp_org_address_street;
	}

	/**
	 * @param inp_org_address_street the inp_org_address_street to set
	 */
	public void setInp_org_address_street(String inp_org_address_street) {
		this.inp_org_address_street = inp_org_address_street;
	}

	/**
	 * @return the inp_org_address_city
	 */
	public String getInp_org_address_city() {
		return inp_org_address_city;
	}

	/**
	 * @param inp_org_address_city the inp_org_address_city to set
	 */
	public void setInp_org_address_city(String inp_org_address_city) {
		this.inp_org_address_city = inp_org_address_city;
	}

	/**
	 * @return the inp_org_address_state
	 */
	public String getInp_org_address_state() {
		return inp_org_address_state;
	}

	/**
	 * @param inp_org_address_state the inp_org_address_state to set
	 */
	public void setInp_org_address_state(String inp_org_address_state) {
		this.inp_org_address_state = inp_org_address_state;
	}

	/**
	 * @return the inp_org_address_zip
	 */
	public String getInp_org_address_zip() {
		return inp_org_address_zip;
	}

	/**
	 * @param inp_org_address_zip the inp_org_address_zip to set
	 */
	public void setInp_org_address_zip(String inp_org_address_zip) {
		this.inp_org_address_zip = inp_org_address_zip;
	}

	/**
	 * @return the inp_sec1_person_name
	 */
	public String getInp_sec1_person_name() {
		return inp_sec1_person_name;
	}

	/**
	 * @param inp_sec1_person_name the inp_sec1_person_name to set
	 */
	public void setInp_sec1_person_name(String inp_sec1_person_name) {
		this.inp_sec1_person_name = inp_sec1_person_name;
	}

	/**
	 * @return the inp_sec1_person_title
	 */
	public String getInp_sec1_person_title() {
		return inp_sec1_person_title;
	}

	/**
	 * @param inp_sec1_person_title the inp_sec1_person_title to set
	 */
	public void setInp_sec1_person_title(String inp_sec1_person_title) {
		this.inp_sec1_person_title = inp_sec1_person_title;
	}

	/**
	 * @return the inp_sec1_person_phone
	 */
	public String getInp_sec1_person_phone() {
		return inp_sec1_person_phone;
	}

	/**
	 * @param inp_sec1_person_phone the inp_sec1_person_phone to set
	 */
	public void setInp_sec1_person_phone(String inp_sec1_person_phone) {
		this.inp_sec1_person_phone = inp_sec1_person_phone;
	}

	/**
	 * @return the inp_sec1_person_email
	 */
	public String getInp_sec1_person_email() {
		return inp_sec1_person_email;
	}

	/**
	 * @param inp_sec1_person_email the inp_sec1_person_email to set
	 */
	public void setInp_sec1_person_email(String inp_sec1_person_email) {
		this.inp_sec1_person_email = inp_sec1_person_email;
	}

	/**
	 * @return the inp_sec1_sign_person_name
	 */
	public String getInp_sec1_sign_person_name() {
		return inp_sec1_sign_person_name;
	}

	/**
	 * @param inp_sec1_sign_person_name the inp_sec1_sign_person_name to set
	 */
	public void setInp_sec1_sign_person_name(String inp_sec1_sign_person_name) {
		this.inp_sec1_sign_person_name = inp_sec1_sign_person_name;
	}

	/**
	 * @return the inp_sec1_sign1
	 */
	public String getInp_sec1_sign1() {
		return inp_sec1_sign1;
	}

	/**
	 * @param inp_sec1_sign1 the inp_sec1_sign1 to set
	 */
	public void setInp_sec1_sign1(String inp_sec1_sign1) {
		this.inp_sec1_sign1 = inp_sec1_sign1;
	}

	/**
	 * @return the inp_sec1_person_cli_name
	 */
	public String getInp_sec1_person_cli_name() {
		return inp_sec1_person_cli_name;
	}

	/**
	 * @param inp_sec1_person_cli_name the inp_sec1_person_cli_name to set
	 */
	public void setInp_sec1_person_cli_name(String inp_sec1_person_cli_name) {
		this.inp_sec1_person_cli_name = inp_sec1_person_cli_name;
	}

	/**
	 * @return the inp_sec1_person_cli_title
	 */
	public String getInp_sec1_person_cli_title() {
		return inp_sec1_person_cli_title;
	}

	/**
	 * @param inp_sec1_person_cli_title the inp_sec1_person_cli_title to set
	 */
	public void setInp_sec1_person_cli_title(String inp_sec1_person_cli_title) {
		this.inp_sec1_person_cli_title = inp_sec1_person_cli_title;
	}

	/**
	 * @return the inp_sec1_person_cli_phone
	 */
	public String getInp_sec1_person_cli_phone() {
		return inp_sec1_person_cli_phone;
	}

	/**
	 * @param inp_sec1_person_cli_phone the inp_sec1_person_cli_phone to set
	 */
	public void setInp_sec1_person_cli_phone(String inp_sec1_person_cli_phone) {
		this.inp_sec1_person_cli_phone = inp_sec1_person_cli_phone;
	}

	/**
	 * @return the inp_sec1_person_cli_email
	 */
	public String getInp_sec1_person_cli_email() {
		return inp_sec1_person_cli_email;
	}

	/**
	 * @param inp_sec1_person_cli_email the inp_sec1_person_cli_email to set
	 */
	public void setInp_sec1_person_cli_email(String inp_sec1_person_cli_email) {
		this.inp_sec1_person_cli_email = inp_sec1_person_cli_email;
	}

	/**
	 * @return the inp_sec1_prog_start_date
	 */
	public String getInp_sec1_prog_start_date() {
		return inp_sec1_prog_start_date;
	}

	/**
	 * @param inp_sec1_prog_start_date the inp_sec1_prog_start_date to set
	 */
	public void setInp_sec1_prog_start_date(String inp_sec1_prog_start_date) {
		this.inp_sec1_prog_start_date = inp_sec1_prog_start_date;
	}

	/**
	 * @return the inp_num_ems
	 */
	public String getInp_num_ems() {
		return inp_num_ems;
	}

	/**
	 * @param inp_num_ems the inp_num_ems to set
	 */
	public void setInp_num_ems(String inp_num_ems) {
		this.inp_num_ems = inp_num_ems;
	}

	/**
	 * @return the inp_num_emt
	 */
	public String getInp_num_emt() {
		return inp_num_emt;
	}

	/**
	 * @param inp_num_emt the inp_num_emt to set
	 */
	public void setInp_num_emt(String inp_num_emt) {
		this.inp_num_emt = inp_num_emt;
	}

	/**
	 * @return the inp_health_care_org
	 */
	public String getInp_health_care_org() {
		return inp_health_care_org;
	}

	/**
	 * @param inp_health_care_org the inp_health_care_org to set
	 */
	public void setInp_health_care_org(String inp_health_care_org) {
		this.inp_health_care_org = inp_health_care_org;
	}

	/**
	 * @return the inp_prog_fnd_agency
	 */
	public String getInp_prog_fnd_agency() {
		return inp_prog_fnd_agency;
	}

	/**
	 * @param inp_prog_fnd_agency the inp_prog_fnd_agency to set
	 */
	public void setInp_prog_fnd_agency(String inp_prog_fnd_agency) {
		this.inp_prog_fnd_agency = inp_prog_fnd_agency;
	}

	/**
	 * @return the inp_prog_fnd_grant
	 */
	public String getInp_prog_fnd_grant() {
		return inp_prog_fnd_grant;
	}

	/**
	 * @param inp_prog_fnd_grant the inp_prog_fnd_grant to set
	 */
	public void setInp_prog_fnd_grant(String inp_prog_fnd_grant) {
		this.inp_prog_fnd_grant = inp_prog_fnd_grant;
	}

	/**
	 * @return the inp_prog_fnd_party
	 */
	public String getInp_prog_fnd_party() {
		return inp_prog_fnd_party;
	}

	/**
	 * @param inp_prog_fnd_party the inp_prog_fnd_party to set
	 */
	public void setInp_prog_fnd_party(String inp_prog_fnd_party) {
		this.inp_prog_fnd_party = inp_prog_fnd_party;
	}

	/**
	 * @return the inp_prog_fnd_other
	 */
	public String getInp_prog_fnd_other() {
		return inp_prog_fnd_other;
	}

	/**
	 * @param inp_prog_fnd_other the inp_prog_fnd_other to set
	 */
	public void setInp_prog_fnd_other(String inp_prog_fnd_other) {
		this.inp_prog_fnd_other = inp_prog_fnd_other;
	}

	/**
	 * @return the inp_prog_fnd_other_descr
	 */
	public String getInp_prog_fnd_other_descr() {
		return inp_prog_fnd_other_descr;
	}

	/**
	 * @param inp_prog_fnd_other_descr the inp_prog_fnd_other_descr to set
	 */
	public void setInp_prog_fnd_other_descr(String inp_prog_fnd_other_descr) {
		this.inp_prog_fnd_other_descr = inp_prog_fnd_other_descr;
	}

	/**
	 * @return the inp_amb_service_name_1
	 */
	public String getInp_amb_service_name_1() {
		return inp_amb_service_name_1;
	}

	/**
	 * @param inp_amb_service_name_1 the inp_amb_service_name_1 to set
	 */
	public void setInp_amb_service_name_1(String inp_amb_service_name_1) {
		this.inp_amb_service_name_1 = inp_amb_service_name_1;
	}

	/**
	 * @return the inp_amb_service_name_2
	 */
	public String getInp_amb_service_name_2() {
		return inp_amb_service_name_2;
	}

	/**
	 * @param inp_amb_service_name_2 the inp_amb_service_name_2 to set
	 */
	public void setInp_amb_service_name_2(String inp_amb_service_name_2) {
		this.inp_amb_service_name_2 = inp_amb_service_name_2;
	}

	/**
	 * @return the inp_amb_service_name_3
	 */
	public String getInp_amb_service_name_3() {
		return inp_amb_service_name_3;
	}

	/**
	 * @param inp_amb_service_name_3 the inp_amb_service_name_3 to set
	 */
	public void setInp_amb_service_name_3(String inp_amb_service_name_3) {
		this.inp_amb_service_name_3 = inp_amb_service_name_3;
	}

	/**
	 * @return the inp_amb_service_name_4
	 */
	public String getInp_amb_service_name_4() {
		return inp_amb_service_name_4;
	}

	/**
	 * @param inp_amb_service_name_4 the inp_amb_service_name_4 to set
	 */
	public void setInp_amb_service_name_4(String inp_amb_service_name_4) {
		this.inp_amb_service_name_4 = inp_amb_service_name_4;
	}

	/**
	 * @return the inp_amb_loca_jursd_1
	 */
	public String getInp_amb_loca_jursd_1() {
		return inp_amb_loca_jursd_1;
	}

	/**
	 * @param inp_amb_loca_jursd_1 the inp_amb_loca_jursd_1 to set
	 */
	public void setInp_amb_loca_jursd_1(String inp_amb_loca_jursd_1) {
		this.inp_amb_loca_jursd_1 = inp_amb_loca_jursd_1;
	}

	/**
	 * @return the inp_amb_loca_jursd_2
	 */
	public String getInp_amb_loca_jursd_2() {
		return inp_amb_loca_jursd_2;
	}

	/**
	 * @param inp_amb_loca_jursd_2 the inp_amb_loca_jursd_2 to set
	 */
	public void setInp_amb_loca_jursd_2(String inp_amb_loca_jursd_2) {
		this.inp_amb_loca_jursd_2 = inp_amb_loca_jursd_2;
	}

	/**
	 * @return the inp_amb_loca_jursd_3
	 */
	public String getInp_amb_loca_jursd_3() {
		return inp_amb_loca_jursd_3;
	}

	/**
	 * @param inp_amb_loca_jursd_3 the inp_amb_loca_jursd_3 to set
	 */
	public void setInp_amb_loca_jursd_3(String inp_amb_loca_jursd_3) {
		this.inp_amb_loca_jursd_3 = inp_amb_loca_jursd_3;
	}

	/**
	 * @return the inp_amb_loca_jursd_4
	 */
	public String getInp_amb_loca_jursd_4() {
		return inp_amb_loca_jursd_4;
	}

	/**
	 * @param inp_amb_loca_jursd_4 the inp_amb_loca_jursd_4 to set
	 */
	public void setInp_amb_loca_jursd_4(String inp_amb_loca_jursd_4) {
		this.inp_amb_loca_jursd_4 = inp_amb_loca_jursd_4;
	}

	/**
	 * @return the inp_amb_lic_num_1
	 */
	public String getInp_amb_lic_num_1() {
		return inp_amb_lic_num_1;
	}

	/**
	 * @param inp_amb_lic_num_1 the inp_amb_lic_num_1 to set
	 */
	public void setInp_amb_lic_num_1(String inp_amb_lic_num_1) {
		this.inp_amb_lic_num_1 = inp_amb_lic_num_1;
	}

	/**
	 * @return the inp_amb_lic_num_2
	 */
	public String getInp_amb_lic_num_2() {
		return inp_amb_lic_num_2;
	}

	/**
	 * @param inp_amb_lic_num_2 the inp_amb_lic_num_2 to set
	 */
	public void setInp_amb_lic_num_2(String inp_amb_lic_num_2) {
		this.inp_amb_lic_num_2 = inp_amb_lic_num_2;
	}

	/**
	 * @return the inp_amb_lic_num_3
	 */
	public String getInp_amb_lic_num_3() {
		return inp_amb_lic_num_3;
	}

	/**
	 * @param inp_amb_lic_num_3 the inp_amb_lic_num_3 to set
	 */
	public void setInp_amb_lic_num_3(String inp_amb_lic_num_3) {
		this.inp_amb_lic_num_3 = inp_amb_lic_num_3;
	}

	/**
	 * @return the inp_amb_lic_num_4
	 */
	public String getInp_amb_lic_num_4() {
		return inp_amb_lic_num_4;
	}

	/**
	 * @param inp_amb_lic_num_4 the inp_amb_lic_num_4 to set
	 */
	public void setInp_amb_lic_num_4(String inp_amb_lic_num_4) {
		this.inp_amb_lic_num_4 = inp_amb_lic_num_4;
	}

	/**
	 * @return the inp_amb_person_name_1
	 */
	public String getInp_amb_person_name_1() {
		return inp_amb_person_name_1;
	}

	/**
	 * @param inp_amb_person_name_1 the inp_amb_person_name_1 to set
	 */
	public void setInp_amb_person_name_1(String inp_amb_person_name_1) {
		this.inp_amb_person_name_1 = inp_amb_person_name_1;
	}

	/**
	 * @return the inp_amb_person_name_2
	 */
	public String getInp_amb_person_name_2() {
		return inp_amb_person_name_2;
	}

	/**
	 * @param inp_amb_person_name_2 the inp_amb_person_name_2 to set
	 */
	public void setInp_amb_person_name_2(String inp_amb_person_name_2) {
		this.inp_amb_person_name_2 = inp_amb_person_name_2;
	}

	/**
	 * @return the inp_amb_person_name_3
	 */
	public String getInp_amb_person_name_3() {
		return inp_amb_person_name_3;
	}

	/**
	 * @param inp_amb_person_name_3 the inp_amb_person_name_3 to set
	 */
	public void setInp_amb_person_name_3(String inp_amb_person_name_3) {
		this.inp_amb_person_name_3 = inp_amb_person_name_3;
	}

	/**
	 * @return the inp_amb_person_name_4
	 */
	public String getInp_amb_person_name_4() {
		return inp_amb_person_name_4;
	}

	/**
	 * @param inp_amb_person_name_4 the inp_amb_person_name_4 to set
	 */
	public void setInp_amb_person_name_4(String inp_amb_person_name_4) {
		this.inp_amb_person_name_4 = inp_amb_person_name_4;
	}

	/**
	 * @return the inp_amb_cont_phone_1
	 */
	public String getInp_amb_cont_phone_1() {
		return inp_amb_cont_phone_1;
	}

	/**
	 * @param inp_amb_cont_phone_1 the inp_amb_cont_phone_1 to set
	 */
	public void setInp_amb_cont_phone_1(String inp_amb_cont_phone_1) {
		this.inp_amb_cont_phone_1 = inp_amb_cont_phone_1;
	}

	/**
	 * @return the inp_amb_cont_phone_2
	 */
	public String getInp_amb_cont_phone_2() {
		return inp_amb_cont_phone_2;
	}

	/**
	 * @param inp_amb_cont_phone_2 the inp_amb_cont_phone_2 to set
	 */
	public void setInp_amb_cont_phone_2(String inp_amb_cont_phone_2) {
		this.inp_amb_cont_phone_2 = inp_amb_cont_phone_2;
	}

	/**
	 * @return the inp_amb_cont_phone_3
	 */
	public String getInp_amb_cont_phone_3() {
		return inp_amb_cont_phone_3;
	}

	/**
	 * @param inp_amb_cont_phone_3 the inp_amb_cont_phone_3 to set
	 */
	public void setInp_amb_cont_phone_3(String inp_amb_cont_phone_3) {
		this.inp_amb_cont_phone_3 = inp_amb_cont_phone_3;
	}

	/**
	 * @return the inp_amb_cont_phone_4
	 */
	public String getInp_amb_cont_phone_4() {
		return inp_amb_cont_phone_4;
	}

	/**
	 * @param inp_amb_cont_phone_4 the inp_amb_cont_phone_4 to set
	 */
	public void setInp_amb_cont_phone_4(String inp_amb_cont_phone_4) {
		this.inp_amb_cont_phone_4 = inp_amb_cont_phone_4;
	}

	/**
	 * @return the inp_attest_sign_1
	 */
	public String getInp_attest_sign_1() {
		return inp_attest_sign_1;
	}

	/**
	 * @param inp_attest_sign_1 the inp_attest_sign_1 to set
	 */
	public void setInp_attest_sign_1(String inp_attest_sign_1) {
		this.inp_attest_sign_1 = inp_attest_sign_1;
	}

	/**
	 * @return the inp_attest_sign_person_date_1
	 */
	public String getInp_attest_sign_person_date_1() {
		return inp_attest_sign_person_date_1;
	}

	/**
	 * @param inp_attest_sign_person_date_1 the inp_attest_sign_person_date_1 to set
	 */
	public void setInp_attest_sign_person_date_1(String inp_attest_sign_person_date_1) {
		this.inp_attest_sign_person_date_1 = inp_attest_sign_person_date_1;
	}

	/**
	 * @return the inp_attest_sign_person_name_1
	 */
	public String getInp_attest_sign_person_name_1() {
		return inp_attest_sign_person_name_1;
	}

	/**
	 * @param inp_attest_sign_person_name_1 the inp_attest_sign_person_name_1 to set
	 */
	public void setInp_attest_sign_person_name_1(String inp_attest_sign_person_name_1) {
		this.inp_attest_sign_person_name_1 = inp_attest_sign_person_name_1;
	}

	/**
	 * @return the inp_attest_sign_person_title_1
	 */
	public String getInp_attest_sign_person_title_1() {
		return inp_attest_sign_person_title_1;
	}

	/**
	 * @param inp_attest_sign_person_title_1 the inp_attest_sign_person_title_1 to set
	 */
	public void setInp_attest_sign_person_title_1(String inp_attest_sign_person_title_1) {
		this.inp_attest_sign_person_title_1 = inp_attest_sign_person_title_1;
	}

	/**
	 * @return the inp_attest_sign_2
	 */
	public String getInp_attest_sign_2() {
		return inp_attest_sign_2;
	}

	/**
	 * @param inp_attest_sign_2 the inp_attest_sign_2 to set
	 */
	public void setInp_attest_sign_2(String inp_attest_sign_2) {
		this.inp_attest_sign_2 = inp_attest_sign_2;
	}

	/**
	 * @return the inp_attest_sign_person_date_2
	 */
	public String getInp_attest_sign_person_date_2() {
		return inp_attest_sign_person_date_2;
	}

	/**
	 * @param inp_attest_sign_person_date_2 the inp_attest_sign_person_date_2 to set
	 */
	public void setInp_attest_sign_person_date_2(String inp_attest_sign_person_date_2) {
		this.inp_attest_sign_person_date_2 = inp_attest_sign_person_date_2;
	}

	/**
	 * @return the inp_attest_sign_person_name_2
	 */
	public String getInp_attest_sign_person_name_2() {
		return inp_attest_sign_person_name_2;
	}

	/**
	 * @param inp_attest_sign_person_name_2 the inp_attest_sign_person_name_2 to set
	 */
	public void setInp_attest_sign_person_name_2(String inp_attest_sign_person_name_2) {
		this.inp_attest_sign_person_name_2 = inp_attest_sign_person_name_2;
	}

	/**
	 * @return the inp_attest_sign_person_title_2
	 */
	public String getInp_attest_sign_person_title_2() {
		return inp_attest_sign_person_title_2;
	}

	/**
	 * @param inp_attest_sign_person_title_2 the inp_attest_sign_person_title_2 to set
	 */
	public void setInp_attest_sign_person_title_2(String inp_attest_sign_person_title_2) {
		this.inp_attest_sign_person_title_2 = inp_attest_sign_person_title_2;
	}

	/**
	 * @return the inp_attest_sign_3
	 */
	public String getInp_attest_sign_3() {
		return inp_attest_sign_3;
	}

	/**
	 * @param inp_attest_sign_3 the inp_attest_sign_3 to set
	 */
	public void setInp_attest_sign_3(String inp_attest_sign_3) {
		this.inp_attest_sign_3 = inp_attest_sign_3;
	}

	/**
	 * @return the inp_attest_sign_person_date_3
	 */
	public String getInp_attest_sign_person_date_3() {
		return inp_attest_sign_person_date_3;
	}

	/**
	 * @param inp_attest_sign_person_date_3 the inp_attest_sign_person_date_3 to set
	 */
	public void setInp_attest_sign_person_date_3(String inp_attest_sign_person_date_3) {
		this.inp_attest_sign_person_date_3 = inp_attest_sign_person_date_3;
	}

	/**
	 * @return the inp_attest_sign_person_name_3
	 */
	public String getInp_attest_sign_person_name_3() {
		return inp_attest_sign_person_name_3;
	}

	/**
	 * @param inp_attest_sign_person_name_3 the inp_attest_sign_person_name_3 to set
	 */
	public void setInp_attest_sign_person_name_3(String inp_attest_sign_person_name_3) {
		this.inp_attest_sign_person_name_3 = inp_attest_sign_person_name_3;
	}

	/**
	 * @return the inp_attest_sign_person_title_3
	 */
	public String getInp_attest_sign_person_title_3() {
		return inp_attest_sign_person_title_3;
	}

	/**
	 * @param inp_attest_sign_person_title_3 the inp_attest_sign_person_title_3 to set
	 */
	public void setInp_attest_sign_person_title_3(String inp_attest_sign_person_title_3) {
		this.inp_attest_sign_person_title_3 = inp_attest_sign_person_title_3;
	}

	/**
	 * @return the inp_attest_sign_4
	 */
	public String getInp_attest_sign_4() {
		return inp_attest_sign_4;
	}

	/**
	 * @param inp_attest_sign_4 the inp_attest_sign_4 to set
	 */
	public void setInp_attest_sign_4(String inp_attest_sign_4) {
		this.inp_attest_sign_4 = inp_attest_sign_4;
	}

	/**
	 * @return the inp_attest_sign_person_date_4
	 */
	public String getInp_attest_sign_person_date_4() {
		return inp_attest_sign_person_date_4;
	}

	/**
	 * @param inp_attest_sign_person_date_4 the inp_attest_sign_person_date_4 to set
	 */
	public void setInp_attest_sign_person_date_4(String inp_attest_sign_person_date_4) {
		this.inp_attest_sign_person_date_4 = inp_attest_sign_person_date_4;
	}

	/**
	 * @return the inp_attest_sign_person_name_4
	 */
	public String getInp_attest_sign_person_name_4() {
		return inp_attest_sign_person_name_4;
	}

	/**
	 * @param inp_attest_sign_person_name_4 the inp_attest_sign_person_name_4 to set
	 */
	public void setInp_attest_sign_person_name_4(String inp_attest_sign_person_name_4) {
		this.inp_attest_sign_person_name_4 = inp_attest_sign_person_name_4;
	}

	/**
	 * @return the inp_attest_sign_person_title_4
	 */
	public String getInp_attest_sign_person_title_4() {
		return inp_attest_sign_person_title_4;
	}

	/**
	 * @param inp_attest_sign_person_title_4 the inp_attest_sign_person_title_4 to set
	 */
	public void setInp_attest_sign_person_title_4(String inp_attest_sign_person_title_4) {
		this.inp_attest_sign_person_title_4 = inp_attest_sign_person_title_4;
	}

	/**
	 * @return the inp_attest_sign_5
	 */
	public String getInp_attest_sign_5() {
		return inp_attest_sign_5;
	}

	/**
	 * @param inp_attest_sign_5 the inp_attest_sign_5 to set
	 */
	public void setInp_attest_sign_5(String inp_attest_sign_5) {
		this.inp_attest_sign_5 = inp_attest_sign_5;
	}

	/**
	 * @return the inp_attest_sign_person_date_5
	 */
	public String getInp_attest_sign_person_date_5() {
		return inp_attest_sign_person_date_5;
	}

	/**
	 * @param inp_attest_sign_person_date_5 the inp_attest_sign_person_date_5 to set
	 */
	public void setInp_attest_sign_person_date_5(String inp_attest_sign_person_date_5) {
		this.inp_attest_sign_person_date_5 = inp_attest_sign_person_date_5;
	}

	/**
	 * @return the inp_attest_sign_person_name_5
	 */
	public String getInp_attest_sign_person_name_5() {
		return inp_attest_sign_person_name_5;
	}

	/**
	 * @param inp_attest_sign_person_name_5 the inp_attest_sign_person_name_5 to set
	 */
	public void setInp_attest_sign_person_name_5(String inp_attest_sign_person_name_5) {
		this.inp_attest_sign_person_name_5 = inp_attest_sign_person_name_5;
	}

	/**
	 * @return the inp_attest_sign_6
	 */
	public String getInp_attest_sign_6() {
		return inp_attest_sign_6;
	}

	/**
	 * @param inp_attest_sign_6 the inp_attest_sign_6 to set
	 */
	public void setInp_attest_sign_6(String inp_attest_sign_6) {
		this.inp_attest_sign_6 = inp_attest_sign_6;
	}

	/**
	 * @return the inp_attest_sign_person_date_6
	 */
	public String getInp_attest_sign_person_date_6() {
		return inp_attest_sign_person_date_6;
	}

	/**
	 * @param inp_attest_sign_person_date_6 the inp_attest_sign_person_date_6 to set
	 */
	public void setInp_attest_sign_person_date_6(String inp_attest_sign_person_date_6) {
		this.inp_attest_sign_person_date_6 = inp_attest_sign_person_date_6;
	}

	/**
	 * @return the inp_attest_sign_person_name_6
	 */
	public String getInp_attest_sign_person_name_6() {
		return inp_attest_sign_person_name_6;
	}

	/**
	 * @param inp_attest_sign_person_name_6 the inp_attest_sign_person_name_6 to set
	 */
	public void setInp_attest_sign_person_name_6(String inp_attest_sign_person_name_6) {
		this.inp_attest_sign_person_name_6 = inp_attest_sign_person_name_6;
	}

	/**
	 * @return the inp_attest_sign_person_title_6
	 */
	public String getInp_attest_sign_person_title_6() {
		return inp_attest_sign_person_title_6;
	}

	/**
	 * @param inp_attest_sign_person_title_6 the inp_attest_sign_person_title_6 to set
	 */
	public void setInp_attest_sign_person_title_6(String inp_attest_sign_person_title_6) {
		this.inp_attest_sign_person_title_6 = inp_attest_sign_person_title_6;
	}

	/**
	 * @return the inp_sec2_text
	 */
	public String getInp_sec2_text() {
		return inp_sec2_text;
	}

	/**
	 * @param inp_sec2_text the inp_sec2_text to set
	 */
	public void setInp_sec2_text(String inp_sec2_text) {
		this.inp_sec2_text = inp_sec2_text;
	}

	/**
	 * @return the inp_sec4_attest_sign_1
	 */
	public String getInp_sec4_attest_sign_1() {
		return inp_sec4_attest_sign_1;
	}

	/**
	 * @param inp_sec4_attest_sign_1 the inp_sec4_attest_sign_1 to set
	 */
	public void setInp_sec4_attest_sign_1(String inp_sec4_attest_sign_1) {
		this.inp_sec4_attest_sign_1 = inp_sec4_attest_sign_1;
	}

	/**
	 * @return the inp_sec4_attest_sign_person_date_1
	 */
	public String getInp_sec4_attest_sign_person_date_1() {
		return inp_sec4_attest_sign_person_date_1;
	}

	/**
	 * @param inp_sec4_attest_sign_person_date_1 the inp_sec4_attest_sign_person_date_1 to set
	 */
	public void setInp_sec4_attest_sign_person_date_1(String inp_sec4_attest_sign_person_date_1) {
		this.inp_sec4_attest_sign_person_date_1 = inp_sec4_attest_sign_person_date_1;
	}

	/**
	 * @return the inp_sec4_attest_sign_person_name_1
	 */
	public String getInp_sec4_attest_sign_person_name_1() {
		return inp_sec4_attest_sign_person_name_1;
	}

	/**
	 * @param inp_sec4_attest_sign_person_name_1 the inp_sec4_attest_sign_person_name_1 to set
	 */
	public void setInp_sec4_attest_sign_person_name_1(String inp_sec4_attest_sign_person_name_1) {
		this.inp_sec4_attest_sign_person_name_1 = inp_sec4_attest_sign_person_name_1;
	}

	/**
	 * @return the inp_sec4_attest_sign_person_title_1
	 */
	public String getInp_sec4_attest_sign_person_title_1() {
		return inp_sec4_attest_sign_person_title_1;
	}

	/**
	 * @param inp_sec4_attest_sign_person_title_1 the inp_sec4_attest_sign_person_title_1 to set
	 */
	public void setInp_sec4_attest_sign_person_title_1(String inp_sec4_attest_sign_person_title_1) {
		this.inp_sec4_attest_sign_person_title_1 = inp_sec4_attest_sign_person_title_1;
	}

	/**
	 * @return the inp_sec4_attest_sign_2
	 */
	public String getInp_sec4_attest_sign_2() {
		return inp_sec4_attest_sign_2;
	}

	/**
	 * @param inp_sec4_attest_sign_2 the inp_sec4_attest_sign_2 to set
	 */
	public void setInp_sec4_attest_sign_2(String inp_sec4_attest_sign_2) {
		this.inp_sec4_attest_sign_2 = inp_sec4_attest_sign_2;
	}

	/**
	 * @return the inp_sec4_attest_sign_person_date_2
	 */
	public String getInp_sec4_attest_sign_person_date_2() {
		return inp_sec4_attest_sign_person_date_2;
	}

	/**
	 * @param inp_sec4_attest_sign_person_date_2 the inp_sec4_attest_sign_person_date_2 to set
	 */
	public void setInp_sec4_attest_sign_person_date_2(String inp_sec4_attest_sign_person_date_2) {
		this.inp_sec4_attest_sign_person_date_2 = inp_sec4_attest_sign_person_date_2;
	}

	/**
	 * @return the inp_sec4_attest_sign_person_name_2
	 */
	public String getInp_sec4_attest_sign_person_name_2() {
		return inp_sec4_attest_sign_person_name_2;
	}

	/**
	 * @param inp_sec4_attest_sign_person_name_2 the inp_sec4_attest_sign_person_name_2 to set
	 */
	public void setInp_sec4_attest_sign_person_name_2(String inp_sec4_attest_sign_person_name_2) {
		this.inp_sec4_attest_sign_person_name_2 = inp_sec4_attest_sign_person_name_2;
	}

	/**
	 * @return the inp_sec4_attest_sign_person_title_2
	 */
	public String getInp_sec4_attest_sign_person_title_2() {
		return inp_sec4_attest_sign_person_title_2;
	}

	/**
	 * @param inp_sec4_attest_sign_person_title_2 the inp_sec4_attest_sign_person_title_2 to set
	 */
	public void setInp_sec4_attest_sign_person_title_2(String inp_sec4_attest_sign_person_title_2) {
		this.inp_sec4_attest_sign_person_title_2 = inp_sec4_attest_sign_person_title_2;
	}

	/**
	 * @return the inp_app_file_date_time
	 */
	public String getInp_app_file_date_time() {
		return inp_app_file_date_time;
	}

	/**
	 * @param inp_app_file_date_time the inp_app_file_date_time to set
	 */
	public void setFile_date_time(String inp_app_file_date_time) {
		this.inp_app_file_date_time = inp_app_file_date_time;
	}

	/**
	 * @return the inp_amb_cont_email_1
	 */
	public String getInp_amb_cont_email_1() {
		return inp_amb_cont_email_1;
	}

	/**
	 * @param inp_amb_cont_email_1 the inp_amb_cont_email_1 to set
	 */
	public void setInp_amb_cont_email_1(String inp_amb_cont_email_1) {
		this.inp_amb_cont_email_1 = inp_amb_cont_email_1;
	}

	/**
	 * @return the inp_amb_cont_email_2
	 */
	public String getInp_amb_cont_email_2() {
		return inp_amb_cont_email_2;
	}

	/**
	 * @param inp_amb_cont_email_2 the inp_amb_cont_email_2 to set
	 */
	public void setInp_amb_cont_email_2(String inp_amb_cont_email_2) {
		this.inp_amb_cont_email_2 = inp_amb_cont_email_2;
	}

	/**
	 * @return the inp_amb_cont_email_3
	 */
	public String getInp_amb_cont_email_3() {
		return inp_amb_cont_email_3;
	}

	/**
	 * @param inp_amb_cont_email_3 the inp_amb_cont_email_3 to set
	 */
	public void setInp_amb_cont_email_3(String inp_amb_cont_email_3) {
		this.inp_amb_cont_email_3 = inp_amb_cont_email_3;
	}

	/**
	 * @return the inp_amb_cont_email_4
	 */
	public String getInp_amb_cont_email_4() {
		return inp_amb_cont_email_4;
	}

	/**
	 * @param inp_amb_cont_email_4 the inp_amb_cont_email_4 to set
	 */
	public void setInp_amb_cont_email_4(String inp_amb_cont_email_4) {
		this.inp_amb_cont_email_4 = inp_amb_cont_email_4;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommunityEmsPDFFieldNames [inp_app_pdf_application_number=");
		builder.append(inp_app_pdf_application_number);
		builder.append(", inp_app_category=");
		builder.append(inp_app_category);
		builder.append(", inp_evidence_support=");
		builder.append(inp_evidence_support);
		builder.append(", inp_org_name=");
		builder.append(inp_org_name);
		builder.append(", inp_date_submission=");
		builder.append(inp_date_submission);
		builder.append(", inp_org_address_street=");
		builder.append(inp_org_address_street);
		builder.append(", inp_org_address_city=");
		builder.append(inp_org_address_city);
		builder.append(", inp_org_address_zip=");
		builder.append(inp_org_address_zip);
		builder.append(", inp_sec1_person_name=");
		builder.append(inp_sec1_person_name);
		builder.append(", inp_sec1_person_title=");
		builder.append(inp_sec1_person_title);
		builder.append(", inp_sec1_person_phone=");
		builder.append(inp_sec1_person_phone);
		builder.append(", inp_sec1_person_email=");
		builder.append(inp_sec1_person_email);
		builder.append(", inp_sec1_sign_person_name=");
		builder.append(inp_sec1_sign_person_name);
		builder.append(", inp_sec1_sign1=");
		builder.append(inp_sec1_sign1);
		builder.append(", inp_sec1_person_cli_name=");
		builder.append(inp_sec1_person_cli_name);
		builder.append(", inp_sec1_person_cli_title=");
		builder.append(inp_sec1_person_cli_title);
		builder.append(", inp_sec1_person_cli_phone=");
		builder.append(inp_sec1_person_cli_phone);
		builder.append(", inp_sec1_person_cli_email=");
		builder.append(inp_sec1_person_cli_email);
		builder.append(", inp_sec1_prog_start_date=");
		builder.append(inp_sec1_prog_start_date);
		builder.append(", inp_num_ems=");
		builder.append(inp_num_ems);
		builder.append(", inp_num_emt=");
		builder.append(inp_num_emt);
		builder.append(", inp_health_care_org=");
		builder.append(inp_health_care_org);
		builder.append(", inp_prog_fnd_agency=");
		builder.append(inp_prog_fnd_agency);
		builder.append(", inp_prog_fnd_grant=");
		builder.append(inp_prog_fnd_grant);
		builder.append(", inp_prog_fnd_party=");
		builder.append(inp_prog_fnd_party);
		builder.append(", inp_prog_fnd_other=");
		builder.append(inp_prog_fnd_other);
		builder.append(", inp_prog_fnd_other_descr=");
		builder.append(inp_prog_fnd_other_descr);
		builder.append(", inp_amb_loca_jursd_1=");
		builder.append(inp_amb_loca_jursd_1);
		builder.append(", inp_amb_loca_jursd_2=");
		builder.append(inp_amb_loca_jursd_2);
		builder.append(", inp_amb_loca_jursd_3=");
		builder.append(inp_amb_loca_jursd_3);
		builder.append(", inp_amb_loca_jursd_4=");
		builder.append(inp_amb_loca_jursd_4);
		builder.append(", inp_amb_lic_num_1=");
		builder.append(inp_amb_lic_num_1);
		builder.append(", inp_amb_lic_num_2=");
		builder.append(inp_amb_lic_num_2);
		builder.append(", inp_amb_lic_num_3=");
		builder.append(inp_amb_lic_num_3);
		builder.append(", inp_amb_lic_num_4=");
		builder.append(inp_amb_lic_num_4);
		builder.append(", inp_amb_person_name_1=");
		builder.append(inp_amb_person_name_1);
		builder.append(", inp_amb_person_name_2=");
		builder.append(inp_amb_person_name_2);
		builder.append(", inp_amb_person_name_3=");
		builder.append(inp_amb_person_name_3);
		builder.append(", inp_amb_person_name_4=");
		builder.append(inp_amb_person_name_4);
		builder.append(", inp_amb_cont_phone_1=");
		builder.append(inp_amb_cont_phone_1);
		builder.append(", inp_amb_cont_phone_2=");
		builder.append(inp_amb_cont_phone_2);
		builder.append(", inp_amb_cont_phone_3=");
		builder.append(inp_amb_cont_phone_3);
		builder.append(", inp_amb_cont_phone_4=");
		builder.append(inp_amb_cont_phone_4);
		builder.append(", inp_attest_sign_1=");
		builder.append(inp_attest_sign_1);
		builder.append(", inp_attest_sign_person_date_1=");
		builder.append(inp_attest_sign_person_date_1);
		builder.append(", inp_attest_sign_person_name_1=");
		builder.append(inp_attest_sign_person_name_1);
		builder.append(", inp_attest_sign_person_title_1=");
		builder.append(inp_attest_sign_person_title_1);
		builder.append(", inp_attest_sign_2=");
		builder.append(inp_attest_sign_2);
		builder.append(", inp_attest_sign_person_date_2=");
		builder.append(inp_attest_sign_person_date_2);
		builder.append(", inp_attest_sign_person_name_2=");
		builder.append(inp_attest_sign_person_name_2);
		builder.append(", inp_attest_sign_person_title_2=");
		builder.append(inp_attest_sign_person_title_2);
		builder.append(", inp_attest_sign_3=");
		builder.append(inp_attest_sign_3);
		builder.append(", inp_attest_sign_person_date_3=");
		builder.append(inp_attest_sign_person_date_3);
		builder.append(", inp_attest_sign_person_name_3=");
		builder.append(inp_attest_sign_person_name_3);
		builder.append(", inp_attest_sign_person_title_3=");
		builder.append(inp_attest_sign_person_title_3);
		builder.append(", inp_attest_sign_4=");
		builder.append(inp_attest_sign_4);
		builder.append(", inp_attest_sign_person_date_4=");
		builder.append(inp_attest_sign_person_date_4);
		builder.append(", inp_attest_sign_person_name_4=");
		builder.append(inp_attest_sign_person_name_4);
		builder.append(", inp_attest_sign_person_title_4=");
		builder.append(inp_attest_sign_person_title_4);
		builder.append(", inp_attest_sign_5=");
		builder.append(inp_attest_sign_5);
		builder.append(", inp_attest_sign_person_date_5=");
		builder.append(inp_attest_sign_person_date_5);
		builder.append(", inp_attest_sign_person_name_5=");
		builder.append(inp_attest_sign_person_name_5);
		builder.append(", inp_attest_sign_6=");
		builder.append(inp_attest_sign_6);
		builder.append(", inp_attest_sign_person_date_6=");
		builder.append(inp_attest_sign_person_date_6);
		builder.append(", inp_attest_sign_person_name_6=");
		builder.append(inp_attest_sign_person_name_6);
		builder.append(", inp_attest_sign_person_title_6=");
		builder.append(inp_attest_sign_person_title_6);
		builder.append(", inp_sec2_text=");
		builder.append(inp_sec2_text);
		builder.append(", inp_sec4_attest_sign_1=");
		builder.append(inp_sec4_attest_sign_1);
		builder.append(", inp_sec4_attest_sign_person_date_1=");
		builder.append(inp_sec4_attest_sign_person_date_1);
		builder.append(", inp_sec4_attest_sign_person_name_1=");
		builder.append(inp_sec4_attest_sign_person_name_1);
		builder.append(", inp_sec4_attest_sign_person_title_1=");
		builder.append(inp_sec4_attest_sign_person_title_1);
		builder.append(", inp_sec4_attest_sign_2=");
		builder.append(inp_sec4_attest_sign_2);
		builder.append(", inp_sec4_attest_sign_person_date_2=");
		builder.append(inp_sec4_attest_sign_person_date_2);
		builder.append(", inp_sec4_attest_sign_person_name_2=");
		builder.append(inp_sec4_attest_sign_person_name_2);
		builder.append(", inp_sec4_attest_sign_person_title_2=");
		builder.append(inp_sec4_attest_sign_person_title_2);
		builder.append(", inp_app_file_date_time=");
		builder.append(inp_app_file_date_time);
		builder.append("]");
		return builder.toString();
	}
}