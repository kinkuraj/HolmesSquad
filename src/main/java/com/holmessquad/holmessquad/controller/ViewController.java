package com.holmessquad.holmessquad.controller;

import com.holmessquad.holmessquad.model.MedicalRecordQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

    public MedicalRecordQuery medicalRecordQuery;

    @PostMapping("/medicalrecords")
    public String getMedicalRecords(@ModelAttribute MedicalRecordQuery medicalRecordQuery, Model model){

        model.addAttribute("medicalRecordQuery",medicalRecordQuery);
        return "patient";
    }
}
