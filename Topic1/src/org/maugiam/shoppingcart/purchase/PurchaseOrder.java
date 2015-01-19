package org.maugiam.shoppingcart.purchase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import org.maugiam.shoppingcart.payment.CashMethod;
import org.maugiam.shoppingcart.payment.IPaymentMethod;
import org.maugiam.shoppingcart.payment.Transaction;
import org.maugiam.shoppingcart.payment.TransactionFactory;
import org.maugiam.shoppingcart.security.User;
import org.maugiam.shoppingcart.wherehouse.IItem;

/**
 * This class implements IOrder inferface and represents the shopping cart.
 * 
 * @author Mauro J Giamberardino
 *
 */
public class PurchaseOrder implements IOrder {

	protected Long orderNumber;
	protected User user;
	protected HashMap<IItem, Long> items;

	PurchaseOrder(User user, Long transactionNumber) {
		this.user = user;
		this.orderNumber = transactionNumber;
		items = new HashMap<IItem, Long>();
	}

	public Transaction pay(IPaymentMethod payment) {
		payment.pay(this);
		Transaction t = TransactionFactory.getInstance().getNewTransaction(payment, this);
		return t;
	}

	/**
	 * @return the orderNumber
	 */
	public Long getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber
	 *            the order to set
	 */
	public void setOrderNumber(Long transactionNumber) {
		this.orderNumber = transactionNumber;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#getItemQuantity(org.maugiam.shoppingcart.wherehouse.IItem)
	 */
	@Override
	public Long getItemQuantity(IItem item) {
		return items.get(item);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#getItems()
	 */
	@Override
	public Vector<IItem> getItems() {
		return new Vector<IItem>(items.keySet());
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#addItem(org.maugiam.shoppingcart.wherehouse.IItem,
	 *      java.lang.Long)
	 */
	@Override
	public void addItem(IItem item, Long quantity) {
		if (items.containsKey(item)) {
			Long q = items.get(item);
			items.put(item, q + quantity);
		} else
			items.put(item, quantity);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#removeItem(org.maugiam.shoppingcart.wherehouse.IItem,
	 *      java.lang.Long)
	 */
	@Override
	public Boolean removeItem(IItem item, Long quantity) {
		if (items.containsKey(item)) {
			Long q = items.get(item);
			if (q >= quantity) {
				items.put(item, q - quantity);
				return true;
			}
		}
		return false;
	}

	/**
	 * It calculates the total by adding all the IItems price multiplied by its
	 * quantity.s
	 * 
	 * @see org.maugiam.shoppingcart.purchase.IOrder#getTotal()
	 */
	@Override
	public Double getTotal() {
		Double total = 0.0;
		Iterator<IItem> it = items.keySet().iterator();
		while (it.hasNext()) {
			IItem item = it.next();
			Long quantity = items.get(item);
			total += item.getPrice() * quantity;
		}
		return total;
	}

}
