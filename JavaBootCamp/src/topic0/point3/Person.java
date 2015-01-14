package topic0.point3;

public class Person {

	protected String name;
	protected String lastname;
	protected String idNumber;
	protected String phone;
	protected String emailAdress;
	protected String mailAdress;

	public Person(String name, String lastname, String idNumber, String phone, String emailAdress, String mailAdress) {
		this.name = name;
		this.lastname = lastname;
		this.idNumber = idNumber;
		this.phone = phone;
		this.emailAdress = emailAdress;
		this.mailAdress = mailAdress;
	}
	
	public Person(){
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber
	 *            the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the emailAdress
	 */
	public String getEmailAdress() {
		return emailAdress;
	}

	/**
	 * @param emailAdress
	 *            the emailAdress to set
	 */
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	/**
	 * @return the mailAdress
	 */
	public String getMailAdress() {
		return mailAdress;
	}

	/**
	 * @param mailAdress
	 *            the mailAdress to set
	 */
	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

}
