package org.maugiam.shoppingcart.wherehouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.maugiam.filterable.IFilter;

/**
 * This class extends an abstract item and represents an offer (a collection of
 * AbsItem).
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
	public List<IOffer> getItems() {
		return new ArrayList<IOffer>(items.values());
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String out = name + "..... $ " + getPrice() + "\n";
		for (IOffer offer : items.values()) {
			String item = offer.toString();
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
	public List<IOffer> find(IFilter<IOffer> filter) {
		List<IOffer> filteredItems = new ArrayList<IOffer>();
		for (IOffer offer : items.values()) {
			if (filter.satisfies(offer))
				filteredItems.add(offer);
		}
		return filteredItems;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#sort(java.util.Comparator)
	 */
	@Override
	public List<IOffer> sort(Comparator<IOffer> comparator) {
		// TODO Auto-generated method stub
		List<IOffer> sortedItems = new ArrayList<IOffer>(items.values());
		Collections.sort(sortedItems, comparator);
		return sortedItems;
	}
}
