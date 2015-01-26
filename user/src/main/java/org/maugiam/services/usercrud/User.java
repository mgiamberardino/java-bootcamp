/**
 * 
 */
package org.maugiam.services.usercrud;

/**
 * @author Mauro J Giamberardino
 *
 */
public class User {

	private String username;
	private String surname;
	private String lastname;
	
	public User(String username, String surname, String lastname) {
		this.username = username;
		this.surname = surname;
		this.lastname = lastname;
	}
	
	public User() {
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	/**
	 * 
	 */
	@Override
	public boolean equals(Object o){
		try {
			User user = (User) o;
			return username.equals(user.getUsername());
		}catch (ClassCastException e){
		}
		return false;
	}
	
	public String toString(){
		return username;
	}
}
