/**
 * 
 */
package org.maugiam.shoppingcart.manager;

import java.util.Vector;

import org.maugiam.shoppingcart.wherehouse.IOffer;
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
	 * @see topic1.wherehouse.IStockeable#getItemQuantity(IOffer.wherehouse.IItem)
	 */
	@Override
	public Long getItemQuantity(IOffer item) {
		return stock.getItemQuantity(item);
	}

	/**
	 * 
	 * @see topic1.wherehouse.IStockeable#getItems()
	 */
	@Override
	public Vector<IOffer> getItems() {
		return stock.getItems();
	}

	/**
	 * Notifies when an item is added to the stock
	 * 
	 * @see topic1.wherehouse.IStockeable#addItem(IOffer.wherehouse.IItem, java.lang.Long)
	 */
	@Override
	public void addItem(IOffer item, Long quantity) {
		notifyObservers(new String(quantity + " item/offer "+ item.getCode() +" was added to the stock."));
		stock.addItem(item, quantity);
	}

	/**
	 * 
	 * @see topic1.wherehouse.IStockeable#removeItem(IOffer.wherehouse.IItem, java.lang.Long)
	 */
	@Override
	public Boolean removeItem(IOffer item, Long quantity) {
		return stock.removeItem(item, quantity);
	}

}
