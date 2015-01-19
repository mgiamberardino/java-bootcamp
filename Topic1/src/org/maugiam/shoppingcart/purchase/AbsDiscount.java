package org.maugiam.shoppingcart.purchase;

import java.util.Vector;

import org.maugiam.shoppingcart.payment.IPaymentMethod;
import org.maugiam.shoppingcart.payment.Transaction;
import org.maugiam.shoppingcart.security.User;
import org.maugiam.shoppingcart.wherehouse.IItem;
/**
 * The discount model is implemented by an adapter pattern.
 * 
 * @author Mauro J Giamberardino
 *
 */
public abstract class AbsDiscount implements IOrder {

	IOrder order;
	
	public AbsDiscount(IOrder order) {
		super();
		this.order = order;
	}

	@Override
	public Long getItemQuantity(IItem item) {
		return order.getItemQuantity(item);
	}

	@Override
	public Vector<IItem> getItems() {
		return order.getItems();
	}

	@Override
	public void addItem(IItem item, Long quantity) {
		order.addItem(item, quantity);
	}

	@Override
	public Boolean removeItem(IItem item, Long quantity) {
		return order.removeItem(item, quantity);
	}

	@Override
	public Transaction pay(IPaymentMethod payment) {
		return order.pay(payment);
	}

	@Override
	public Long getOrderNumber() {
		return order.getOrderNumber();
	}

	@Override
	public void setOrderNumber(Long orderNumber) {
		order.setOrderNumber(orderNumber);
	}

	@Override
	public User getUser() {
		return order.getUser();
	}

	@Override
	public void setUser(User user) {
		order.setUser(user);
	}

}
