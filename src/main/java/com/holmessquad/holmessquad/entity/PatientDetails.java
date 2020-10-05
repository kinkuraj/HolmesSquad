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
@Document(collection = "PatientDetails")
public class PatientDetails {

	
	private String patientNmae;
	private String patientID;
	private String nationalId;
	private String hospitalId;
	private String passportNumber;
	private ContactDetails contactDetails;
}
