package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();
    
    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        super(title, category, cost);
        this.numOfTokens = numOfTokens;
        if (authors != null) {
            this.authors = authors;
        }
    }
    public Book(String title, String category, double cost, int numOfTokens) {
    	super(title, category, cost);
        this.numOfTokens = numOfTokens;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    
    public void addAuthor(BookAuthor author) {
        if (!authors.contains(author)) {
            authors.add(author);
        } else {
            System.out.println("Author is already in the list.");
        }
    }
    public void removeAuthor(BookAuthor author) {
        if (authors.contains(author)) {
            authors.remove(author);
        } else {
            System.out.println("Author is not in the list.");
        }
    }
    
    
    @Override
    public String toString() {
        return "Book[" + getId() + "]["
                + getTitle() + "]["
                + getCost() + "]["
                + getCategory() + "]["
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors.toString();
    }
}