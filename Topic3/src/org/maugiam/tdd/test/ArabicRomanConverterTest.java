/**
 * 
 */
package org.maugiam.tdd.test;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Mauro J Giamberardino
 *
 */
public class ArabicRomanConverterTest extends TestCase{

	@Test
	public void testNumber_1_To_Roman() {
		assertEquals("I",ArabicRomanConverter.toRoman(1));
	}

	@Test
	public void testNumber_I_To_Arabic() {
		assertEquals(new Integer(1),ArabicRomanConverter.toArabic("I"));
	}
	
	@Test
	public void testNumber_5_To_Roman(){
		assertEquals("V",ArabicRomanConverter.toRoman(5));
	}
	
	@Test
	public void testNumber_V_To_Arabic(){
		assertEquals(new Integer(5),ArabicRomanConverter.toArabic("V"));
	}
	
	@Test
	public void testTenUnitNumber_To_Roman(){
		assertEquals("XIV",ArabicRomanConverter.toRoman(14));
	}
	

	@Test
	public void testTenUnitNumber_To_Arabic(){
		assertEquals(new Integer(14),ArabicRomanConverter.toArabic("XIV"));
	}
	
	@Test
	public void testComplexNumber_To_Roman(){
		assertEquals("MCMXLIX",ArabicRomanConverter.toRoman(1949));
	}
	

	@Test
	public void testComplexNumber_To_Arabic(){
		assertEquals(new Integer(1949),ArabicRomanConverter.toArabic("MCMXLIX"));
	}
}
