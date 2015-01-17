package org.maugiam.shoppingcart.wherehouse;

/**
 * This is an interface for a filter of IItem, this is part of an strategy
 * pattern to make searching procedures over a collection of IItems.
 * 
 * @author Mauro J Giamberardino
 *
 */
public interface IFilter {

	/**
	 * Checks if an item satisfies a condition. The condition must be
	 * implemented in the implementing class of the interface.
	 * 
	 * @param item the item to check if satisfies the condition
	 * @return if the condition is satisfied
	 */
	public Boolean satisfies(IItem item);

}
