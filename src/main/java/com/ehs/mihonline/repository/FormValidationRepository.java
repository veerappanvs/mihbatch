package com.ehs.mihonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehs.mihonline.entity.FormValidation;

/**
 * @author vsubramaniyan
 *
 */
@Repository
public interface FormValidationRepository extends JpaRepository<FormValidation, Integer>{
	
	//List<FormValidation> findAllByAppType(int appType);
	//List<FormValidation> findAllByAppType(int appType);
}

