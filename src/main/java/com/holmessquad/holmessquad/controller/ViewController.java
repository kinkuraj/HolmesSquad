package com.holmessquad.holmessquad.controller;

import com.holmessquad.holmessquad.entity.MedicalRecords;
import com.holmessquad.holmessquad.model.Credential;
import com.holmessquad.holmessquad.model.MedicalRecordQuery;
import com.holmessquad.holmessquad.service.MedicalRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class ViewController {

    private static Logger logger = LoggerFactory.getLogger(ViewController.class);

    @Autowired
    private MedicalRecordService medicalRecordService;

    @PostMapping("/fetchrecord")
    public String getMedicalRecordsForDoctor(@ModelAttribute("credential") Credential credential, @ModelAttribute("medicalRecordQuery") MedicalRecordQuery medicalRecordQuery, Model model){
        List<MedicalRecords> medicalRecordsList = medicalRecordService.findMedicalRecords(medicalRecordQuery);
        medicalRecordsList = new ArrayList<>();
        MedicalRecords medicalRecords = new MedicalRecords();
        medicalRecords.setHospitalId("XYZ Hospital");
        medicalRecords.setPatientID("Jonita");
        medicalRecords.setDrId("Dr. Bala");
        medicalRecords.setIllnessDesc("Appointment 3241 - 25/02/2020");
        medicalRecordsList.add(medicalRecords);
        MedicalRecords medicalRecords1 = new MedicalRecords();
        medicalRecords1.setHospitalId("XYZ Hospital");
        medicalRecords1.setPatientID("Jonita");
        medicalRecords1.setDrId("Dr. Sharma");
        medicalRecords1.setIllnessDesc("Appointment 3582 - 21/07/2020");
        medicalRecordsList.add(medicalRecords1);
        MedicalRecords medicalRecords2 = new MedicalRecords();
        medicalRecords2.setHospitalId("XYZ Hospital");
        medicalRecords2.setPatientID("ABC XYZ");
        medicalRecords2.setDrId("Dr. Ghosh");
        medicalRecords2.setIllnessDesc("Appointment 4589 - 02/10/2020");
        medicalRecordsList.add(medicalRecords2);
        model.addAttribute("credential", credential);
        model.addAttribute("medicalRecordsList", medicalRecordsList);
        return "doctor";
    }

    @PostMapping("/medicalrecords")
    public String getMedicalRecords(@ModelAttribute("credential") Credential credential, @ModelAttribute("medicalRecordQuery") MedicalRecordQuery medicalRecordQuery, Model model){
        List<MedicalRecords> medicalRecordsList = medicalRecordService.findMedicalRecords(medicalRecordQuery);
        medicalRecordsList = new ArrayList<>();
        MedicalRecords medicalRecords = new MedicalRecords();
        medicalRecords.setHospitalId("XYZ Hospital");
        medicalRecords.setPatientID("Jonita");
        medicalRecords.setDrId("Dr. Bala");
        medicalRecords.setIllnessDesc("Appointment 3241 - 25/02/2020");
        medicalRecordsList.add(medicalRecords);
        MedicalRecords medicalRecords1 = new MedicalRecords();
        medicalRecords1.setHospitalId("XYZ Hospital");
        medicalRecords1.setPatientID("Jonita");
        medicalRecords1.setDrId("Dr. Sharma");
        medicalRecords1.setIllnessDesc("Appointment 3582 - 21/07/2020");
        medicalRecordsList.add(medicalRecords1);
        MedicalRecords medicalRecords2 = new MedicalRecords();
        medicalRecords2.setHospitalId("XYZ Hospital");
        medicalRecords2.setPatientID("ABC XYZ");
        medicalRecords2.setDrId("Dr. Ghosh");
        medicalRecords2.setIllnessDesc("Appointment 4589 - 02/10/2020");
        medicalRecordsList.add(medicalRecords2);
        model.addAttribute("credential", credential);
        model.addAttribute("medicalRecordsList", medicalRecordsList);
        return "patient";
    }

    @RequestMapping(value = "/viewUrl/{id}")
    public String viewUrl(@PathVariable("id") String id, Model model) {
        logger.info("viewUrl called with id: "+ id);
        List<String> medRecDocUrls = new ArrayList<>();
        medRecDocUrls.add("sdfsdf");
        medRecDocUrls.add("sdfsdf");
        medRecDocUrls.add("sdfsd");
        medRecDocUrls.add("sdfsdf");
        model.addAttribute("medRecDocUrls", medRecDocUrls);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("patient :: viewUrl");
        modelAndView.addObject("medRecDocUrls", medRecDocUrls);
        return "patient :: viewUrl";
    }

    @PostMapping("/listRecords")
    public String listRecords(@ModelAttribute MedicalRecordQuery medicalRecordQuery,
            Model model,
            @RequestParam("page") Optional<Integer> page,
            @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);

        Page<MedicalRecords> mrPage = medicalRecordService.findPaginated(PageRequest.of(currentPage - 1, pageSize), medicalRecordQuery);

        model.addAttribute("mrPage", mrPage);

        int totalPages = mrPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "patient";
    }

    @PostMapping("/authCode")
    public String generateAuthCode(@ModelAttribute MedicalRecordQuery medicalRecordQuery, Model model ){
        return "patient";
    }
}
