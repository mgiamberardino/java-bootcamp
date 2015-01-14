package topic0.point3;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class Hospital implements IHospital {

	protected String country;
	protected String state;
	protected String city;
	protected Date openingDate;
	Vector<Area> areas;
	
	/*
	 * Constructor with all attributes
	 */
	public Hospital(String country, String state, String city, Date openingDate) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.openingDate = openingDate;
		areas = new Vector<Area>();
	}

	/*
	 * Empty construtor
	 */
	public Hospital() {
		areas = new Vector<Area>();
	}

	@Override
	public Collection<Patient> getPatients(){
		Iterator<Area> it = areas.iterator();
		Vector<Patient> patients= new Vector<Patient>();
		while(it.hasNext()){
			patients.addAll(it.next().getPatients());
		}
		return patients;
	}
	
	@Override
	public Collection<Doctor> getDoctors() {
		Iterator<Area> it = areas.iterator();
		Vector<Doctor> doctors= new Vector<Doctor>();
		while(it.hasNext()){
			doctors.addAll(it.next().getDoctors());
		}
		return doctors;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the openingDate
	 */
	public Date getOpeningDate() {
		return openingDate;
	}

	/**
	 * @param openingDate
	 *            the openingDate to set
	 */
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	
	/**
	 * @return the areas
	 */
	public Vector<Area> getAreas() {
		return areas;
	}

	/**
	 * @param areas the areas to set
	 */
	public void setAreas(Vector<Area> areas) {
		this.areas = areas;
	}

}
