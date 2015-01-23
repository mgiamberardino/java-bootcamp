/**
 * 
 */
package org.maugiam.apps.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Mauro J Giamberardino
 * @param <Item>
 *
 */
public class ShoppingCartImpl implements ShoppingCart {

	List<Item> items;
	
	public ShoppingCartImpl() {
		items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	/**
	 * It's return a copy of the map of <Item,Quantity>.
	 */
	public List<Item> getItems() {
		return new ArrayList<Item>(items);
	}

	public Double getTotal() {
		Double sum=0.0;
		for(Item i: items){
			sum+=i.getPrice();
		}
		return sum;
	}

	public Integer getSize() {
		return items.size();
	}

}
