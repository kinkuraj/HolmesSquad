/**
 * 
 */
package com.holmessquad.holmessquad.serviceimpl;

import java.text.ParseException;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
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

	@Autowired
	CredentialRepository credentialRepository;

    private ModelMapper modelMapper;
	  
	@Override
	public Credential doLogin(Credential credentials) {

		Optional<CredentialDAO> cred = credentialRepository.findById(credentials.getUsername());
		if(cred.isPresent() && StringUtils.equals(cred.get().getPassword(), credentials.getPassword())){
			credentials.setRole(cred.get().getRole());
			credentials.setLoginStatus(true);
			return credentials;
		}
		credentials.setLoginStatus(false);
		return credentials;
		
	}

	private CredentialDAO convertToEntity(Credential credential) throws ParseException {
		CredentialDAO credentialDAO = modelMapper.map(credential, CredentialDAO.class);
	    return credentialDAO;
	}
}
