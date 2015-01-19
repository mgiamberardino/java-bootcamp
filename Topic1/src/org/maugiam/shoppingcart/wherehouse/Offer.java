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
public class Offer extends AbsItem {

	HashMap<String, IItem> items;

	/**
	 * @param code
	 * @param name
	 * @param items
	 */
	public Offer(String code, String name, HashMap<String, IItem> items) {
		super(code, name);
		this.items = items;
	}

	/**
	 * @param code
	 * @param name
	 */
	public Offer(String code, String name) {
		super(code, name);
		this.items = new HashMap<String, IItem>();
	}

	/**
	 * Empty Constructor
	 */
	public Offer() {
		super();
		this.items = new HashMap<String, IItem>();
	}

	/**
	 * Add an item to the offer
	 * 
	 * @param item
	 *            the item to add
	 */
	public void addItem(IItem item) {
		items.put(item.getCode(), item);
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#getItems()
	 */
	@Override
	public Vector<IItem> getItems() {
		return new Vector<IItem>(items.values());
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		Iterator<IItem> it = items.values().iterator();
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
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#find(org.maugiam.filterable.IFilter)
	 */
	@Override
	public Vector<IItem> find(IFilter<IItem> filter) {
		Vector<IItem> filteredItems = new Vector<IItem>();
		Iterator<IItem> it = items.values().iterator();
		while (it.hasNext()) {
			IItem aux = it.next();
			if (filter.satisfies(aux))
				filteredItems.add(aux);
		}
		return filteredItems;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IItem#sort(java.util.Comparator)
	 */
	@Override
	public Vector<IItem> sort(Comparator<IItem> comparator) {
		// TODO Auto-generated method stub
		Vector<IItem> sortedItems = new Vector<IItem>(items.values());
		Collections.sort(sortedItems, comparator);
		return sortedItems;
	}
}
