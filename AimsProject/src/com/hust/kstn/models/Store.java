package com.hust.kstn.models;

public class Store {
	private static final int TEMPORARY_MAX = 100;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[TEMPORARY_MAX];
	private int qtyStored = 0;
	
	public Store() {
		System.out.println("Hello! I'm a store.");
	}
	
	
	public boolean addDVD(DigitalVideoDisc disc) {
		if (qtyStored < TEMPORARY_MAX) {
			itemsInStore[qtyStored] = disc;
			++ qtyStored;
			System.out.println("Sucessfully added: " + disc.getTitle() + ".");
			if (qtyStored == TEMPORARY_MAX) System.out.println("Warning: store is full.");
			return true;
		}
		else {
			System.out.println("Cannot add " + disc.getTitle() + ", store is full.");
			return false;
		}
	}
	public void addDVD(DigitalVideoDisc... discs) {
		int qtyAdded = 0;
		for(DigitalVideoDisc disc : discs) {
			if(addDVD(disc)) qtyAdded++;
		}
		System.out.println("Added " + qtyAdded + " out of " + discs.length + " DVD(s).");
	}
	
	
	public boolean removeDVD(DigitalVideoDisc disc) {
//		changed to boolean for bulk remove method
		if (qtyStored < 1) { 
			System.out.println("Store now empty, there is nothing to be removed.");
			return false;
		}
		
		boolean isRemoved = false;
		for (int i = 0 ; i < qtyStored; ++ i) {
			if (!itemsInStore[i].equals(disc)) continue;
			
			isRemoved = true;
			for (int j = i; j < qtyStored - 1; ++j) {
				itemsInStore[j]= itemsInStore[j+1];
			}
			-- qtyStored;
			itemsInStore[qtyStored] = null;
			break;
		}
		
		if (isRemoved) System.out.println("Sucessfully removed: [" + disc.getTitle() + "].");
		else System.out.println("Can't remove [" + disc.getTitle() + "]. Your store does not contain that disc.");
		
		return true;
	}
	
	public void removeDVD(DigitalVideoDisc... discs) {
		int qtyRemoved = 0;
		for(DigitalVideoDisc disc : discs) {
			if(removeDVD(disc)) qtyRemoved++;
			else break;
		}
		System.out.println("Removed "+ qtyRemoved + " out of " + discs.length + "DVD(s).");
	}
	
	public void print() {
		
	    System.out.println("============================= THE STORE =============================");
	    System.out.println("Total items: " + qtyStored);
	    for(DigitalVideoDisc item : itemsInStore) {
	    	if(item != null) System.out.println(item.toString());
	    }
	    System.out.println("=====================================================================");
	}
}
