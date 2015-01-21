/**
 * 
 */
package org.maugiam.tdd.main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mauro J Giamberardino
 *
 */
public class WordWrapper {

	public static List<String> wrap(String string, Integer rowLength) {
		ArrayList<String> res = new ArrayList<String>();
		res.add(string);
		return res;
	}

}
