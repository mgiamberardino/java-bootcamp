/**
 * 
 */
package org.maugiam.services.usercrud;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

/**
 * @author Mauro J Giamberardino
 *
 */
public class UserCrudProxyTest extends TestCase {

	UserService uService;
	
	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		uService = new UserServiceProxy(new UserServiceImpl());
	}

    public void testInstanceCreation()
    {
        assertNotNull(uService);
    }
    
    public void testCreateUser(){
    	User user = new User("maugiam", "Mauro", "Giamberardino");
    	User u = uService.createUser(user);
    	User user2 = new User("maugiam", "Mauro", "Giamberardino");
    	assertEquals(user2,u);
    }
    
    public void testFailOnDuplicatedCreation(){
    	User user = new User("maugiam", "Mauro", "Giamberardino");
    	User user2 = new User("maugiam", "Mauro", "Giamberardino");
    	User u = uService.createUser(user);
    	User u2 = uService.createUser(user2);
    	assertNotNull(u);
    	assertNull(u2);
    }
    
    public void testCreateAndRead(){
    	User user = new User("maugiam", "Mauro", "Giamberardino");
    	User user2 = new User("maugiam", "Mauro", "Giamberardino");
    	uService.createUser(user);
    	User get = uService.getUser("maugiam");
    	assertEquals(user2, get);
    }
    
    public void testUpdateData(){
    	User user = new User("maugiam_update", "Mauro", "Giamberardino");
    	User addedUser = uService.createUser(user);
    	User userUpdated = new User("maugiam_update", "Mauro2", "Giamberardino2");
    	User userExpected = new User("maugiam_update", "Mauro2", "Giamberardino2");
    	uService.updateUser(userUpdated);
    	assertEquals(userExpected, uService.getUser(user.getUsername()));
    }

    public void testDeleteUser(){
    	User user = new User("maugiam_update", "Mauro", "Giamberardino");
    	uService.createUser(user);
    	User created=uService.getUser(user.getUsername());
    	assertNotNull(created);
    	uService.deleteUser(user.getUsername());
    	User deleted = uService.getUser(user.getUsername());
    	assertNull(deleted);
    }
    
    public void testListUsers(){
    	User user = new User("user1", "UserName1", "UserLastName1");
    	User user2 = new User("user2", "UserName2", "UserLastName2");
    	User user3 = new User("user3", "UserName3", "UserLastName3");
    	User user4 = new User("user4", "UserName4", "UserLastName4");
    	List<User> users = new ArrayList<User>();
    	users.add(user); 		
    	users.add(user2);
    	users.add(user3);
    	users.add(user4);
    	uService.createUser(user);
    	uService.createUser(user2);
    	uService.createUser(user3);
    	uService.createUser(user4);
    	List<User> actual = uService.listUsers();
    	assertEquals(users.size(), actual.size());
    	for (User u: users){
    		Integer pos = actual.indexOf(u);
    		assertTrue(pos>-1);
    		assertEquals(u, actual.get(pos));
    	}
    }
    
    public void testUploadAndGetPhoto(){
    	User user = new User("dorian","Mauro","Giamber");
    	uService.createUser(user);
    	Photo photo = new Photo("PH01","/opt/user/photos/ph01.jpg");
    	assertTrue(uService.uploadPhoto(photo,user));
    	List<Photo> expectedPhotos = new ArrayList<Photo>();
    	expectedPhotos.add(photo);
    	List<Photo> photos = uService.getPhotos(user);
    	assertEquals(expectedPhotos.size(),photos.size());
    	for (Photo p : expectedPhotos){
    		assertTrue(photos.contains(p));
    	}
    }
    
    public void testAddAndGetFriends(){
    	User user = new User("mgiamberardino","Mauro","Giamberardino");
    	User user1 = new User("mcorrales","Manuel","Corrales");
    	User user2 = new User("sfernandez","Sebastian","Fernandez");
    	User user3 = new User("murruchua","Melina","Urruchua");
    	uService.createUser(user);
    	uService.createUser(user1);
    	uService.createUser(user2);
    	uService.createUser(user3);
    	assertTrue(uService.addFriend(user1,user2));
    	assertTrue(uService.addFriend(user1,user3));
    	assertTrue(uService.addFriend(user1,user));
    	assertTrue(uService.addFriend(user2,user3));
    	List<User> expectedU1Friends = new ArrayList<User>();
    	expectedU1Friends.add(user);
    	expectedU1Friends.add(user2);
    	expectedU1Friends.add(user3);
    	List<User> expectedU2Friends = new ArrayList<User>();
    	expectedU2Friends.add(user1);
    	expectedU2Friends.add(user3);
    	List<User> u1Friends = uService.getFriends(user1);
    	List<User> u2Friends = uService.getFriends(user2);
    	assertEquals(expectedU1Friends.size(), u1Friends.size());
    	assertEquals(expectedU2Friends.size(), u2Friends.size());
    	for(User u: expectedU1Friends){
    		assertTrue(u1Friends.contains(u));
    	}
    	for(User u: expectedU2Friends){
    		assertTrue(u2Friends.contains(u));
    	}
    }
    
    public void testAddAndGetLikesToPhotos(){
    	User user = new User("mgiamberardino","Mauro","Giamberardino");
    	User user1 = new User("mcorrales","Manuel","Corrales");
    	User user2 = new User("sfernandez","Sebastian","Fernandez");
    	User user3 = new User("murruchua","Melina","Urruchua"); 
    	uService.createUser(user);
    	uService.createUser(user1);
    	uService.createUser(user2);
    	uService.createUser(user3);
    	Photo photo = new Photo("PH01","/opt/user/photos/ph01.jpg");
    	uService.uploadPhoto(photo, user1);
    	Like like1 = new Like(user, new Date(System.currentTimeMillis()));
    	Like like2 = new Like(user2, new Date(System.currentTimeMillis()));
    	Like like3 = new Like(user3, new Date(System.currentTimeMillis()));
    	uService.addLike(photo,like1,user1);
    	uService.addLike(photo,like2,user1);
    	uService.addLike(photo,like3,user1);
    	List<Like> likes = uService.getLikes(photo,user1);
    	assertNotNull(likes);
    	List<Like> expectedLikes = new ArrayList<Like>();
    	expectedLikes.add(like1);
    	expectedLikes.add(like2);
    	expectedLikes.add(like3);
    	assertEquals(expectedLikes.size(), likes.size());
    	for( Like l: expectedLikes){
    		assertTrue(likes.contains(l));
    	}
    }
	
}
