/**
 * 
 */
package org.maugiam.shoppingcart.payment;

/**
 * This class implements an specific payment algorithm implementing the payment
 * algorithm interface
 * 
 * @author Mauro J Giamberardino
 *
 */
public class PaypalPayment implements IPaymentAlgorithm {

	/**
	 * 
	 * @see topic1.IPaymentMethod#pay(topic1.IItem)
	 */
	@Override
	public void pay(Double amount) {
		// TODO Paypal sign-in and payment
	}

}
