package org.maugiam.shoppingcart.payment;

import org.maugiam.shoppingcart.security.User;

/**
 * Interface to the classes wich implement a transaction
 * 
 * @author Mauro J Giamberardino
 */

public interface ITransaction {

	/**
	 * 
	 * @return Long the transaction number
	 */
	public Long getTransactionNumber();

	/**
	 * 
	 * @return PaymentMethod the payment method of the transaction
	 */
	public IPaymentMethod getPaymentMethod();

	/**
	 * 
	 * @return User the user protagonist of the transaction
	 */
	public User getUser();

}
