/**
 * 
 */
package com.holmessquad.holmessquad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.holmessquad.holmessquad.entity.HospitalDetails;

/**
 * @author saravanakumar
 *
 */
@Repository
public interface HospitalDetailsRepository extends MongoRepository<HospitalDetails, String> {

}
