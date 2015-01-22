/**
 * 
 */
package org.maugiam.tdd.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.maugiam.collections.BidirectionalHashMap;
import org.maugiam.collections.BidirectionalMap;

/**
 * @author Mauro J Giamberardino
 *
 */
public class ArabicRomanConverter {

	protected static BidirectionalMap<String, Integer> numbers;

	static {
		numbers = new BidirectionalHashMap<String, Integer>();
		numbers.put("I", 1);
		numbers.put("IV", 4);
		numbers.put("V", 5);
		numbers.put("IX", 9);
		numbers.put("X", 10);
		numbers.put("XL", 40);
		numbers.put("L", 50);
		numbers.put("XC", 90);
		numbers.put("C", 100);
		numbers.put("CD", 400);
		numbers.put("D", 500);
		numbers.put("CM", 900);
		numbers.put("M", 1000);
	}

	public static String toRoman(Integer number) {
		String roman = "";
		List<Integer> list = new ArrayList<Integer>(numbers.values());
		Collections.sort(list);
		Collections.reverse(list);
		Integer N = number;
		for ( Integer i: list){
			while (N >= i) {
				roman += numbers.getKey(i);
				N -= i;
			}
		}
		System.out.println(roman);
		return roman;
	}

	public static Integer toArabic(String romanNumber) {
		if (romanNumber.length() > 1) {
			Integer sum = 0;
			Integer previous = null;

			for (int i = 0; i < romanNumber.length(); i++) {
				Integer actual = numbers.get("" + romanNumber.charAt(i));
				System.out.println(romanNumber.charAt(i) + " " + actual);
				if (previous == null)
					previous = actual;
				if (previous < actual)
					sum -= 2 * previous;
				previous = actual;
				sum += actual;
			}
			System.out.println(sum);
			return sum;
		}

		return numbers.getValue(romanNumber);
	}

}
