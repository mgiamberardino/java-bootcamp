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
		if (string.length()<=rowLength)
			res.add(string);
		else {
			String wordAux="";
			while(tok.hasMoreTokens()){
				String next = tok.nextToken();
				if((!wordAux.equals(""))&&
					((wordAux.length()+next.length()+1)>rowLength)){
					res.add(wordAux);
					wordAux="";
				}
				if(next.length() <= rowLength){
					if (wordAux.length()>0)
						wordAux+=" ";
					wordAux+=next;
				} else {
					String trim = next;
					while(trim.length()>rowLength){
						res.add(trim.substring(0, rowLength));
						trim=trim.substring(rowLength);
					}
					wordAux=trim;
				}
			}
			if(!wordAux.equals(""))
				res.add(wordAux);
		}
		return res;
	}
}
