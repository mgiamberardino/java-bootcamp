package org.maugiam.shoppingcart.wherehouse;

import java.util.Comparator;
import java.util.Vector;

import org.maugiam.filterable.IFilter;

/**
 * This class extends an abstract item and represents a single item.
 * 
 * @author Mauro J Giamberardino
 *
 */
public class Item extends AbsOffer implements IOffer {

	protected Double price;

	/**
	 * @param code
	 * @param name
	 * @param price
	 */
	public Item(String code, String name, Double price) {
		super(code, name);
		this.price = price;
	}

	/**
	 * @param code
	 * @param name
	 */
	public Item(String code, String name) {
		super(code, name);
	}

	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getItems()
	 */
	@Override
	public Vector<IOffer> getItems() {
		// TODO Auto-generated method stub
		Vector<IOffer> items = new Vector<IOffer>();
		items.add(this);
		return items;
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name + " ..... $ " + price + "\n";
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#find(org.maugiam.filterable.IFilter)
	 */
	@Override
	public Vector<IOffer> find(IFilter<IOffer> filter) {
		// TODO Auto-generated method stub
		Vector<IOffer> items = new Vector<IOffer>();
		if (filter.satisfies(this))
			items.add(this);
		return items;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#sort(java.util.Comparator)
	 */
	@Override
	public Vector<IOffer> sort(Comparator<IOffer> comparator) {
		// TODO Auto-generated method stub
		Vector<IOffer> items = new Vector<IOffer>();
		items.add(this);
		return items;
	}

}
