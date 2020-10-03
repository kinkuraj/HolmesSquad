package com.holmessquad.holmessquad.controller;

import com.holmessquad.holmessquad.model.Credential;
import com.holmessquad.holmessquad.model.DateRange;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute Credential credential, BindingResult result, Model model){
        System.out.println(credential.getUsername());
        System.out.println(model.getAttribute("credential"));
        credential.setLoginStatus(true);
        DateRange dateRange = new DateRange();
        dateRange.setDateFrom(new Date());
        dateRange.setDateTo(new Date());
        model.addAttribute("dateRange", dateRange);
        model.addAttribute(credential);
        return "patient";
    }
}
