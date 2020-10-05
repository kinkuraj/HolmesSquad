/**
 * 
 */
package com.holmessquad.holmessquad.serviceimpl;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.holmessquad.holmessquad.entity.CredentialDAO;
import com.holmessquad.holmessquad.model.Credential;
import com.holmessquad.holmessquad.repository.CredentialRepository;
import com.holmessquad.holmessquad.service.CredentialService;

/**
 * @author saravanakumar
 *
 */
@Service
public class CredentialServiceImpl implements CredentialService {

	CredentialRepository credentialRepository;
	
	@Autowired
    private ModelMapper modelMapper;
	  
	@Override
	public ResponseEntity<Object> doLogin(Credential credentials) {
		try {
			CredentialDAO credentialDAO= convertToEntity(credentials);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		credentialRepository.findById(credentials.getUsername());
		return null;
		
	}
	
	private CredentialDAO convertToEntity(Credential credential) throws ParseException {
		CredentialDAO credentialDAO = modelMapper.map(credential, CredentialDAO.class);
	   
	    return null;
	}
}
