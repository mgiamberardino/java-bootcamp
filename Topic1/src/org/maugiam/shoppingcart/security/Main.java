package org.maugiam.shoppingcart.security;

import org.maugiam.shoppingcart.wherehouse.Item;
import org.maugiam.shoppingcart.wherehouse.Offer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item i1 = new Item("1111", "Dulce", 15.0);
		Item i2 = new Item("1112", "Miel", 12.0);
		Item i3 = new Item("1113", "Membrillo", 11.0);
		Offer of1 = new Offer("OF111", "Canasta Basica");
		Offer of2 = new Offer("OF112", "Canasta de Ofertas");
		of1.addItem(i1);
		of1.addItem(i2);
		of2.addItem(of1);
		of2.addItem(i3);
		System.out.println(of1.toString());
		System.out.println(of2.toString());

	}

}
