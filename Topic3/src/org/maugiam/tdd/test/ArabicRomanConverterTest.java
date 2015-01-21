/**
 * 
 */
package org.maugiam.tdd.test;

import static org.junit.Assert.fail;
import junit.framework.TestCase;

import org.junit.Before;
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
	
}
