package topic1.manager;

import topic1.wherehouse.IProduct;

public class ObsItemDecorator extends MailingListObservable implements IProduct {

	IProduct item;

	public ObsItemDecorator(IProduct item) {
		this.item = item;
	}

	@Override
	public void setPrice(Double price) {
		notifyObservers(new String("The price of " + item.getName() + " was changed."));
		item.setPrice(price);
	}

	@Override
	public Double getPrice() {
		return item.getPrice();
	}

	@Override
	public String getName() {
		return item.getName();
	}
}
