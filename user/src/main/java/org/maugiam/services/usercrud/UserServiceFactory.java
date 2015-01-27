/**
 * 
 */
package org.maugiam.services.usercrud;

/**
 * @author Mauro J Giamberardino
 *
 */
public class UserServiceFactory {

	public static UserService getRemoteServiceUsingJMS() {
		return new UserServiceProxy(new UserServiceJMSClient());
	}

	public static UserService getLocalService() {
		return new UserServiceProxy(new UserServiceImpl());
	}

}
