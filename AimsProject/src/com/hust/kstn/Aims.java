package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lord of the Bing Chilling", "Fantasy", "John China", 121, 119.2);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Peach Blossom, Pho and Piano", "War/Romance", "Phi Tien Son", 100, 120.0);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Josee, the Tiger and the Fish", "Romance", "Kotaro Tamura", 98, 118.0);
		
		//there is something called Mario Kart 
		Cart mario_cart = new Cart();
		mario_cart.removeDVD(dvd1);
		mario_cart.addDVD(dvd1);
		mario_cart.addDVD(dvd2);
		mario_cart.removeDVD(dvd1);
		mario_cart.removeDVD(dvd3);
		mario_cart.addDVD(dvd1);
		mario_cart.print();
		mario_cart.calculateTotalCost();
		
		System.out.println();
		
		//here comes his brother
		Cart luigi_cart = new Cart();
		//Luigi loves Vietnam, so he did this
		for (int i = 0; i < 20; ++ i) {
			luigi_cart.addDVD(dvd2);
		}
		//he wants to watch a Chinese film too
		luigi_cart.addDVD(dvd1);
		luigi_cart.removeDVD(dvd2);
		luigi_cart.addDVD(dvd1);
		
	}
}
