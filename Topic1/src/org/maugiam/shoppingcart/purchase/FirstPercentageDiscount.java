package org.maugiam.shoppingcart.purchase;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import org.maugiam.shoppingcart.wherehouse.IItem;

/**
 * This class is a subclass of PercentageDiscount, in this case the discount
 * percentage is calculated from the first item of the items list ordered by a
 * criteria
 * 
 * @author Mauro J Giamberardino
 */
public class FirstPercentageDiscount extends PercentageDiscount {

	protected Comparator<IItem> criteria;

	public FirstPercentageDiscount(Double percentage, Comparator<IItem> criteria) {
		super(percentage);
		this.criteria = criteria;
	}

	public FirstPercentageDiscount(Double percentage) {
		super(percentage);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.purchase.PercentageDiscount#getTotal(org.maugiam.shoppingcart.purchase.IOrder)
	 */
	@Override
	public Double getTotal(IOrder iOrder) {
		Vector<IItem> items = iOrder.getItems();
		Collections.sort(items, criteria);
		return items.firstElement().getPrice() * (1 - percentage);
	}

	/**
	 * @return the order
	 */
	public Comparator<IItem> getCriteria() {
		return criteria;
	}

	/**
	 * @param criteria
	 *            the order to set
	 */
	public void setCriteria(Comparator<IItem> criteria) {
		this.criteria = criteria;
	}

}
