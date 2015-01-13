package topic0.point3;

import java.util.Date;

public abstract class Hospital implements IPrototype{

	protected String country;
	protected String state;
	protected String city;
	protected Date openingDate;
	
	/*
	 * Constructor with all attributes
	 */
	public Hospital(String country, String state, String city, Date openingDate) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.openingDate = openingDate;
	}
	
	/*
	 * Empty construtor
	 */
	public Hospital() {
		super();
	}

	/*
	 * Must be implemented
	 * This method must return the kind of Hospital that the instance is.
	 */
	public abstract String getKind();
	/*
	 * Must be implemented
	 * This method must return a list of patients of the hospital.
	 */
	public abstract void listPatients();
	
	/*
	 * Prototype pattern implementation.
	 * @see topic0.point3.IPrototype#doClone()
	 */
	@Override
	public Hospital doClone() {
		// TODO Auto-generated method stub
		return new AnimalHospital(country, state, city, openingDate);
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
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
	 * @param state the state to set
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
	 * @param city the city to set
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
	 * @param openingDate the openingDate to set
	 */
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	
	
	
}
