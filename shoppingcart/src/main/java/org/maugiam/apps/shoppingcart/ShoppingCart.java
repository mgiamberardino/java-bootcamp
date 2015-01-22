/**
 * 
 */
package org.maugiam.apps.shoppingcart;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Mauro J Giamberardino
 *
 */
public interface ShoppingCart<Item> {

	/**
	 * 
	 * @author Mauro J Giamberardino
	 */
	public boolean addItem(Item item, Long quantity);
	
	/**
	 * 
	 * @author Mauro J Giamberardino
	 */
	public boolean removeItem(Item item);
	
	/**
	 * 
	 * @author Mauro J Giamberardino
	 */
	public List<Item> getItems();
	
	/**
	 * 
	 * @author Mauro J Giamberardino
	 */
	public Double getTotal();
	
}
