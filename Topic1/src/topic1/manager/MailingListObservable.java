package topic1.manager;

import java.util.Observable;

public class MailingListObservable extends Observable {

	public MailingListObservable() {
		this.addObserver(MailingList.getInstance());
	}

}
