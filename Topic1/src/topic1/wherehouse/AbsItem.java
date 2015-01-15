/**
 * 
 */
package topic1.wherehouse;

import java.util.Observable;

/**
 * @author Mau Giam
 *
 */
public abstract class AbsItem extends Observable implements IItem {

	protected String code;
	protected String name;
	protected Double price;
	/**
	 * @param code
	 * @param name
	 */
	public AbsItem(String code, String name) {
		this.code = code;
		this.name = name;

	}

	/**
	 * Empty Constructor
	 */
	public AbsItem() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o){
		try{
			IItem item = (IItem) o;
			return (item.getCode().equals(code));
		}catch (ClassCastException e){
			e.printStackTrace();
			return false;
		}
	}
	
}
