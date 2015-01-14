package topic0.point3;

import java.util.Date;
import java.util.Vector;

public class Patient extends Person {

	protected String socialNumber;
	protected String medicalInsurance;
	protected Date firstInDate;
	protected Vector<String> medicalRecord;

	public Patient(String name, String lastname, String idNumber, String phone, String emailAdress, String mailAdress, Date firstInDate) {
		super(name, lastname, idNumber, phone, emailAdress, mailAdress);
		this.firstInDate = firstInDate;
	}

	public Patient(Date firstInDate) {
		super();
		this.firstInDate = firstInDate;
	}
	
	/**
	 * @return the medicalRecord
	 */
	public Vector<String> getMedicalRecord() {
		return medicalRecord;
	}

	/**
	 * @param medicalRecord the medicalRecord to set
	 */
	public void setMedicalRecord(Vector<String> medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	/**
	 * @param consultationResult the result to add to the medical record of the patient
	 */
	public void addMedicalConsultation(String consultationResult) {
		medicalRecord.add(consultationResult);
	}
	
	/**
	 * @return the socialNumber
	 */
	public String getSocialNumber() {
		return socialNumber;
	}

	/**
	 * @param socialNumber the socialNumber to set
	 */
	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}

	/**
	 * @return the medicalInsurance
	 */
	public String getMedicalInsurance() {
		return medicalInsurance;
	}

	/**
	 * @param medicalInsurance the medicalInsurance to set
	 */
	public void setMedicalInsurance(String medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	/**
	 * @return the firstInDate
	 */
	public Date getFirstInDate() {
		return firstInDate;
	}

	/**
	 * @param firstInDate the firstInDate to set
	 */
	public void setFirstInDate(Date firstInDate) {
		this.firstInDate = firstInDate;
	}

}
