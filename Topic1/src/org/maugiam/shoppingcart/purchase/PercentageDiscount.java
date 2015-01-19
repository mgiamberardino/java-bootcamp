package org.maugiam.shoppingcart.purchase;

/**
 * This class implement a Discount (IDiscount)
 *
 * @author Mauro J Giamberardino
 */
public class PercentageDiscount extends AbsDiscount {

	protected Double percentage;

	public PercentageDiscount(Double percentage,IOrder order) {
		super(order);
		this.percentage = percentage;
	}

	@Override
	public Double getTotal() {
		return order.getTotal() * (1 - percentage);
	}

	/**
	 * @return the percentage
	 */
	public Double getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage
	 *            the percentage to set
	 */
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

}
