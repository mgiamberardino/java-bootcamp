package topic1.payment;

import topic1.purchase.IDiscount;
import topic1.purchase.IOrder;

public class PaymentMethod {

	protected IPaymentAlgorithm algorithm;
	protected IDiscount discount = null;
	protected String name;

	public PaymentMethod(IPaymentAlgorithm algorithm, String name) {
		this.algorithm = algorithm;
		this.name = name;
	}

	public PaymentMethod(IPaymentAlgorithm algorithm, IDiscount discount, String name) {
		this.algorithm = algorithm;
		this.discount = discount;
		this.name = name;
	}

	public void pay(IOrder order){
		if(discount==null)
			algorithm.pay(order.getTotal());
		else
			algorithm.pay(discount.getTotal(order));
	}
	
}
