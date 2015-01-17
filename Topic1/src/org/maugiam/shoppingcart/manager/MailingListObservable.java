package org.maugiam.shoppingcart.manager;

import java.util.Observable;

/**
 * This class helps to add the mailing list observer to all observables elements
 * 
 * @author Mauro J Giamberardino
 */
public class MailingListObservable extends Observable {

	public MailingListObservable() {
		this.addObserver(MailingList.getInstance());
	}

}
