package org.maugiam.shoppingcart.purchase;

import java.util.Comparator;

import org.maugiam.shoppingcart.wherehouse.IOffer;

/**
 * This is a calss that implements a comparator for IItem, this is part of an
 * strategy pattern to make ordering procedures over a collection of IItems.
 * 
 * @author Mauro J Giamberardino
 *
 */
public class PriceComparator implements Comparator<IOffer> {

	protected Boolean inverse;

	public PriceComparator(Boolean inverse) {
		this.inverse = inverse;
	}

	/**
	 * This method compares two IItems by it's price. If the first one is
	 * greater it's return 1 else if the first one is lower the returns -1
	 * otherwise it's returns 0. If inverse attribute is true the it's inverse
	 * the result.
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(IOffer arg0, IOffer arg1) {
		// TODO Auto-generated method stub
		int res = 0;
		if (arg0.getPrice() > arg1.getPrice())
			res = 1;
		else if (arg0.getPrice() < arg1.getPrice())
			res = -1;
		if (inverse)
			return res * -1;
		else
			return res;
	}

}
