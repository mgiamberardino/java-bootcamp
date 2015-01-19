package org.maugiam.shoppingcart.purchase;

import org.maugiam.shoppingcart.payment.CashMethod;
import org.maugiam.shoppingcart.payment.IPaymentMethod;
import org.maugiam.shoppingcart.payment.Transaction;
import org.maugiam.shoppingcart.security.User;
import org.maugiam.shoppingcart.wherehouse.IStockeable;

/**
 * Interface to the Purchase Orders
 * 
 * @author Mauro J Giamberardino
 */
public interface IOrder extends IStockeable {

	/**
	 * This method realize the pay for the order and builds the transaction
	 * 
	 * @param payment
	 *            the payment method to use for the pay
	 * @return return the transaction builded after payment
	 */
	public Transaction pay(IPaymentMethod payment);

	/**
	 * Return the order number
	 * 
	 * @return the order number
	 */
	public Long getOrderNumber();

	/**
	 * Set the order number
	 * 
	 * @param orderNumber
	 *            the order number to set
	 */
	public void setOrderNumber(Long orderNumber);

	/**
	 * Return the user of the order
	 * 
	 * @return the user owner of the order
	 */
	public User getUser();

	/**
	 * Set the user of the order
	 * 
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user);

	/**
	 * Return the total value of the order
	 * 
	 * @return the total value to pay of the order
	 */
	public Double getTotal();

}
