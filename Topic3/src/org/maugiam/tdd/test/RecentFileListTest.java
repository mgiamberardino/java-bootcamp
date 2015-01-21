/**
 * 
 */
package org.maugiam.tdd.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		recent=new RecentFileList(5);
	}

	@Test
	public void testCreateInstance() {
		assertNotNull(recent);
	}

	@Test
	public void testEmptyListOnFirstTime(){
		assertEquals(new ArrayList<String>(), recent.getRecentList());
	}
	
	@Test
	public void testAddOnOppening(){
		recent.addOpenedFile("C:\folder\file1.test");
		List<String> expected = new ArrayList<String>();
		expected.add("C:\folder\file1.test");
		assertEquals(expected,recent.getRecentList());
	}
	
	@Test
	public void testInsertionOrder(){
		recent.addOpenedFile("C:\folder\file1.test");
		recent.addOpenedFile("C:\folder\file2.test");
		List<String> expected = new LinkedList<String>();
		expected.add("C:\folder\file2.test");
		expected.add("C:\folder\file1.test");
		assertEquals(expected,recent.getRecentList());
	}
	
	@Test
	public void testNoDuplicates(){
		recent.addOpenedFile("C:\folder\file1.test");
		recent.addOpenedFile("C:\folder\file2.test");
		recent.addOpenedFile("C:\folder\file1.test");
		List<String> expected = new LinkedList<String>();
		expected.add("C:\folder\file1.test");
		expected.add("C:\folder\file2.test");
		assertEquals(expected,recent.getRecentList());
	}
	
	public void testFullList(){
		recent.addOpenedFile("C:\folder\file1.test");
		recent.addOpenedFile("C:\folder\file2.test");
		recent.addOpenedFile("C:\folder\file3.test");
		recent.addOpenedFile("C:\folder\file4.test");
		recent.addOpenedFile("C:\folder\file5.test");
		recent.addOpenedFile("C:\folder\file6.test");
		List<String> expected = new LinkedList<String>();
		expected.add("C:\folder\file6.test");
		expected.add("C:\folder\file5.test");
		expected.add("C:\folder\file4.test");
		expected.add("C:\folder\file3.test");
		expected.add("C:\folder\file2.test");
		assertEquals(expected,recent.getRecentList());
	}
	
	
	
}
