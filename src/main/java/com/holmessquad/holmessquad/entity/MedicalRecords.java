/**
 * 
 */
package com.holmessquad.holmessquad.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Kinkuraj
 *
 */
@Data
@Document(collection = "MedicalRecords")
public class MedicalRecords {

	@Id
	private String id;
	private String patientID;
	private String drId;
	private String hospitalId;
	private String illnessType;
	private String illnessDesc;
	private String illnessCat;
	private String illnessSubCat;

	private List<String> medRecDocUrls;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getDrId() {
		return drId;
	}

	public void setDrId(String drId) {
		this.drId = drId;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getIllnessType() {
		return illnessType;
	}

	public void setIllnessType(String illnessType) {
		this.illnessType = illnessType;
	}

	public String getIllnessDesc() {
		return illnessDesc;
	}

	public void setIllnessDesc(String illnessDesc) {
		this.illnessDesc = illnessDesc;
	}

	public String getIllnessCat() {
		return illnessCat;
	}

	public void setIllnessCat(String illnessCat) {
		this.illnessCat = illnessCat;
	}

	public String getIllnessSubCat() {
		return illnessSubCat;
	}

	public void setIllnessSubCat(String illnessSubCat) {
		this.illnessSubCat = illnessSubCat;
	}

	public List<String> getMedRecDocUrls() {
		return medRecDocUrls;
	}

	public void setMedRecDocUrls(List<String> medRecDocUrls) {
		this.medRecDocUrls = medRecDocUrls;
	}
}
