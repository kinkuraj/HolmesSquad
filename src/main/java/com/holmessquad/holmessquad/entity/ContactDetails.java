/**
 * 
 */
package com.holmessquad.holmessquad.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author saravanakumar
 *
 */
@Data
@NoArgsConstructor
public class ContactDetails {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String district;
	private String mobileNumber;
	private String emailAddress;
	private String pinCode;
}
