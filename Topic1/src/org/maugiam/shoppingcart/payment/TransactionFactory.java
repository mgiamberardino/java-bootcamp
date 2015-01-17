package org.maugiam.shoppingcart.payment;

import org.maugiam.shoppingcart.purchase.IOrder;

/**
 * This class is a factory of transaction. It's builds transaction based on a
 * payment algorithm and an order. It's also assign to the transaction the
 * corresponding transaction number.
 * 
 * @author Mauro J Giamberardino
 *
 */

public class TransactionFactory {

	private static Long lastTransaction = new Long(0);
	private static TransactionFactory instance;

	public static TransactionFactory getInstance() {
		if (instance == null) {
			instance = new TransactionFactory();
		}
		return instance;
	}

	private TransactionFactory() {
		// TODO: initialize from database the last transaction number
		/*
		 * lastTransaction = loadLastTransaction(database)
		 */
	}

	/**
	 * Creates the new transaction for an order and a payment method.
	 * 
	 * @param paymentMethod
	 *            the payment method of the transaction
	 * @param order
	 *            the order of the transaction
	 * @return the transaction created from the params data
	 */
	public Transaction getNewTransaction(PaymentMethod paymentMethod, IOrder order) {
		Long aux = new Long(lastTransaction);
		lastTransaction++;
		return new Transaction(paymentMethod, aux, order);
	}

}
