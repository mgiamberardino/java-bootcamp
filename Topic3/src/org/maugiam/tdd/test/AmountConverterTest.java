package org.maugiam.tdd.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.maugiam.tdd.main.AmountConverter;

public class AmountConverterTest extends TestCase {

	AmountConverter converter;
	
	public void setUp(){
		converter = new AmountConverter();
	}
	
	@Test
	public void testCreateConverter() {
		assertNotNull(converter);
	}
	
	@Test
	public void testSimpleAmountConver(){
		assertEquals("One dollar",converter.convert(1.00));
	}
	
	@Test
	public void testComplexAmountConver(){
		assertEquals("Two thousand five hundred twenty-three and 04/100 dollars",converter.convert(2523.04));
		System.out.println(converter.convert(1217.0));
		assertEquals("One thousand two hundred seventeen and 20/100 dollars",converter.convert(1217.20));
		assertEquals("One thousand two hundred seventeen dollars",converter.convert(1217.0));
		
	}

}
