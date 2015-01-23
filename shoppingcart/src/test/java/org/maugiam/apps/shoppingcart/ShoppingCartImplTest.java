package org.maugiam.apps.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ShoppingCartImplTest extends TestCase {

	ShoppingCartImpl cart;
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ShoppingCartImplTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ShoppingCartImplTest.class );
    }

	
	protected void setUp() throws Exception {
		super.setUp();
		cart = new ShoppingCartImpl();
	}
	
	public void testCreation(){
		assertNotNull(cart);
	}
	
	public void testAddAndGetItems(){
		Item item = new Item("IT102","Item 1",25.0);
		Item item2 = new Item("IT103","Item 2",20.1);
		Item item3 = new Item("IT104","Item 3",10.1);
		Item item4 = new Item("IT105","Item 4",250.1);
		cart.addItem(item);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		List<Item> expected = new ArrayList<Item>();
		expected.add(item);
		expected.add(item2);
		expected.add(item3);
		expected.add(item4);
		assertEquals(expected,cart.getItems());
	}
	
	public void testRemoveItem(){
		Item item = new Item("IT1023","Item 1",25.41);
		Item item2 = new Item("IT1023","Item 1",25.41);
		List<Item> expected = new ArrayList<Item>();
		cart.addItem(item);
		cart.removeItem(item2);
		assertEquals(expected, cart.getItems());
	}
	
	public void testGetSize(){
		Item item = new Item("IT1023","Item 1",25.41);
		Item item2 = new Item("IT1023","Item 1",25.41);
		cart.addItem(item);
		cart.addItem(item2);
		assertEquals(new Integer(2),cart.getSize());
	}
	
	public void testGetTotal(){
		Item item = new Item("IT102","Item 1",25.0);
		Item item2 = new Item("IT103","Item 1",20.1);
		cart.addItem(item);
		cart.addItem(item2);
		assertEquals(new Double(45.1),cart.getTotal());
	}
	
	
}
