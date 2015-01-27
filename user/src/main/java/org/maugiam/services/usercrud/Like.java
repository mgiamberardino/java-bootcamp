/**
 * 
 */
package org.maugiam.services.usercrud;

import java.util.Date;

/**
 * @author Mauro J Giamberardino
 *
 */
public class Like {

	User from;
	Date timestamp;

	/**
	 * @param from
	 * @param timestamp
	 */
	public Like(User from, Date timestamp) {
		super();
		this.from = from;
		this.timestamp = timestamp;
	}

	/**
	 * 
	 */
	public Like() {
		super();
	}

	/**
	 * @return the from
	 */
	public User getFrom() {
		return from;
	}

	/**
	 * @param from
	 *            the from to set
	 */
	public void setFrom(User from) {
		this.from = from;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {

		this.timestamp = timestamp;
	}

}
