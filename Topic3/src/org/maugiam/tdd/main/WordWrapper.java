/**
 * 
 */
package org.maugiam.tdd.main;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Mauro J Giamberardino
 *
 */
public class WordWrapper {

	public static List<String> wrap(String string, Integer rowLength) {
		ArrayList<String> res = new ArrayList<String>();
		StringTokenizer tok = new StringTokenizer(string, " ");
		while(tok.hasMoreTokens()){
			String next = tok.nextToken();
			res.add(next);
		}
		return res;
	}

}
