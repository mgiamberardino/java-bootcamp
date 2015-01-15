package topic1.payment;

import topic1.purchase.IOrder;

public class TransactionFactory {

	private static Long lastTransaction = new Long(0);
	private static TransactionFactory instance;

	public static TransactionFactory getInstance() {
		if (instance == null) {
			instance = new TransactionFactory();
		}
		return instance;
	}

	private TransactionFactory() {
		// TODO: initialize from database the last transaction number
		/*
		 * lastTransaction = loadLastTransaction(database)
		 */
	}

	public Transaction getNewTransaction(PaymentMethod paymentMethod, IOrder order) {
		Long aux = new Long(lastTransaction);
		lastTransaction++;
		return new Transaction(paymentMethod, aux, order);
	}

}
