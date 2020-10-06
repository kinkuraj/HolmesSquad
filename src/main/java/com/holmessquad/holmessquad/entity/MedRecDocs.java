/**
 * 
 */
package com.holmessquad.holmessquad.entity;

import lombok.Data;
import org.bson.BsonDocument;
import org.bson.conversions.Bson;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Kinkuraj
 *
 */
@Data
@Document(collection = "MedRecDocs")
public class MedRecDocs {

	private String docType;
	private String docId;
	private Bson doc;
	private MedicalRecords medicalRecords;

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public Bson getDoc() {
		return doc;
	}

	public void setDoc(Bson doc) {
		this.doc = doc;
	}

	public MedicalRecords getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(MedicalRecords medicalRecords) {
		this.medicalRecords = medicalRecords;
	}
}
