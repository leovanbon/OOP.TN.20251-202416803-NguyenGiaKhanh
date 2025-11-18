package com.hust.kstn.models;

import java.util.Objects;

public class Media {
    private int id;
    private String title;
    private String category;
    private double cost;
    private static int nbMedias = 0;

    public Media(String title, String category, double cost) {
        this.id = ++nbMedias;
        this.title = title;
        this.category = category;
        this.cost = cost;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return Objects.equals(title, media.title);
    }
    
    @Override
    public String toString() {
        return "Media[" + id + "][" + title + "][" + category + "]["+ cost + "]";
    }
}