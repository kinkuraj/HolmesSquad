/**
 * 
 */
package com.holmessquad.holmessquad.repository;

import com.holmessquad.holmessquad.entity.MedicalRecords;
import com.holmessquad.holmessquad.model.MedicalRecordQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Kinkuraj
 *
 */
@Repository
public interface MedicalRecordsRepository extends MongoRepository<MedicalRecords, String> {

    public List<MedicalRecords> findMedicalRecordsByHospitalIdAndPatientID(String hospitalId, String patientId);
}
