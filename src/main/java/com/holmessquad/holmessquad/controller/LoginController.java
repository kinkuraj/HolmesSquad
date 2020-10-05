package com.holmessquad.holmessquad.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.holmessquad.holmessquad.model.Credential;
import com.holmessquad.holmessquad.model.DateRange;
import com.holmessquad.holmessquad.service.CredentialService;

@Controller
public class LoginController {

	@Autowired
	CredentialService credentialService;
 
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
    @GetMapping("v1/login")
	public ResponseEntity<Object> doLogin(
			@RequestBody Credential credentials) {
		return credentialService.doLogin(credentials);
	}
}
