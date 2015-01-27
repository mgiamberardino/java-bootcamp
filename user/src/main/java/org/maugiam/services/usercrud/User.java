/**
 * 
 */
package org.maugiam.services.usercrud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Mauro J Giamberardino
 *
 */
public class User {

	private String username;
	private String surname;
	private String lastname;

	List<Photo> photos;
	List<User> friends;

	public User(String username, String surname, String lastname) {
		this.username = username;
		this.surname = surname;
		this.lastname = lastname;
		photos = new ArrayList<Photo>();
		friends = new ArrayList<User>();
	}

	public User() {
		photos = new ArrayList<Photo>();
		friends = new ArrayList<User>();
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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
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
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object o) {
		try {
			User user = (User) o;
			return username.equals(user.getUsername());
		} catch (ClassCastException e) {
		}
		return false;
	}

	public String toString() {
		return username;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}

	protected List<Photo> getPhotos() {
		return new ArrayList<Photo>(photos);
	}

	public Boolean addFriend(User u2) {
		if (!friends.contains(u2))
			return friends.add(u2);
		return false;
	}

	public List<User> getFriends() {
		return new ArrayList<User>(friends);
	}
}
