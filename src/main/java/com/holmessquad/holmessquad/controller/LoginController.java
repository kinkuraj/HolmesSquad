package com.holmessquad.holmessquad.controller;

import com.holmessquad.holmessquad.model.Credential;
import com.holmessquad.holmessquad.model.MedicalRecordQuery;
import com.holmessquad.holmessquad.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Login controller for user and admin logins
 *
 * */
@Controller
public class LoginController {

    private Map<String, String> users = new HashMap<>();

    private Map<String, String> usersRole = new HashMap<>();

    @Autowired
    CredentialService credentialService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("credential", new Credential());
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("credential") Credential credential, BindingResult result, Model model) {
        users.put("jonita", "password");
        users.put("kapil", "password");

        usersRole.put("jonita", "PAT");
        usersRole.put("kapil", "DOC");
        System.out.println(credential.getUsername());
        System.out.println(model.getAttribute("credential"));

        model.addAttribute("medicalRecordQuery", new MedicalRecordQuery());

        //credential = credentialService.doLogin(credential);
        model.addAttribute("credential", credential);
        //System.out.println(credential.isLoginStatus());
        //System.out.println(credential.getRole());
        /*if(credential.isLoginStatus()){
            return "DOC".equals(credential.getRole()) ?"doctor":"patient";
        }*/

        //Mock login
        if (users.containsKey(credential.getUsername()) && users.get(credential.getUsername()).equals(credential.getPassword())) {
            return "DOC".equals(usersRole.get(credential.getUsername())) ? "doctor" : "patient";
        }
        return "home";
    }
    
}
