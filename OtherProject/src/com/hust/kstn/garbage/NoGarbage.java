package com.hust.kstn.garbage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

    public static void main(String[] args) throws IOException {
        String filename = "test.txt";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        
        long startTime = System.currentTimeMillis();
        
        StringBuilder sb = new StringBuilder();
        for (byte b : inputBytes) {
            sb.append((char) b);
        }
        sb.toString();
        
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
