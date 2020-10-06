package com.holmessquad.holmessquad.service;

import org.springframework.http.ResponseEntity;

import com.holmessquad.holmessquad.model.Credential;

public interface CredentialService {

	ResponseEntity<Object> doLogin(Credential credentials);
}
