package topic1.purchase;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import topic1.wherehouse.IItem;

public class FirstPercentageDiscount extends PercentageDiscount {

	protected Comparator<IItem> order;

	public FirstPercentageDiscount(Double percentage, Comparator<IItem> order) {
		super(percentage);
		this.order = order;
	}

	public FirstPercentageDiscount(Double percentage) {
		super(percentage);
	}

	@Override
	public Double getTotal(IOrder iOrder) {
		Vector<IItem> items = iOrder.getItems();
		Collections.sort(items,order);
		return items.firstElement().getPrice() * (1 - percentage);
	}

	/**
	 * @return the order
	 */
	public Comparator<IItem> getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Comparator<IItem> order) {
		this.order = order;
	}

}
