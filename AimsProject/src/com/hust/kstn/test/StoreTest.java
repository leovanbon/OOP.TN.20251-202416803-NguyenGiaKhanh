package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {
	public static void main(String args[]) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lord of the Bing Chilling", "Fantasy", "John China", 121, 119.2);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Peach Blossom, Pho and Piano", "War/Romance", "Phi Tien Son", 100, 120.0);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Josee, the Tiger and the Fish", "Romance", "Kotaro Tamura", 98, 118.0);
		Store store = new Store();
				
		store.addDVD(dvd1,dvd2,dvd3);
		store.print();
		
		store.removeDVD(dvd3);
		store.removeDVD(dvd3);
		store.print();
		store.removeDVD(dvd2);
		store.removeDVD(dvd1);
		store.removeDVD(dvd1);
		store.print();
	}
}
