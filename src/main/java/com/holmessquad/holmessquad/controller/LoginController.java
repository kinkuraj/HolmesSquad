package com.holmessquad.holmessquad.controller;

import com.holmessquad.holmessquad.model.Credential;
import com.holmessquad.holmessquad.model.DateRange;
import com.holmessquad.holmessquad.model.MedicalRecordQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("credential", new Credential());
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("credential") Credential credential, BindingResult result, Model model){
        System.out.println(credential.getUsername());
        System.out.println(model.getAttribute("credential"));
        credential.setLoginStatus(true);
        DateRange dateRange = new DateRange();
        dateRange.setDateFrom(new Date());
        dateRange.setDateTo(new Date());

        model.addAttribute("medicalRecordQuery", new MedicalRecordQuery());
        if("doctor".equals(credential.getPassword())){
            return "doctor";
        }
        return "patient";
    }
}
