package org.maugiam.shoppingcart.manager;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.maugiam.filterable.IFilter;
import org.maugiam.shoppingcart.wherehouse.IOffer;

/**
 * This decorator adds the observable functionality to the Products
 * 
 * @author Mauro J Giamberardino
 */
public class ObsItemDecorator extends MailingListObservable implements IOffer {

	/**
	 * Decorated Product
	 */
	IOffer item;

	public ObsItemDecorator(IOffer item) {
		this.item = item;
	}

	/**
	 * 
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#setPrice(java.lang.Double)
	 */
	@Override
	public void setPrice(Double price) {
		notifyObservers(new String("The price of " + item.getName() + " was changed."));
		item.setPrice(price);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getPrice()
	 */
	@Override
	public Double getPrice() {
		return item.getPrice();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getName()
	 */
	@Override
	public String getName() {
		return item.getName();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getItems()
	 */
	@Override
	public List<IOffer> getItems() {
		return item.getItems();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#find(org.maugiam.filterable.IFilter)
	 */
	@Override
	public List<IOffer> find(IFilter<IOffer> filter) {
		return item.find(filter);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#sort(java.util.Comparator)
	 */
	@Override
	public List<IOffer> sort(Comparator<IOffer> comparator) {
		return item.sort(comparator);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getCode()
	 */
	@Override
	public String getCode() {
		return item.getCode();
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#setCode(java.lang.String)
	 */
	@Override
	public void setCode(String code) {
		item.setCode(code);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		item.setName(name);
	}
}
