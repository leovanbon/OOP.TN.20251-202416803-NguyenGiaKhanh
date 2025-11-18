package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc{
    private String artist;
    private List<Track> tracks = new ArrayList<>();
    
    public CompactDisc(String title, String category, double cost, String artist, String director) {
    	super(title,category, director, 0, cost);
        this.artist = artist;
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
          .append(getId()).append("][")
          .append(getTitle()).append("][")
          .append(getCategory()).append("][")
          .append(getDirector()).append("][")
          .append(artist).append("][")
          .append(totalLength()).append("][")
          .append(getCost()).append("]\n");

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