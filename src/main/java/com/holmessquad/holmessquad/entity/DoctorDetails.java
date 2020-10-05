package com.holmessquad.holmessquad.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author saravanakumar
 *
 */
@Data
@Document(collection = "DoctorDetails")
public class DoctorDetails {

	private String doctorNmae;
	private String doctorID;
	private String practionerNumber;
	private String mobileNumber;
	private String emailAddress;
}
