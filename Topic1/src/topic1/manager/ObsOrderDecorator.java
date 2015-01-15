package topic1.manager;

import java.util.Vector;

import topic1.User;
import topic1.payment.PaymentMethod;
import topic1.purchase.IOrder;
import topic1.wherehouse.IItem;

public class ObsOrderDecorator extends MailingListObservable implements IOrder {

	protected IOrder order;
	
	public ObsOrderDecorator(IOrder order) {
		super();
		this.order = order;
	}

	@Override
	public void pay(PaymentMethod paymentMethod) {
		notifyObservers(new String("A new order with the " + order.getOrderNumber() + " was made."));
		order.pay(paymentMethod);
	}

	@Override
	public void addItem(IItem item, Long quantity) {
		notifyObservers(new String(quantity + " item/offer "+ item.getCode() +" was added."));
		order.addItem(item,quantity);
	}

	@Override
	public Long getOrderNumber() {
		return order.getOrderNumber();
	}

	@Override
	public User getUser() {
		return order.getUser();
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
	public Boolean removeItem(IItem item, Long quantity) {
		return order.removeItem(item, quantity);
	}

	@Override
	public void setOrderNumber(Long orderNumber) {
		order.setOrderNumber(orderNumber);
	}

	@Override
	public void setUser(User user) {
		order.setUser(user);
	}

	@Override
	public Double getTotal() {
		return order.getTotal();
	}

}
