package topic1.manager;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class MailingList extends LinkedList<String> implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static MailingList instance = null;

	private MailingList() {

	}

	public static MailingList getInstance() {
		if (instance == null)
			instance = new MailingList();
		return instance;
	}

	@Override
	public void update(Observable source, Object message) {
		this.add(message.toString());
	}

}
