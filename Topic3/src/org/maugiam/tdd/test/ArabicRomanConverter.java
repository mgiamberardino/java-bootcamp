/**
 * 
 */
package org.maugiam.tdd.test;

import org.maugiam.collections.BidirectionalHashMap;

/**
 * @author Mauro J Giamberardino
 *
 */
public class ArabicRomanConverter {

	
	protected static BidirectionalHashMap<String, Integer> numbers;
	
	static {
		numbers = new BidirectionalHashMap<String, Integer>();
		numbers.put("I",1);
		numbers.put("IV",4);
		numbers.put("V",5);
		numbers.put("IX",9);
		numbers.put("X",10);
		numbers.put("XL",40);
		numbers.put("L",50);
		numbers.put("XC",90);
		numbers.put("C",100);
		numbers.put("CD",400);
		numbers.put("D",500);
		numbers.put("CM",900);
		numbers.put("M",1000);	
	}
	
	  private static int[]    orderedValues = { 1000,  900,  500,  400,  100,   90,  
          50,   40,   10,    9,    5,    4,    1 };

	public static String toRoman(Integer number) {
        String roman = "";
        Integer N = number;
        for (int i = 0; i < orderedValues.length; i++) {
           while (N >= orderedValues[i]) {
              roman += numbers.getKey(orderedValues[i]);
              N -= orderedValues[i];
           }
        }
        System.out.println(roman);
		return roman;
	}

	public static Integer toArabic(String romanNumber) {
		if(romanNumber.length()>1){
			Integer sum=0;
			Integer previous=null;

			for(int i = 0; i<romanNumber.length();i++){
				Integer actual=numbers.get(""+romanNumber.charAt(i));
				System.out.println(romanNumber.charAt(i)+" "+actual);
				if(previous==null)
					previous=actual;
				if (previous<actual)
					sum-=2*previous; 
				previous=actual;
				sum+=actual;
			}
			System.out.println(sum);
			return sum;
		}

		return numbers.getValue(romanNumber);
	}
	
	

}
