package org.maugiam.services.usercrud;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class UserServiceTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserServiceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UserServiceTest.class );
    }

    UserCrudService uService;;
    
    @Override
    protected void setUp() throws Exception {
    	// TODO Auto-generated method stub
    	super.setUp();
    	uService = new UserCrudImpl();
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
    
}
