package org.maugiam.shoppingcart.wherehouse;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.maugiam.filterable.IFilter;

/**
 * This is the interface of an Item of the shopping cart.
 * 
 * @author Mauro J Giamberardino
 *
 */
public interface IOffer {

	/**
	 * Returns the price of an Item
	 * 
	 * @return
	 */
	public Double getPrice();

	/**
	 * Set the price of an Item
	 * 
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Double price);

	/**
	 * Returns the items list of an Item
	 * 
	 * @return the items list
	 */
	public List<IOffer> getItems();

	/**
	 * Make a search for an item
	 * 
	 * @param filter
	 *            the criteria to search
	 * @return a collection with the search results
	 */
	public List<IOffer> find(IFilter<IOffer> filter);

	/**
	 * Orders a collection of items
	 * 
	 * @param comparator
	 *            the criteria to order
	 * @return a new collection ordered by the criteria
	 */
	public List<IOffer> sort(Comparator<IOffer> comparator);

	/**
	 * Returns the code of an Item
	 * 
	 * @return the code of the item
	 */
	public String getCode();

	/**
	 * Set the code of an Item
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code);

	/**
	 * Returns the name of an Item
	 * 
	 * @return the name of an item
	 */
	public String getName();

	/**
	 * Set the name of an Item
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name);

	/**
	 * Compares this Item with another and returns if are equals
	 * 
	 * @param obj
	 *            the object to compare to
	 * @return if they're equals
	 */
	public boolean equals(Object obj);

}
