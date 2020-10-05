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
@Document(collection = "Authcode")
public class AuthenticationCode {
	
	private String medicalId;
	private String authNumber;
	private String expriredTime;
	private String hospitalId; 

}
