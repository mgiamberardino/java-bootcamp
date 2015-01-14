package topic1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class Offer extends AbsItem {

	HashMap<String,IItem> items;
	
	/**
	 * @param code
	 * @param name
	 * @param items
	 */
	public Offer(String code, String name, HashMap<String,IItem> items) {
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

	@Override
	public Double getTotal() {
		Double total=0.0;
		Iterator<IItem> it = items.values().iterator();
		while(it.hasNext())
			total+=it.next().getTotal();
		return total;
	}

	
	
	/**
	 * @param items the items to set
	 */
	public void addItem(IItem item) {
		items.put(item.getCode(),item);
	}

	@Override
	public Vector<IItem> getItems() {
		return new Vector<IItem>(items.values());
	}

	@Override
	public IItem getMostExpensive() {
		return null;
	}

	@Override
	public IItem getCheapest() {
		return null;
	}

	@Override
	public String toString(){
		Iterator<IItem> it = items.values().iterator();
		String out=name + "..... $ " + getTotal() +"\n";
		while(it.hasNext()){
			String item = it.next().toString();
			String[] splits = item.split("\n",0);
			String aux = "";
			for(int i=0;i<splits.length;i++){
				aux+="    "+splits[i]+"\n";
			}
			out+=aux;
		}
		return out;
	}
}
