/**
 * 
 */
package org.maugiam.apps.shoppingcart;

/**
 * @author Mauro J Giamberardino
 *
 */
public class Item {

	private String code;
	private Double price;
	private String name;
	public Item(String code, String name, Double price) {
		this.code = code;
		this.price = price;
		this.name = name;
	}
	
	public Item() {
		code="";
		price=0.0;
		name="";
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * The items are compared by its code.
	 * @return true when two items have the same code
	 */
	@Override
	public boolean equals(Object o){
		try {
			Item item = (Item) o;
			if (!"".equals(code))
				return code.equals(item.getCode());
		} catch (ClassCastException e){
		}
		return false;
	}
	
	
}
