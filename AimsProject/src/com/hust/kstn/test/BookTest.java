package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Huan Rose", 1984, "Businessman who grows pomelos");
        BookAuthor author2 = new BookAuthor("Khanh Sky", 1992, "Yang Ho internet");
        BookAuthor author3 = new BookAuthor("Toll Tu", 1996, "An ex - IT student");
        BookAuthor author4 = new BookAuthor("Pretty Banh", 1993, "Vietnamese Dancer");
        
        List<BookAuthor> yangho = new ArrayList<>();
        yangho.add(author1);
        yangho.add(author2);
        
        Book yanghoByMouth = new Book("Yang Ho By Mouth", "Life style", 36.36, 2000, yangho);
        System.out.println(yanghoByMouth.toString());
        
        yanghoByMouth.removeAuthor(author1);
        yanghoByMouth.removeAuthor(author4);
        yanghoByMouth.addAuthor(author4);
        System.out.println(yanghoByMouth.toString());
        
        Book vibeCoding = new Book("36 Vibe Code Techniques", "Technical", 100, 3600);
        vibeCoding.addAuthor(author3);
        
        System.out.println(vibeCoding.toString());
        
    }
}