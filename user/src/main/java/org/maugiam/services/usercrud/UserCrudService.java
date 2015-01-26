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

	/**
	 * Uploads a user photo
	 * 
	 * @param photo
	 *            the photo to upload
	 * @param user
	 *            the photo's owner user
	 * @return TODO
	 */
	public Boolean uploadPhoto(Photo photo, User user);

	/**
	 * Get the list of photos of a User
	 * 
	 * @param user
	 *            the user to get photos from
	 * @return a list of the user photos
	 */
	public List<Photo> getPhotos(User user);

	/**
	 * Adds userOne to userTwo like a friend and vice versa
	 * 
	 * @param userOne
	 * @param userTwo
	 * @return true when the relationships is maded, false when at least one of
	 *         the users doesn't exists or the relationship already exists.
	 */
	public boolean addFriend(User userOne, User userTwo);

	/**
	 * Returns a list of the user friends
	 * 
	 * @param user
	 *            the user to get the friends from
	 * @return the list of the user friends
	 */
	public List<User> getFriends(User user);

	/**
	 * Adds a like to a specific photo from a specific user
	 * 
	 * @param photo
	 *            the photo where the like must be added
	 * @param like
	 *            the like to add
	 * @param owner
	 *            the owner of the photo to add the like
	 * @return true when the like is added, false when the photo doesn't exist.
	 */
	public boolean addLike(Photo photo, Like like, User owner);

	/**
	 * Get the likes of  specific photo
	 * 
	 * @param photo the photo to get the likes from
	 * @param owner the user owner of the photo
	 * @return
	 */
	public List<Like> getLikes(Photo photo, User owner);
}
