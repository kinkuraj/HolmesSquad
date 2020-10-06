package com.holmessquad.holmessquad.service.impl;

import com.holmessquad.holmessquad.entity.MedicalRecords;
import com.holmessquad.holmessquad.model.MedicalRecordQuery;
import com.holmessquad.holmessquad.repository.MedicalRecordsRepository;
import com.holmessquad.holmessquad.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordsRepository medicalRecordsRepository;

    @Override
    public List<MedicalRecords> findMedicalRecords(MedicalRecordQuery medicalRecordQuery){

        //return medicalRecordsRepository.findMedicalRecordsByHospitalIdAndPatientID(medicalRecordQuery.getHospitalId(), medicalRecordQuery.getPatientId());
        return null;
    }

    @Override
    public Page<MedicalRecords> findPaginated(Pageable pageable, MedicalRecordQuery medicalRecordQuery) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<MedicalRecords> list;

        List<MedicalRecords> records = medicalRecordsRepository.findMedicalRecordsByHospitalIdAndPatientID(medicalRecordQuery.getHospitalId(), medicalRecordQuery.getPatientId());

        if (records.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, records.size());
            list = records.subList(startItem, toIndex);
        }

        Page<MedicalRecords> mrPage
                = new PageImpl<MedicalRecords>(list, PageRequest.of(currentPage, pageSize), records.size());

        return mrPage;
    }

}
