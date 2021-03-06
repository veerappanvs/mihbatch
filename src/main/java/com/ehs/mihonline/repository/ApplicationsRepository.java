/**
 * 
 */
package com.ehs.mihonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehs.mihonline.entity.Applications;

/**
 * @author vsubramaniyan
 *
 */
@Repository
public interface ApplicationsRepository extends JpaRepository<Applications, Integer> {
	
	public Applications findByUniquePDFAppId(String appId);


}
