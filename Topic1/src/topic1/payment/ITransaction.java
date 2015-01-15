package topic1.payment;

import topic1.User;

public interface ITransaction {

	public Long getTransactionNumber();

	public PaymentMethod getPaymentMethod();

	public User getUser();

}
