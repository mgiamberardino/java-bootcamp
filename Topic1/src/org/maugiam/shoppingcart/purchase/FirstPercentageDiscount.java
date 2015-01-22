package org.maugiam.shoppingcart.purchase;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import org.maugiam.shoppingcart.wherehouse.IOffer;

/**
 * This class is a subclass of PercentageDiscount, in this case the discount
 * percentage is calculated from the first item of the items list ordered by a
 * criteria
 * 
 * @author Mauro J Giamberardino
 */
public class FirstPercentageDiscount extends PercentageDiscount {

	protected Comparator<IOffer> criteria;

	public FirstPercentageDiscount(Double percentage, Comparator<IOffer> criteria, IOrder order) {
		super(percentage,order);
		this.criteria = criteria;
	}

	public FirstPercentageDiscount(Double percentage,IOrder order) {
		super(percentage,order);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.purchase.PercentageDiscount#getTotal(org.maugiam.shoppingcart.purchase.IOrder)
	 */
	@Override
	public Double getTotal() {
		Vector<IOffer> items = order.getItems();
		Collections.sort(items, criteria);
		return items.firstElement().getPrice() * (1 - percentage);
	}

	/**
	 * @return the order
	 */
	public Comparator<IOffer> getCriteria() {
		return criteria;
	}

	/**
	 * @param criteria
	 *            the order to set
	 */
	public void setCriteria(Comparator<IOffer> criteria) {
		this.criteria = criteria;
	}

}
