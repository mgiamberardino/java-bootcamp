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

	protected WordWrapper wrapper;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		wrapper= new WordWrapper();
	}

	@Test
	public void testCreateWordWrapper() throws Exception{
		assertNotNull(wrapper);
	}
	
	
}
