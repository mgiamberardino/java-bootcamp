/**
 * 
 */
package org.maugiam.tdd.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.maugiam.tdd.main.WordWrapper;

/**
 * @author Mauro J Giamberardino
 *
 */
public class WordWrapperTest extends TestCase{
	

	@Test
	public void testShorterThanRowLength(){
		List<String> expected = new ArrayList<String>();
		expected.add("Hola Mundo!");
		assertEquals(expected, WordWrapper.wrap("Hola Mundo!",60));
		expected = new ArrayList<String>();
		expected.add("Adios mundo cruel!!");
		assertEquals(expected, WordWrapper.wrap("Adios mundo cruel!!",60));
	}
	
	
	
	
	
}
