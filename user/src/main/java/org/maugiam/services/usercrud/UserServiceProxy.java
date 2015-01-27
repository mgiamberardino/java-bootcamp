/**
 * 
 */
package org.maugiam.services.usercrud;

import java.util.List;

/**
 * @author Mauro J Giamberardino
 *
 */
public class UserServiceProxy implements UserService {

	UserService service;
	
	public UserServiceProxy(UserService service) {
		this.service = service;
	}
	
	/**
	 * @see org.maugiam.services.usercrud.UserService#createUser(org.maugiam.services.usercrud.User)
	 */
	public User createUser(User user) {
		return service.createUser(user);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserService#getUser(java.lang.String)
	 */
	public User getUser(String username) {
		return service.getUser(username);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserService#updateUser(org.maugiam.services.usercrud.User)
	 */
	public void updateUser(User user) {
		service.updateUser(user);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserService#deleteUser(java.lang.String)
	 */
	public void deleteUser(String username) {
		service.deleteUser(username);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserService#listUsers()
	 */
	public List<User> listUsers() {
		return service.listUsers();
	}

	public Boolean uploadPhoto(Photo photo, User user) {
		return service.uploadPhoto(photo, user);
	}

	public List<Photo> getPhotos(User user) {
		return service.getPhotos(user);
	}

	public boolean addFriend(User userOne, User userTwo) {
		return service.addFriend(userOne, userTwo);
	}

	public List<User> getFriends(User user) {
		return service.getFriends(user);
	}

	public boolean addLike(Photo photo, Like like, User owner) {
		return service.addLike(photo, like, owner);
	}

	public List<Like> getLikes(Photo photo, User owner) {
		return service.getLikes(photo, owner);
	}

	
	
}
