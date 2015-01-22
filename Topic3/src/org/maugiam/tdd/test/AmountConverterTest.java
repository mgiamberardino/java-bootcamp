package org.maugiam.tdd.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.maugiam.tdd.main.AmountConverter;

public class AmountConverterTest extends TestCase {

	@Test
	public void testSimpleAmountConver() {
		assertEquals("One dollar", AmountConverter.convert(1.00));
	}

	@Test
	public void testComplexAmountConver() {
		assertEquals("Two thousand five hundred twenty-three and 04/100 dollars", AmountConverter.convert(2523.04));
		assertEquals("One thousand two hundred seventeen and 20/100 dollars", AmountConverter.convert(1217.20));
		assertEquals("One thousand two hundred seventeen dollars", AmountConverter.convert(1217.0));
	}

}
