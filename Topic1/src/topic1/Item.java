package topic1;

import java.util.Vector;

public class Item extends AbsItem {

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


	@Override
	public Double getTotal() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public Vector<IItem> getItems() {
		// TODO Auto-generated method stub
		Vector<IItem> items = new Vector<IItem>();
		items.add(this);
		return items;
	}

	@Override
	public IItem getMostExpensive() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IItem getCheapest() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String toString() {
		return name + " ..... $ " + price + "\n";
	}
}
