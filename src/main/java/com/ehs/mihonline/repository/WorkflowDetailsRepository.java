package com.ehs.mihonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehs.mihonline.entity.WorkFlowDetails;

/**
 * @author vsubramaniyan
 *
 */
@Repository
public interface WorkflowDetailsRepository extends JpaRepository<WorkFlowDetails, Integer>{
}

