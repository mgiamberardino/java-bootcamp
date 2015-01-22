/**
 * 
 */
package org.maugiam.shoppingcart.wherehouse;

import java.util.Observable;

/**
 * This is an abstract class that implements Iitem interface. This class
 * abstracts all the common behavior of classes implementing the IItem
 * interface.
 * 
 * @author Mauro J Giamberardino
 *
 */
public abstract class AbsOffer extends Observable implements IOffer {

	protected String code;
	protected String name;
	protected Double price;

	/**
	 * @param code
	 *            the code of the item
	 * @param name
	 *            the name of the item
	 */
	public AbsOffer(String code, String name) {
		this.code = code;
		this.name = name;
	}

	/**
	 * Empty Constructor
	 */
	public AbsOffer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getPrice()
	 */
	@Override
	public Double getPrice() {
		return price;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#setPrice(java.lang.Double)
	 */
	@Override
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getCode()
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#setCode(java.lang.String)
	 */
	@Override
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @see org.maugiam.shoppingcart.wherehouse.IOffer#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		try {
			IOffer item = (IOffer) o;
			return (item.getCode().equals(code));
		} catch (ClassCastException e) {
			e.printStackTrace();
			return false;
		}
	}

}
