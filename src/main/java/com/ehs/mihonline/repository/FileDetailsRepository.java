package com.ehs.mihonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehs.mihonline.entity.Ambulance;
import com.ehs.mihonline.entity.FileDetails;

/**
 * @author vsubramaniyan
 *
 */
@Repository
public interface FileDetailsRepository extends JpaRepository<FileDetails, Integer>{
}

