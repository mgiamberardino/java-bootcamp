package topic1.wherehouse;

import java.util.Comparator;
import java.util.Vector;

public class Item extends AbsItem implements IProduct {

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
	
	/*@Override
	public Double getTotal() {
		// TODO Auto-generated method stub
		return price;
	}*/

	@Override
	public Vector<IItem> getItems() {
		// TODO Auto-generated method stub
		Vector<IItem> items = new Vector<IItem>();
		items.add(this);
		return items;
	}

	@Override
	public String toString() {
		return name + " ..... $ " + price + "\n";
	}

	@Override
	public Vector<IItem> find(IFilter filter) {
		// TODO Auto-generated method stub
		Vector<IItem> items = new Vector<IItem>();
		if (filter.cumple(this))
			items.add(this);
		return items;
	}

	@Override
	public Vector<IItem> sort(Comparator<IItem> comparator) {
		// TODO Auto-generated method stub
		Vector<IItem> items = new Vector<IItem>();
		items.add(this);
		return items;
	}

}
