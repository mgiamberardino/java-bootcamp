package topic1.purchase;

import topic1.User;
import topic1.payment.PaymentMethod;

public interface IOrder extends IStockeable {

	public void pay(PaymentMethod payment);
	public Long getOrderNumber();
	public void setOrderNumber(Long transactionNumber);
	public User getUser();
	public void setUser(User user);
	public Double getTotal();
	
}
