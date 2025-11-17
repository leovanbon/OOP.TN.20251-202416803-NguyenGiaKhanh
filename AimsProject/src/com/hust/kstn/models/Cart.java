package com.hust.kstn.models;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	
	public Cart() {
		System.out.println("Hello!");
	}
	
	public boolean addDVD(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsInCart[qtyOrdered] = disc;
			++ qtyOrdered;
			System.out.println("Sucessfully added: " + disc.getTitle() + ".");
			if (qtyOrdered == MAX_NUMBER_ORDERED) System.out.println("Warning: cart is full.");
			return true;
		}
		else {
			System.out.println("Cannot add " + disc.getTitle() + ", cart is full.");
			return false;
		}
	}

	public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		addDVD(disc1);
		if(addDVD(disc2)) System.out.println("Added 2 DVDs to cart.");
		else System.out.println("Added one, cannot add another.");
	}
	
	public void addDVD(DigitalVideoDisc... discs) {
		int qtyAdded = 0;
		for(DigitalVideoDisc disc : discs) {
			if(addDVD(disc)) qtyAdded++;
		}
		System.out.println("Added " + qtyAdded + " out of " + discs.length + " DVD(s).");
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (qtyOrdered < 1) { 
			System.out.println("Cart empty, there is nothing to be removed.");
			return;
		}
		
		boolean isRemoved = false;
		for (int i = 0 ; i < qtyOrdered; ++ i) {
			if (!itemsInCart[i].equals(disc)) continue;
			
			isRemoved = true;
			for (int j = i; j < qtyOrdered - 1; ++j) {
				itemsInCart[j]= itemsInCart[j+1];
			}
			-- qtyOrdered;
			itemsInCart[qtyOrdered] = null;
			break;
		}
		
		if (isRemoved) System.out.println("Sucessfully removed: " + disc.getTitle() + " .");
		else System.out.println("Your cart does not contain that disc."); 	
	}
	
	public double calculateTotalCost() {
	    double totalCost = 0.0;
	    for (int i = 0; i < qtyOrdered; i++) {
	        totalCost += itemsInCart[i].getCost();
	    }
	    System.out.println("Your cart value: " + totalCost);
	    return totalCost;
	}
	
	public void print() {
	    System.out.println("=== Your cart has: " + qtyOrdered + " items ===");
	    System.out.println("=== All items in cart ===");
	    for (int i = 0; i < qtyOrdered; i++) {
	        DigitalVideoDisc item = itemsInCart[i];
	        System.out.println((i+1) + ". [Title]: " + item.getTitle() + ", [Cost]: " + item.getCost());
	    }
	    System.out.println("=== that's all ===");
	}
	
}
