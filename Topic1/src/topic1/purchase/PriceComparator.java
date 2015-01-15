package topic1.purchase;

import java.util.Comparator;

import topic1.wherehouse.IItem;

public class PriceComparator implements Comparator<IItem> {

	protected Boolean inverse;

	public PriceComparator(Boolean inverse) {
		this.inverse = inverse;
	}

	@Override
	public int compare(IItem arg0, IItem arg1) {
		// TODO Auto-generated method stub
		int res = 0;
		if (arg0.getPrice() > arg1.getPrice())
			res = 1;
		else if (arg0.getPrice() < arg1.getPrice())
			res = -1;
		if (inverse)
			return res * -1;
		else
			return res;
	}

}
