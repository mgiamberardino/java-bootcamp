package org.maugiam.tdd.main;

import java.util.HashMap;

public class AmountConverter {

	protected HashMap<Integer, String> numbers;
	protected HashMap<Integer, String> tenNames;

	public AmountConverter() {
		numbers = new HashMap<Integer, String>();
		numbers.put(new Integer(0), "zero");
		numbers.put(new Integer(1), "one");
		numbers.put(new Integer(2), "two");
		numbers.put(new Integer(3), "three");
		numbers.put(new Integer(4), "four");
		numbers.put(new Integer(5), "five");
		numbers.put(new Integer(6), "six");
		numbers.put(new Integer(7), "seven");
		numbers.put(new Integer(8), "eight");
		numbers.put(new Integer(9), "nine");
		numbers.put(new Integer(10), "ten");
		numbers.put(new Integer(11), "eleven");
		numbers.put(new Integer(12), "twelve");
		numbers.put(new Integer(13), "thirteen");
		numbers.put(new Integer(14), "fourteen");
		numbers.put(new Integer(15), "fiveteen");
		numbers.put(new Integer(16), "sixteen");
		numbers.put(new Integer(17), "seventeen");
		numbers.put(new Integer(18), "eighteen");
		numbers.put(new Integer(19), "nineteen");
		tenNames = new HashMap<Integer, String>();
		tenNames.put(new Integer(2), "twenty");
		tenNames.put(new Integer(3), "thirty");
		tenNames.put(new Integer(4), "forty");
		tenNames.put(new Integer(5), "fifty");
		tenNames.put(new Integer(6), "sixty");
		tenNames.put(new Integer(7), "seventy");
		tenNames.put(new Integer(8), "eighty");
		tenNames.put(new Integer(9), "ninety");

	}

	public String convert(Double amount) {
		Integer intNumber = new Integer((int) Math.floor(amount));
		Integer hundredUnit = (intNumber % 1000) / 100;
		Integer thousandUnit = (intNumber % 10000) / 1000;
		Integer decNumber = new Integer((int) Math.round((amount - intNumber) * 100));
		String text = " dollars";
		if (amount.equals(1.0))
			text = " dollar";
		if (!decNumber.equals(0))
			text = " and " + (decNumber % 100) / 10 + "" + (decNumber % 10) + "/100" + text;
		text = getTenUnitText(intNumber) + text;
		if (!hundredUnit.equals(new Integer(0)))
			text = numbers.get(hundredUnit) + " hundred " + text;
		if (!thousandUnit.equals(new Integer(0)))
			text = numbers.get(thousandUnit) + " thousand " + text;
		String capitalLetter = text.substring(0, 1).toUpperCase();
		return capitalLetter + text.substring(1);
	}

	private String getTenUnitText(Integer intNumber) {
		Integer unit = intNumber % 10;
		Integer tenUnit = (intNumber % 100) / 10;
		if (tenUnit.equals(new Integer(1))) {
			return numbers.get((tenUnit * 10) + unit);
		}
		String tenName = tenNames.get(tenUnit);
		String unitName = numbers.get(unit);
		if ((!unit.equals(new Integer(0))) && (!tenUnit.equals(new Integer(0))))
			return tenName + "-" + unitName;
		else if (!unit.equals(new Integer(0)))
			return unitName;
		else
			return tenName;
	}

}
