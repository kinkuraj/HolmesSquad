/**
 * 
 */
package com.holmessquad.holmessquad.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author saravanakumar
 *
 */
@Data
@Document(collection = "Credential")
public class Credential {
	
	private String userId;
	private String personId;
	private String doctorId;
	private String password;
	private String accountStatus;
	private String sessionId;
	

}
