/**
 * 
 */
package org.maugiam.services.usercrud;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mauro J Giamberardino
 *
 */
public class Photo {

	/*
	 * It must be auto-generated when it's stored
	 */
	String id;
	/*
	 * The path of the local stored photo or the remote path if it's the param
	 * object
	 */
	String path;
	private List<Like> likes;

	/**
	 * @param id
	 * @param path
	 */
	public Photo(String id, String path) {
		super();
		this.id = id;
		this.path = path;
		likes = new ArrayList<Like>();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	public boolean equals(Object o) {
		try {
			Photo photo = (Photo) o;
			return id.equals(photo.getId());
		} catch (ClassCastException e) {
		}
		return false;
	}

	public int hashCode() {
		return id.hashCode();
	}

	public boolean addLike(Like like) {
		return likes.add(like);
	}

	public List<Like> getLikes() {
		return new ArrayList<Like>(likes);
	}
}
