package org.maugiam.shoppingcart.purchase;

import java.util.List;

import org.maugiam.shoppingcart.wherehouse.IOffer;

/**
 * The discount model is implemented by an adapter pattern.
 * 
 * @author Mauro J Giamberardino
 *
 */
public abstract class AbsDiscount implements IDiscount {

	IDiscount discount;

	public AbsDiscount(IDiscount discount) {
		this.discount = discount;
	}

	@Override
	public List<IOffer> getItems() {
		return discount.getItems();
	}

}
