/**
 * 
 */
package com.holmessquad.holmessquad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.holmessquad.holmessquad.entity.PatientDetails;

/**
 * @author saravanakumar
 *
 */
@Repository
public interface PatientDetailsRepository extends MongoRepository<PatientDetails, String> {

}
