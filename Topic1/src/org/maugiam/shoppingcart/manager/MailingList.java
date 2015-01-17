package org.maugiam.shoppingcart.manager;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * MailingList is an observer from different actions on the system, the market
 * manager can ask to the mailing list the messages from the system.
 * 
 * @author Mauro J Giamberardino
 */
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
