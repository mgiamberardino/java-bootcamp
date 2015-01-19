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
	protected IPaymentMethod paymentMethod;
	protected IOrder order;

	Transaction(IPaymentMethod paymentMethod, Long transactionNumber, IOrder order) {
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
	public IPaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @param paymentMethod
	 *            the paymentMethod to set
	 */
	public void setPaymentMethod(CashMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return order.getUser();
	}

}
