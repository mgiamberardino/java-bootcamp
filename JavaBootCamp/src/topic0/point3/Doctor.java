package topic0.point3;

public class Doctor extends Person {

	protected String medicalRegistration;
	protected String specialty;
	
	public Doctor(String specialty) {
		this.specialty=specialty;
	}
	
	public Doctor(String name, String lastname, String idNumber, String phone, String emailAdress, String mailAdress, String medicalRegistration, String specialty) {
		super(name, lastname, idNumber, phone, emailAdress, mailAdress);
		this.medicalRegistration = medicalRegistration;
		this.specialty = specialty;
	}

	/**
	 * @return the medicalRegistration
	 */
	public String getMedicalRegistration() {
		return medicalRegistration;
	}

	/**
	 * @param medicalRegistration the medicalRegistration to set
	 */
	public void setMedicalRegistration(String medicalRegistration) {
		this.medicalRegistration = medicalRegistration;
	}

	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
}
