package com.holmessquad.holmessquad.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author saravanakumar
 *
 */
@Data
@Document(collection = "HospitalDetails")
public class HospitalDetails {
	
	private String hospitalName;
	private String hospitalId;
	private String registrationNumber;
	private String mobileNumber;
	private ContactDetails contactDetails;
	
	

}
