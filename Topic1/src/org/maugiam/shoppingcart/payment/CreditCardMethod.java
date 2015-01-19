/**
 * 
 */
package org.maugiam.shoppingcart.payment;

import org.maugiam.shoppingcart.purchase.IOrder;

/**
 * This is a payment algorith implementation, in this case the credit card
 * payment algorithm
 * 
 * @author Mauro J Giamberardino
 *
 */
public class CreditCardMethod implements IPaymentMethod {

	protected String name;
	protected String cardNumber;
	
	public CreditCardMethod(String name, String cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}

	/**
	 * 
	 * @see topic1.IPaymentMethod#pay(topic1.IItem)
	 */
	@Override
	public void pay(IOrder order) {
		// TODO Credit Card payment algorithm
		System.out.println("Payed "+order.getTotal()+" with credit card.");
	}

}
