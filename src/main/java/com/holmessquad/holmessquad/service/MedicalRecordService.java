package com.holmessquad.holmessquad.service;

import com.holmessquad.holmessquad.entity.MedicalRecords;
import com.holmessquad.holmessquad.model.MedicalRecordQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MedicalRecordService {

    public List<MedicalRecords> findMedicalRecords(MedicalRecordQuery medicalRecordQuery);
    public Page<MedicalRecords> findPaginated(Pageable pageable, MedicalRecordQuery medicalRecordQuery);
}
