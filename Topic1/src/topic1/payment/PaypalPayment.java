/**
 * 
 */
package topic1.payment;

/**
 * @author Mau Giam
 *
 */
public class PaypalPayment implements IPaymentAlgorithm {

	/* (non-Javadoc)
	 * @see topic1.IPaymentMethod#pay(topic1.IItem)
	 */
	@Override
	public void pay(Double amount) {
		// TODO Paypal sign-in and payment
	}

}
