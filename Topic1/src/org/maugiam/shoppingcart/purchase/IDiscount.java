package org.maugiam.shoppingcart.purchase;

/**
 * Interface for the discounts
 * 
 * @author Mauro J Giamberardino
 */
public interface IDiscount {

	/**
	 * Return the total calculated after the discount is applied
	 * 
	 * @param order
	 *            the order to apply the discount
	 * @return the total calculated with the discount applied
	 */
	public Double getTotal(IOrder order);

}
