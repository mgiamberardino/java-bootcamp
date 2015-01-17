/**
 * 
 */
package org.maugiam.shoppingcart.manager;

import java.util.Vector;

import org.maugiam.shoppingcart.wherehouse.IItem;
import org.maugiam.shoppingcart.wherehouse.IStockeable;

/**
 * This decorator adds the observable functionality to the Stockable
 * 
 * @author Mauro J Giamberardino
 */
public class ObsStockDecorator extends MailingListObservable implements IStockeable {

	/**
	 * Decorated Stockable
	 */
	protected IStockeable stock;
	
	public ObsStockDecorator(IStockeable stock) {
		this.stock = stock;
	}
	
	/**
	 * 
	 * @see topic1.wherehouse.IStockeable#getItemQuantity(topic1.wherehouse.IItem)
	 */
	@Override
	public Long getItemQuantity(IItem item) {
		return stock.getItemQuantity(item);
	}

	/**
	 * 
	 * @see topic1.wherehouse.IStockeable#getItems()
	 */
	@Override
	public Vector<IItem> getItems() {
		return stock.getItems();
	}

	/**
	 * Notifies when an item is added to the stock
	 * 
	 * @see topic1.wherehouse.IStockeable#addItem(topic1.wherehouse.IItem, java.lang.Long)
	 */
	@Override
	public void addItem(IItem item, Long quantity) {
		notifyObservers(new String(quantity + " item/offer "+ item.getCode() +" was added to the stock."));
		stock.addItem(item, quantity);
	}

	/**
	 * 
	 * @see topic1.wherehouse.IStockeable#removeItem(topic1.wherehouse.IItem, java.lang.Long)
	 */
	@Override
	public Boolean removeItem(IItem item, Long quantity) {
		return stock.removeItem(item, quantity);
	}

}
