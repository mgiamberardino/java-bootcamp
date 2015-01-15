package topic1.purchase;

import java.util.Vector;

import topic1.wherehouse.IItem;

public interface IStockeable {

	/*
	 * Returns the quantity of an specific item
	 * @param item the item to know his quantity
	 */
	public Long getItemQuantity(IItem item);
	
	/*
	 *Return a collections of items without their quantities 
	 */
	public Vector<IItem> getItems();
	
	/*
	 * Adds items to the stock
	 * @param item the item to remove
	 * @param quantity the quantity of the item to remove
	 */
	public void addItem(IItem item, Long quantity);
	
	/*
	 * Returns true if there was enough items, else return false.
	 * @param item the item to remove
	 * @param quantity the quantity of the item to remove
	 */
	public Boolean removeItem(IItem item, Long quantity);

}
