package topic0.point3;

import java.util.Collection;
import java.util.HashMap;

public class Area implements IHospital{

	protected HashMap<String,Patient> patients;
	protected HashMap<String,Doctor> doctors;
	protected String name;
	protected Boolean radiologyEquipment;
	protected Boolean bloodAnalysisEquipment;
	protected Boolean hasHospitalWards;
	protected Boolean highComplexity;
	protected Integer nmbRooms;
	
	@Override
	public Collection<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients.values();
	}

	@Override
	public Collection<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors.values();
	}
	
	/**
	 * @return the hasRadiologyEquipment
	 */
	public Boolean getHasRadiologyEquipment() {
		return radiologyEquipment;
	}

	/**
	 * @param radiologyEquipment the radiologyEquipment to set
	 */
	public void setRadiologyEquipment(Boolean radiologyEquipment) {
		this.radiologyEquipment = radiologyEquipment;
	}

	/**
	 * @return the hasBloodAnalysisEquipment
	 */
	public Boolean hasBloodAnalysisEquipment() {
		return bloodAnalysisEquipment;
	}

	/**
	 * @param bloodAnalysisEquipment the hasBloodAnalysisEquipment to set
	 */
	public void setBloodAnalysisEquipment(Boolean bloodAnalysisEquipment) {
		this.bloodAnalysisEquipment = bloodAnalysisEquipment;
	}

	/**
	 * @return the nmbRooms
	 */
	public Integer getNmbRooms() {
		return nmbRooms;
	}

	/**
	 * @param nmbRooms the nmbRooms to set
	 */
	public void setNmbRooms(Integer nmbRooms) {
		this.nmbRooms = nmbRooms;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hasHospitalWards
	 */
	public Boolean getHasHospitalWards() {
		return hasHospitalWards;
	}

	/**
	 * @param hasHospitalWards the hasHospitalWards to set
	 */
	public void setHasHospitalWards(Boolean hasHospitalWards) {
		this.hasHospitalWards = hasHospitalWards;
	}

	/**
	 * @return the isHighComplexity
	 */
	public Boolean isHighComplexity() {
		return highComplexity;
	}

	/**
	 * @param highComplexity the highComplexity to set
	 */
	public void setHighComplexity(Boolean highComplexity) {
		this.highComplexity = highComplexity;
	}

	/**
	 * @param patients the patients to set
	 */
	public void setPatients(HashMap<String, Patient> patients) {
		this.patients = patients;
	}

	/**
	 * @param patient the patient to add
	 */
	public void addPatient(Patient patient) {
		patients.put(patient.getSocialNumber(), patient);
	}
	
	/**
	 * @param doctors the doctors to set
	 */
	public void setDoctors(HashMap<String, Doctor> doctors) {
		this.doctors = doctors;
	}
	
	/**
	 * @param doctors the doctor to add
	 */
	public void addDoctor(Doctor doctor) {
		doctors.put(doctor.getMedicalRegistration(), doctor);
	}

}
