/**
 * 
 */
package org.maugiam.shoppingcart.payment;

import org.maugiam.shoppingcart.purchase.IOrder;

/**
 * This class implements an specific payment algorithm implementing the payment
 * algorithm interface
 * 
 * @author Mauro J Giamberardino
 *
 */
public class PaypalMethod implements IPaymentMethod {

	protected String email;
	protected String password;
	
	public PaypalMethod(String email, String password) {
		this.email = email;
		this.password = password;
	}

	/**
	 * 
	 * @see topic1.IPaymentMethod#pay(topic1.IItem)
	 */
	@Override
	public void pay(IOrder order) {
		// TODO Paypal sign-in and payment
		System.out.println("Payed "+order.getTotal()+" with paypal by "+email+" user.");
	}

}
