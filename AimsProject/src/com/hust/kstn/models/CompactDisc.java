package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private int id;
    private String title;
    private String category;
    private double cost;
    private String artist;
    private String director;
    private List<Track> tracks = new ArrayList<>();

    private static int nbCDs = 0; 
    
    
    public CompactDisc(String title, String category, double cost, String artist, String director) {
        this.id = ++nbCDs;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artist = artist;
        this.director = director;
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

    public String getArtist() {
        return artist;
    }
    
    public List<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Error: Track '" + track.getTitle() + "' is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Success: Track '" + track.getTitle() + "' added to the CD.");
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Success: Track '" + track.getTitle() + "' removed from the CD.");
        } else {
            System.out.println("Error: Track '" + track.getTitle() + "' not found in the CD.");
        }
    }

    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CD[")
          .append(id).append("][")
          .append(title).append("][")
          .append(category).append("][")
          .append(director).append("][")
          .append(artist).append("][")
          .append(totalLength()).append("s][$")
          .append(cost).append("]\n");

        if (tracks.isEmpty()) {
            sb.append("Tracks: [No tracks on this CD]");
        } else {
            sb.append("Tracks:\n");
            for (Track track : tracks) {
                sb.append(track.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}