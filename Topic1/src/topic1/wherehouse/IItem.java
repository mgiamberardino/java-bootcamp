package topic1.wherehouse;

import java.util.Comparator;
import java.util.Vector;

public interface IItem {

	public Double getPrice();

	public Vector<IItem> getItems();

	public Vector<IItem> find(IFilter filter);

	public Vector<IItem> sort(Comparator<IItem> comparator);

	public String getCode();
	
	public boolean equals(Object o);

}
