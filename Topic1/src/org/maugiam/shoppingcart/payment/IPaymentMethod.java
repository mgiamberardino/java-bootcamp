package org.maugiam.shoppingcart.payment;

import org.maugiam.shoppingcart.purchase.IOrder;

/**
 * Interface to the classes wich implement a payment algorithm
 * 
 * @author Mauro J Giamberardino
 */
public interface IPaymentMethod {

	/**
	 * This method implement the algorith to make a pay
	 * 
	 * @param order
	 *            the order to pay
	 */
	public void pay(IOrder order);

}
