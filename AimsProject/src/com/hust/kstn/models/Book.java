package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private double cost;
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();

    private static int nbBooks = 0;

    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        this.id = nbBooks++;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        if (authors != null) {
            this.authors = authors;
        }
    }
    public Book(String title, String category, double cost, int numOfTokens) {
        this.id = nbBooks++;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
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
        return "Book[" + this.id + "]-["
                + this.title + "]-["
                + this.cost + "]-["
                + this.category + "]-["
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors.toString();
    }
}