/**
 * 
 */
package com.holmessquad.holmessquad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.holmessquad.holmessquad.entity.DoctorDetails;

/**
 * @author saravanakumar
 *
 */
@Repository
public interface DoctorDetailsRepository extends MongoRepository<DoctorDetails, String> {

}
