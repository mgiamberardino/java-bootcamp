package org.maugiam.shoppingcart.payment;

import org.maugiam.shoppingcart.purchase.IOrder;

/**
 * This class implements a payment method, is the context for two strategy
 * patterns applied: the discount and the payment algorithm This class
 * represents the payment method logic from the point 1 and 2 of the topic 1.
 * 
 * @author Mauro J Giamberardino
 *
 */
public class CashMethod implements IPaymentMethod {

	/**
	 * Cash payment
	 * 
	 * @see org.maugiam.shoppingcart.payment.IPaymentMethod#pay(org.maugiam.shoppingcart.purchase.IOrder)
	 */
	@Override
	public void pay(IOrder order) {
		// TODO Cash payment algorithm
		System.out.println("Payed "+order.getTotal()+" in cash.");
	}
	
}
