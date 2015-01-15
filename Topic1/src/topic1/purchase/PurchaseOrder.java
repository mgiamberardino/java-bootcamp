package topic1.purchase;

import java.util.HashMap;
import java.util.Vector;

import topic1.User;
import topic1.payment.IPaymentAlgorithm;
import topic1.payment.PaymentMethod;
import topic1.wherehouse.IItem;

public class PurchaseOrder implements IOrder{
	
	protected Long orderNumber;
	protected User user;
	protected HashMap<IItem,Long> items;

	PurchaseOrder(User user, Long transactionNumber) {
		this.user = user;
		this.orderNumber = transactionNumber;
		items= new HashMap<IItem, Long>(); 
	}

	public void pay(PaymentMethod payment) {
//		paymentMethod.pay(this.getTotal());
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

	@Override
	public Long getItemQuantity(IItem item) {
		return items.get(item);
	}

	@Override
	public Vector<IItem> getItems() {
		return new Vector<IItem>(items.keySet());
	}

	@Override
	public void addItem(IItem item, Long quantity) {
		if(items.containsKey(item)){
			Long q = items.get(item);
			items.put(item, q+quantity);
		} else
			items.put(item, quantity);
	}

	@Override
	public Boolean removeItem(IItem item, Long quantity) {
		if(items.containsKey(item)){
			Long q = items.get(item);
			if (q >= quantity){
				items.put(item, q-quantity);
				return true;
			}
		} 
		return false;
	}

	public Double getTotal() {
		// TODO Auto-generated method stub
		return null;
	}

}
