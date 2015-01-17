package org.maugiam.shoppingcart.payment;

import org.maugiam.shoppingcart.purchase.IOrder;
import org.maugiam.shoppingcart.security.User;

/**
 * This class implement the interface of a transaction, an represents a
 * transaction. Represent the payment maded by an user for a specific order
 *
 * @author Mauro J Giamberardino
 *
 */
public class Transaction implements ITransaction {

	protected Long transactionNumber;
	protected PaymentMethod paymentMethod;
	protected IOrder order;

	Transaction(PaymentMethod paymentMethod, Long transactionNumber, IOrder order) {
		this.paymentMethod = paymentMethod;
		this.transactionNumber = transactionNumber;
		this.order = order;
	}

	/**
	 * @return the transactionNumber
	 */
	public Long getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * @param transactionNumber
	 *            the transactionNumber to set
	 */
	public void setTransactionNumber(Long transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	/**
	 * @return the paymentMethod
	 */
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @param paymentMethod
	 *            the paymentMethod to set
	 */
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return order.getUser();
	}

}
