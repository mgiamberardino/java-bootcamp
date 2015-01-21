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
public class WordWrapperTest extends TestCase {

	@Test
	public void testShorterThanRowLength() {
		List<String> expected = new ArrayList<String>();
		expected.add("Hello World!");
		assertEquals(expected, WordWrapper.wrap("Hello World!", 60));
		expected = new ArrayList<String>();
		expected.add("Run Forest, Run!");
		assertEquals(expected, WordWrapper.wrap("Run Forest, Run!", 16));
	}

	@Test
	public void testWordsShorterThanRowLength() {
		List<String> expected = new ArrayList<String>();
		expected.add("Hello");
		expected.add("World!");
		assertEquals(expected, WordWrapper.wrap("Hello World!", 6));
	}

	@Test
	public void testTwoWordsInTheRowLength() {
		List<String> expected = new ArrayList<String>();
		expected.add("a b");
		expected.add("c d");
		expected.add("e f");
		assertEquals(expected, WordWrapper.wrap("a b c d e f", 3));
	}

	@Test
	public void testWordsLargerThanRowLength() {
		List<String> expected = new ArrayList<String>();
		expected.add("Excell");
		expected.add("ent");
		expected.add("bottle");
		expected.add("of");
		expected.add("wine.");
		assertEquals(expected, WordWrapper.wrap("Excellent bottle of wine.", 6));
	}

	@Test
	public void testMixingAllBeforeTests() {
		List<String> expected = new ArrayList<String>();
		expected.add("This is");
		expected.add("a kind");
		expected.add("of");
		expected.add("experim");
		expected.add("ent");
		expected.add("trying");
		expected.add("all the");
		expected.add("test");
		expected.add("written");
		expected.add("until");
		expected.add("now.");
		assertEquals(expected, WordWrapper.wrap("This is a kind of experiment trying all the test written until now.", 7));
	}

}
