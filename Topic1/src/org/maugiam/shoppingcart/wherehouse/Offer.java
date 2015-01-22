package org.maugiam.shoppingcart.wherehouse;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import org.maugiam.filterable.IFilter;

/**
 * This class extends an abstract item and represents an offer (a collection of AbsItem).
 * 
 * @author Mauro J Giamberardino
 *
 */
public class Offer extends AbsOffer {

	HashMap<String, IOffer> items;

	/**
	 * @param code
	 * @param name
	 * @param items
	 */
	public Offer(String code, String name, HashMap<String, IOffer> items) {
		super(code, name);
		this.items = items;
	}

	/**
	 * @param code
	 * @param name
	 */
	public Offer(String code, String name) {
		super(code, name);
		this.items = new HashMap<String, IOffer>();
	}

	/**
	 * Empty Constructor
	 */
	public Offer() {
		super();
		this.items = new HashMap<String, IOffer>();
	}

	/**
	 * Add an item to the offer
	 * 
	 * @param item
	 *            the item to add
	 */
	public void addItem(IOffer item) {
		items.put(item.getCode(), item);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getItems()
	 */
	@Override
	public Vector<IOffer> getItems() {
		return new Vector<IOffer>(items.values());
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		Iterator<IOffer> it = items.values().iterator();
		String out = name + "..... $ " + getPrice() + "\n";
		while (it.hasNext()) {
			String item = it.next().toString();
			String[] splits = item.split("\n", 0);
			String aux = "";
			for (int i = 0; i < splits.length; i++) {
				aux += "    " + splits[i] + "\n";
			}
			out += aux;
		}
		return out;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#find(org.maugiam.filterable.IFilter)
	 */
	@Override
	public Vector<IOffer> find(IFilter<IOffer> filter) {
		Vector<IOffer> filteredItems = new Vector<IOffer>();
		Iterator<IOffer> it = items.values().iterator();
		while (it.hasNext()) {
			IOffer aux = it.next();
			if (filter.satisfies(aux))
				filteredItems.add(aux);
		}
		return filteredItems;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#sort(java.util.Comparator)
	 */
	@Override
	public Vector<IOffer> sort(Comparator<IOffer> comparator) {
		// TODO Auto-generated method stub
		Vector<IOffer> sortedItems = new Vector<IOffer>(items.values());
		Collections.sort(sortedItems, comparator);
		return sortedItems;
	}
}
