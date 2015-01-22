/**
 * 
 */
package org.maugiam.collections;

import java.util.Map;

/**
 * @author Mauro J Giamberardino
 * @param <V>
 * @param <K>
 *
 */
public interface BidirectionalMap<K, V> extends Map<K, V> {

	/**
	 * Returns the value to which the specified key is mapped, or null if this
	 * map contains no mapping for the key.
	 */
	public V getValue(Object key);

	/**
	 * Returns the key to which the specified value is mapped, or null if this
	 * map contains no mapping for the value.
	 */
	public K getKey(Object value);
}
