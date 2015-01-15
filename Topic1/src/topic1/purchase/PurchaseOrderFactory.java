package topic1.purchase;

import topic1.User;
import topic1.payment.IPaymentAlgorithm;

public class PurchaseOrderFactory {

	private static Long lastOrder = new Long(0);
	private static PurchaseOrderFactory instance;

	public static PurchaseOrderFactory getInstance() {
		if (instance == null) {
			instance = new PurchaseOrderFactory();
		}
		return instance;
	}

	private PurchaseOrderFactory() {
		// TODO: initialize from database the last transaction number
		/*
		 * lastTransaction = loadLastTransaction(database)
		 */
	}

	public PurchaseOrder getNewTransaction(User user) {
		Long aux = new Long(lastOrder);
		lastOrder++;
		return new PurchaseOrder(user, aux);
	}

}
