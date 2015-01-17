package org.maugiam.shoppingcart.payment;

/**
 * Interface to the classes wich implement a payment algorithm
 * 
 * @author Mauro J Giamberardino
 */
public interface IPaymentAlgorithm {

	/**
	 * This method implement the algorith to make a pay
	 * 
	 * @param amount
	 *            the amount to pay
	 */
	public void pay(Double amount);

}
