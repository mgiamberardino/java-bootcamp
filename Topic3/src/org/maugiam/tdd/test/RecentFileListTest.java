/**
 * 
 */
package org.maugiam.tdd.test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.maugiam.tdd.main.RecentFileList;

/**
 * @author Mauro J Giamberardino
 *
 */
public class RecentFileListTest extends TestCase{

	RecentFileList recent;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		recent=new RecentFileList(15);
	}

	@Test
	public void testCreateInstance() {
		assertNotNull(recent);
	}

	
	
}
