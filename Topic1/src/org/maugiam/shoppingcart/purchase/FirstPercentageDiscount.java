package org.maugiam.shoppingcart.purchase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

	public FirstPercentageDiscount(Double percentage, Comparator<IOffer> criteria, IDiscount discount) {
		super(percentage, discount);
		this.criteria = criteria;
	}

	public FirstPercentageDiscount(Double percentage, IDiscount discount) {
		super(percentage, discount);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.purchase.PercentageDiscount#getTotal(org.maugiam.shoppingcart.purchase.IOrder)
	 */
	@Override
	public Double getTotal() {
		List<IOffer> items = discount.getItems();
		Collections.sort(items, criteria);
		if (items.size() == 0)
			return 0.0;
		return items.get(0).getPrice() * (1 - percentage);
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
