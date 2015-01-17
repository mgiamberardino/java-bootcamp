package org.maugiam.shoppingcart.security;

import java.util.Date;

public class User {

	protected String username;
	protected String password;
	protected Date lastAccess;
	protected Person person;

	/**
	 * Constructor
	 * 
	 * @param username
	 * @param password
	 * @param lastAccess
	 * @param person
	 */
	public User(String username, String password, Date lastAccess, Person person) {
		super();
		this.username = username;
		this.password = password;
		this.lastAccess = lastAccess;
		this.person = person;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return true if the password matchs
	 */
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the lastAccess
	 */
	public Date getLastAccess() {
		return lastAccess;
	}

	/**
	 * @param lastAccess
	 *            the lastAccess to set
	 */
	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person
	 *            the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

}
