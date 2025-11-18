package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {

	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		super(title, category, director, length, cost);
	}

	public String toString() {
		return "DVD" + "[" + getId() + "][" 
					+ getTitle() + "]["
					+ getCost() + "]["
				    + getDirector() + "]["
				    + getLength() + "]["
				    + getCost() + "]";
	}
}
