package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc("LK nhac tru tinh Mua Dong Lanh Buot Con Tim","Hai Ngoai",10.00,"Quang Le","Sigon by Nights");

        Track track1 = new Track("Trai Tim Mua Dong", 90);
        Track track2 = new Track("Xuan Nay Con Khong Ve", 163);
        Track track3 = new Track("Dap Mo Cuoc Tinh", 216);

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        System.out.println(cd);

        cd.addTrack(track2); 
        cd.removeTrack(track1);
        cd.addTrack(new Track("Ai Vo Tinh", 382));

        System.out.println(cd);
    }
}