/**
 * 
 */
package org.maugiam.shoppingcart.purchase;

import java.util.List;

import org.maugiam.shoppingcart.wherehouse.IOffer;

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
	* the order to apply the discount
	* @return the total calculated with the discount applied
	*/
	public Double getTotal();
	
	/**
	 * Return a collections of items without their quantities
	 * 
	 * @return the items
	 */
	public List<IOffer> getItems();
	
}
