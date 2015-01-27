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
public class UserServiceImpl implements UserService {

	private Map<String, User> users;

	public UserServiceImpl() {
		users = new HashMap<String, User>();
	}

	/**
	 * @see org.maugiam.services.usercrud.UserService#createUser()
	 */
	public User createUser(User user) {
		if (!users.containsKey(user.getUsername())) {
			users.put(user.getUsername(), user);
			return user;
		}
		return null;
	}

	/**
	 * @see org.maugiam.services.usercrud.UserService#getUser(java.lang.String)
	 */
	public User getUser(String username) {
		return users.get(username);
	}

	/**
	 * @see org.maugiam.services.usercrud.UserService#updateUser(org.maugiam.services.usercrud.User)
	 */
	public void updateUser(User user) {
		User updUser = users.get(user.getUsername());
		if (updUser != null) {
			updUser.setSurname(user.getSurname());
			updUser.setLastname(user.getLastname());
		}
	}

	/**
	 * @see org.maugiam.services.usercrud.UserService#deleteUser(java.lang.String)
	 */
	public void deleteUser(String username) {
		users.remove(username);
	}

	public List<User> listUsers() {
		return new ArrayList<User>(users.values());
	}

	public Boolean uploadPhoto(Photo photo, User user) {
		User storedUser = users.get(user.getUsername());
		if (storedUser != null) {
			/*
			 * Algorithm to upload and save the photo maybe on an ORM Database
			 */
			Photo storedPhoto = new Photo(photo.getId(), photo.getPath());// Get
																			// the
																			// stored
																			// photo
			storedUser.addPhoto(storedPhoto);
			return true;
		}
		return false;
	}

	public List<Photo> getPhotos(User user) {
		User storedUser = users.get(user.getUsername());
		if (storedUser != null) {
			return new ArrayList<Photo>(storedUser.getPhotos());
		}
		return null;
	}

	public boolean addFriend(User userOne, User userTwo) {
		User u1 = users.get(userOne.getUsername());
		User u2 = users.get(userTwo.getUsername());
		if ((u1 != null) && (u2 != null)) {
			return u1.addFriend(u2) && u2.addFriend(u1);
		}
		return false;
	}

	public List<User> getFriends(User user) {
		User storedUser = users.get(user.getUsername());
		if (storedUser != null) {
			return storedUser.getFriends();
		}
		return null;
	}

	public boolean addLike(Photo photo, Like like, User owner) {
		User storedUser = users.get(owner.getUsername());
		if (storedUser != null) {
			List<Photo> userPhotos = storedUser.getPhotos();
			Integer index = userPhotos.indexOf(photo);
			if (index > -1) {
				Photo storedPhoto = userPhotos.get(index);
				if (storedPhoto != null) {
					return storedPhoto.addLike(like);
				}
			}
		}
		return false;
	}

	public List<Like> getLikes(Photo photo, User owner) {
		User storedUser = users.get(owner.getUsername());
		if (storedUser != null) {
			List<Photo> userPhotos = storedUser.getPhotos();
			Integer index = userPhotos.indexOf(photo);
			if (index > -1) {
				Photo storedPhoto = userPhotos.get(index);
				if (storedPhoto != null) {
					return storedPhoto.getLikes();
				}
			}
		}
		return null;
	}

}
