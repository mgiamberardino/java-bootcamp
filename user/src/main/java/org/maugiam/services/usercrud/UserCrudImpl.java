/**
 * 
 */
package org.maugiam.services.usercrud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mauro J Giamberardino
 *
 */
public class UserCrudImpl implements UserCrudService {

	private Map<String,User> users;
	
	public UserCrudImpl() {
		users = new HashMap<String, User>();
	}
	
	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#createUser()
	 */
	public User createUser(User user) {
		if (!users.containsKey(user.getUsername())){
			users.put(user.getUsername(), user);
			return user;
		}
		return null;
	}

	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#getUser(java.lang.String)
	 */
	public User getUser(String username) {
		return users.get(username);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#updateUser(org.maugiam.services.usercrud.User)
	 */
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see org.maugiam.services.usercrud.UserCrudService#deleteUser(java.lang.String)
	 */
	public void deleteUser(String username) {
		users.remove(username);
	}

	public List<User> listUsers() {
		return new ArrayList<User>(users.values());
	}

}
