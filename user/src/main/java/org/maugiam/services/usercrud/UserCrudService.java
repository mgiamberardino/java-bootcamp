package org.maugiam.services.usercrud;

import java.util.List;

/**
 * 
 * This is the interface of an User CRUD Service
 * 
 * @author Mauro J Giamberardino
 *
 */
public interface UserCrudService {

	/**
	 * Creates a user a returns it, if there is an user with the username then
	 * its return null
	 * 
	 * @return the user created or null if the username is taken.
	 */
	public User createUser(User user);

	/**
	 * Gets a specific User
	 * 
	 * @param String
	 *            the user username
	 * 
	 * @return the user with the specified username.
	 */
	public User getUser(String username);

	/**
	 * Update the data of a specific User
	 * 
	 * @param User
	 *            an User object with the updated data
	 */
	public void updateUser(User user);

	/**
	 * Removes a User with an specific username
	 * 
	 * @param String
	 *            the user username
	 */
	public void deleteUser(String username);

	/**
	 * List the users created
	 * 
	 * @return the list of users
	 */
	public List<User> listUsers();
}
