package org.maugiam.shoppingcart.manager;

import java.util.Comparator;
import java.util.Vector;

import org.maugiam.shoppingcart.wherehouse.IFilter;
import org.maugiam.shoppingcart.wherehouse.IItem;

/**
 * This decorator adds the observable functionality to the Products
 * 
 * @author Mauro J Giamberardino
 */
public class ObsItemDecorator extends MailingListObservable implements IItem {

	/**
	 * Decorated Product
	 */
	IItem item;

	public ObsItemDecorator(IItem item) {
		this.item = item;
	}

	/**
	 * 
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#setPrice(java.lang.Double)
	 */
	@Override
	public void setPrice(Double price) {
		notifyObservers(new String("The price of " + item.getName() + " was changed."));
		item.setPrice(price);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#getPrice()
	 */
	@Override
	public Double getPrice() {
		return item.getPrice();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#getName()
	 */
	@Override
	public String getName() {
		return item.getName();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#getItems()
	 */
	@Override
	public Vector<IItem> getItems() {
		return item.getItems();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#find(org.maugiam.shoppingcart.wherehouse.IFilter)
	 */
	@Override
	public Vector<IItem> find(IFilter filter) {
		return item.find(filter);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#sort(java.util.Comparator)
	 */
	@Override
	public Vector<IItem> sort(Comparator<IItem> comparator) {
		return item.sort(comparator);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#getCode()
	 */
	@Override
	public String getCode() {
		return item.getCode();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#setCode(java.lang.String)
	 */
	@Override
	public void setCode(String code) {
		item.setCode(code);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		item.setName(name);
	}
}
