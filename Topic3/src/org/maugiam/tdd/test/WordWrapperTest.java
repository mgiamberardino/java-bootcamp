/**
 * 
 */
package org.maugiam.tdd.test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.maugiam.tdd.main.WordWrapper;

/**
 * @author Mauro J Giamberardino
 *
 */
public class WordWrapperTest extends TestCase{
	

	@Test
	public void testShorterThan60(){
		WordWrapper.wrap("Hola Mundo!");
	}
	
}
