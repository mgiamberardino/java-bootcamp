/**
 * 
 */
package org.maugiam.apps.shoppingcart;

import java.util.List;


/**
 * @author Mauro J Giamberardino
 *
 */
public interface ShoppingCart {

	/**
	 * 
	 * @author Mauro J Giamberardino
	 */
	public void addItem(Item item);
	
	/**
	 * 
	 * @author Mauro J Giamberardino
	 */
	public void removeItem(Item item);
	
	/**
	 * 
	 * @author Mauro J Giamberardino
	 */
	public List<Item> getItems();
	
	/**
	 * Returns the number of items in the cart
	 * 
	 */
	public Integer getSize();
	
	/**
	 * 
	 * @author Mauro J Giamberardino
	 */
	public Double getTotal();
	
}
