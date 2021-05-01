package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersT9 = new ArrayList<>();
        membersT9.add(new MusicArtist("Andy", 20));
        membersT9.add(new MusicArtist("Ann", 25));

        List<MusicArtist> membersHurts = new ArrayList<>();
        membersHurts.add(new MusicArtist("Hugh", 30));
        membersHurts.add(new MusicArtist("Hedwig", 35));

        MusicBand mb = new MusicBand("T9", 2007, membersT9);
        MusicBand mb1 = new MusicBand("Hurts", 2008, membersHurts);

        mb.transferMembers(mb, mb1);
        ;
    }
}
