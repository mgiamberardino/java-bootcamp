/**
 * 
 */
package org.maugiam.shoppingcart.wherehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class implements IStockable and represents the stock wherehouse of the
 * shopping cart
 * 
 * @author Mauro J Giamberardino
 *
 */
public class Wherehouse implements IStockeable {

	protected HashMap<IOffer, Long> items;
	protected String name;

	public Wherehouse(String name) {
		items = new HashMap<IOffer, Long>();
		this.name = name;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#getItemQuantity(org.maugiam.shoppingcart.wherehouse.IOffer)
	 */
	@Override
	public Long getItemQuantity(IOffer item) {
		return items.get(item);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#getItems()
	 */
	@Override
	public List<IOffer> getItems() {
		return new ArrayList<IOffer>(items.keySet());
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#addItem(org.maugiam.shoppingcart.wherehouse.IOffer,
	 *      java.lang.Long)
	 */
	@Override
	public void addItem(IOffer item, Long quantity) {
		if (items.containsKey(item)) {
			Long q = items.get(item);
			items.put(item, q + quantity);
		} else
			items.put(item, quantity);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IStockeable#removeItem(org.maugiam.shoppingcart.wherehouse.IOffer,
	 *      java.lang.Long)
	 */
	@Override
	public Boolean removeItem(IOffer item, Long quantity) {
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
	public void setItems(HashMap<IOffer, Long> items) {
		this.items = items;
	}

}
