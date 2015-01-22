package org.maugiam.shoppingcart.manager;

import java.util.Vector;

import org.maugiam.shoppingcart.payment.CashMethod;
import org.maugiam.shoppingcart.payment.IPaymentMethod;
import org.maugiam.shoppingcart.payment.Transaction;
import org.maugiam.shoppingcart.purchase.IOrder;
import org.maugiam.shoppingcart.security.User;
import org.maugiam.shoppingcart.wherehouse.IOffer;

/**
 * This decorator adds the observable functionality to the Orders
 * 
 * @author Mauro J Giamberardino
 */
public class ObsOrderDecorator extends MailingListObservable implements IOrder {

	/**
	 * Decorated order
	 */
	protected IOrder order;

	public ObsOrderDecorator(IOrder order) {
		super();
		this.order = order;
	}

	/**
	 * Notifies when a transaction is maded
	 * 
	 * @see org.maugiam.shoppingcart.purchase.IOrder#pay(org.maugiam.shoppingcart
	 *      .payment.CashMethod)
	 */
	@Override
	public Transaction pay(IPaymentMethod paymentMethod) {
		Transaction t = order.pay(paymentMethod);
		notifyObservers(new String("A new transaction with the " + t.getTransactionNumber() + " transaction number was made."));
		return t;
	}

	/**
	 * Notifies when an item is added
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#addItem(org.maugiam.
	 *      shoppingcart.wherehouse.IOffer, java.lang.Long)
	 */
	@Override
	public void addItem(IOffer item, Long quantity) {
		notifyObservers(new String(quantity + " item/offer " + item.getCode() + " was added to the " + order.getOrderNumber() + " order."));
		order.addItem(item, quantity);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.purchase.IOrder#getOrderNumber()
	 */
	@Override
	public Long getOrderNumber() {
		return order.getOrderNumber();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.purchase.IOrder#getUser()
	 */
	@Override
	public User getUser() {
		return order.getUser();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#getItemQuantity(org.maugiam
	 *      .shoppingcart.wherehouse.IOffer)
	 */
	@Override
	public Long getItemQuantity(IOffer item) {
		return order.getItemQuantity(item);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#getItems()
	 */
	@Override
	public Vector<IOffer> getItems() {
		return order.getItems();
	}

	/**
	 *
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#removeItem(org.maugiam
	 *      .shoppingcart.wherehouse.IOffer, java.lang.Long)
	 */
	@Override
	public Boolean removeItem(IOffer item, Long quantity) {
		return order.removeItem(item, quantity);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.purchase.IOrder#setOrderNumber(java.lang.Long)
	 */
	@Override
	public void setOrderNumber(Long orderNumber) {
		order.setOrderNumber(orderNumber);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.purchase.IOrder#setUser(org.maugiam.shoppingcart
	 *      .security.User)
	 */
	@Override
	public void setUser(User user) {
		order.setUser(user);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.purchase.IOrder#getTotal()
	 */
	@Override
	public Double getTotal() {
		return order.getTotal();
	}

}
