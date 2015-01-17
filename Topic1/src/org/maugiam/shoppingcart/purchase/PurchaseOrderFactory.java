package org.maugiam.shoppingcart.purchase;

import org.maugiam.shoppingcart.security.User;

/**
 * This class is a factory of purchase order. It's builds purchase orders based
 * on an user. It's also assign to the order the corresponding order number.
 * 
 * @author Mauro J Giamberardino
 *
 */

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

	/**
	 * Creates the new purchase order for an user
	 * 
	 * @param user
	 *            the user owner of the order
	 * @return the purchase order builded from params data
	 */
	public PurchaseOrder getNewTransaction(User user) {
		Long aux = new Long(lastOrder);
		lastOrder++;
		return new PurchaseOrder(user, aux);
	}

}
