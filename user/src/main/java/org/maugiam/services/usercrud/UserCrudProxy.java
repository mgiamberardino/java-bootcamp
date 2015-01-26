/**
 * 
 */
package org.maugiam.services.usercrud;

import java.util.List;

/**
 * @author Mauro J Giamberardino
 *
 */
public class UserCrudProxy implements UserCrudService {

	UserCrudService service;
	
	public UserCrudProxy(UserCrudService service) {
		this.service = service;
	}
	
	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#createUser(org.maugiam.services.usercrud.User)
	 */
	public User createUser(User user) {
		return service.createUser(user);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#getUser(java.lang.String)
	 */
	public User getUser(String username) {
		return service.getUser(username);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#updateUser(org.maugiam.services.usercrud.User)
	 */
	public void updateUser(User user) {
		service.updateUser(user);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#deleteUser(java.lang.String)
	 */
	public void deleteUser(String username) {
		service.deleteUser(username);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#listUsers()
	 */
	public List<User> listUsers() {
		return service.listUsers();
	}

}
