package org.maugiam.shoppingcart.wherehouse;

import java.util.Vector;

/**
 * This interface represents the behavior of the classes that stocks items
 * 
 * @author Mauro J Giamberardino
 *
 */
public interface IStockeable {

	/**
	 * Returns the quantity of an specific item
	 * 
	 * @param item
	 *            the item to know his quantity
	 */
	public Long getItemQuantity(IOffer item);

	/**
	 * Return a collections of items without their quantities
	 * 
	 * @return the items
	 */
	public Vector<IOffer> getItems();

	/**
	 * Adds items to the stock
	 * 
	 * @param item
	 *            the item to remove
	 * 
	 * @param quantity
	 *            the quantity of the item to remove
	 */
	public void addItem(IOffer item, Long quantity);

	/**
	 * Returns true if there was enough items, else return false.
	 * 
	 * @param item
	 *            the item to remove
	 * 
	 * @param quantity
	 *            the quantity of the item to remove
	 * @return if the item was removed
	 */
	public Boolean removeItem(IOffer item, Long quantity);

}
