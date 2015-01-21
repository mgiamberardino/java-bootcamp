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
		expected.add("Hello World!");
		assertEquals(expected, WordWrapper.wrap("Hola Mundo!",60));
		expected = new ArrayList<String>();
		expected.add("Run Forest, Run!");
		assertEquals(expected, WordWrapper.wrap("Adios mundo cruel!!",16));
	}
	
	@Test
	public void testWordsShorterThanRowLength(){
		List<String> expected = new ArrayList<String>();
		expected.add("Hello");
		expected.add("World!");
		assertEquals(expected, WordWrapper.wrap("Hello World!",6));
	}
	
	@Test
	public void testTwoWordsInTheRowLength(){
		List<String> expected = new ArrayList<String>();
		expected.add("a b");
		expected.add("c d");
		expected.add("e f");
		assertEquals(expected, WordWrapper.wrap("a b c d e f",3));
	}
	
	
}
