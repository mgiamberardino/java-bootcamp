/**
 * 
 */
package org.maugiam.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Mauro J Giamberardino
 * @param <K>
 * @param <V>
 *
 */
public class BidirectionalHashMap<K, V> implements BidirectionalMap<K, V> {

	protected HashMap<K,V> map;
	protected HashMap<V,K> reversedMap;
	
	public BidirectionalHashMap() {
		map = new HashMap<K, V>();
		reversedMap = new HashMap<V, K>();
	}
	
	@Override
	public void clear() {
		map.clear();
		reversedMap.clear();
	}
	@Override
	public boolean containsKey(Object key) {
		return (map.containsKey(key)||reversedMap.containsKey(key));
	}
	@Override
	public boolean containsValue(Object value) {
		return (map.containsValue(value)||reversedMap.containsValue(value));
	}
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		return map.entrySet();
	}
	@Override
	public V get(Object key) {
		return map.get(key);
	}
	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}
	@Override
	public Set<K> keySet() {
		return map.keySet();
	}
	@Override
	public V put(K key, V value) {
		reversedMap.put(value, key);
		return map.put(key, value);
	}
	@Override
	public void putAll(Map<? extends K, ? extends V> c) {
		Iterator<? extends K> it = c.keySet().iterator();
		while(it.hasNext()){
			K next = it.next();
			reversedMap.put(c.get(next), next);
		}
		map.putAll(c);
	}
	
	@Override
	public V remove(Object key) {
		V value = map.remove(key);
		reversedMap.remove(value);
		return value;
	}
	@Override
	public int size() {
		return map.size();
	}
	@Override
	public Collection<V> values() {
		return map.values();
	}
	@Override
	public V getValue(Object key) {
		return get(key);
	}
	@Override
	public K getKey(Object value) {
		return reversedMap.get(value);
	}
	
}
