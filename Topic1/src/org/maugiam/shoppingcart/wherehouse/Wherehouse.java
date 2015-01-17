/**
 * 
 */
package org.maugiam.shoppingcart.wherehouse;

import java.util.HashMap;
import java.util.Vector;

/**
 * This class implements IStockable and represents the stock wherehouse of the shopping cart
 * 
 * @author Mauro J Giamberardino
 *
 */
public class Wherehouse implements IStockeable {

	protected HashMap<IItem, Long> items;
	protected String name;

	public Wherehouse(String name) {
		items = new HashMap<IItem, Long>();
		this.name = name;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#getItemQuantity(org.maugiam.shoppingcart.wherehouse.IItem)
	 */
	@Override
	public Long getItemQuantity(IItem item) {
		return items.get(item);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#getItems()
	 */
	@Override
	public Vector<IItem> getItems() {
		return new Vector<IItem>(items.keySet());
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#addItem(org.maugiam.shoppingcart.wherehouse.IItem, java.lang.Long)
	 */
	@Override
	public void addItem(IItem item, Long quantity) {
		if (items.containsKey(item)) {
			Long q = items.get(item);
			items.put(item, q + quantity);
		} else
			items.put(item, quantity);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#removeItem(org.maugiam.shoppingcart.wherehouse.IItem, java.lang.Long)
	 */
	@Override
	public Boolean removeItem(IItem item, Long quantity) {
		if (items.containsKey(item)) {
			Long q = items.get(item);
			if (q >= quantity) {
				items.put(item, q - quantity);
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(HashMap<IItem, Long> items) {
		this.items = items;
	}

}
