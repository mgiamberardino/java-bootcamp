package org.maugiam.shoppingcart.payment;

import org.maugiam.shoppingcart.purchase.IDiscount;
import org.maugiam.shoppingcart.purchase.IOrder;

/**
 * This class implements a payment method, is the context for two strategy
 * patterns applied: the discount and the payment algorithm This class
 * represents the payment method logic from the point 1 and 2 of the topic 1.
 * 
 * @author Mauro J Giamberardino
 *
 */
public class PaymentMethod {

	protected IPaymentAlgorithm algorithm;
	protected IDiscount discount = null;
	protected String name;

	public PaymentMethod(IPaymentAlgorithm algorithm, String name) {
		this.algorithm = algorithm;
		this.name = name;
	}

	public PaymentMethod(IPaymentAlgorithm algorithm, IDiscount discount, String name) {
		this.algorithm = algorithm;
		this.discount = discount;
		this.name = name;
	}

	/**
	 * This method unify the two strategies, it makes a discount if there is any
	 * and the pay the total amount with the discount applied.
	 * 
	 * @param order
	 *            the order to pay
	 */
	public void pay(IOrder order) {
		if (discount == null)
			algorithm.pay(order.getTotal());
		else
			algorithm.pay(discount.getTotal(order));
	}

}
