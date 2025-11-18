package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Cart;

public class CartTest {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lord of the Bing Chilling", "Fantasy", "John China", 121, 119.2);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Peach Blossom, Pho and Piano", "War/Romance", "Phi Tien Son", 100, 120.0);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Josee, the Tiger and the Fish", "Romance", "Kotaro Tamura", 98, 118.0);
		Cart cart = new Cart();
		
		cart.addDVD(dvd1,dvd2,dvd3);
		cart.print();
		
		cart.removeDVD(dvd3);
		cart.removeDVD(dvd3);
		cart.print();
		cart.removeDVD(dvd2);
		cart.removeDVD(dvd1);
		cart.removeDVD(dvd1);
		
		for (int i = 0; i < 20; ++ i) {
			cart.addDVD(dvd1);
		}
		cart.addDVD(dvd1);
		cart.print();
	}
	
	
}
