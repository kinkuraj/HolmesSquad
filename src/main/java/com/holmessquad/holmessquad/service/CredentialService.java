package com.holmessquad.holmessquad.service;

import org.springframework.http.ResponseEntity;

import com.holmessquad.holmessquad.model.Credential;

public interface CredentialService {

	public Credential doLogin(Credential credentials);
}
