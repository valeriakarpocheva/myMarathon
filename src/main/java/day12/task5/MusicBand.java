package day12.task5;

import java.util.ArrayList;
import java.util.List;

//Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и удалять
// участников. Под участником понимается строка (String) с именем и фамилией. Реализовать статический метод слияния
// групп (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
// Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. В классе MusicBand, реализовать метод
// printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий список участников.
//Проверить состав групп после слияния.).
public class MusicBand {
    private String name;
    private int dateOfIssue;
    private List<MusicArtist> musicArtist;

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                ", musicArtist=" + musicArtist +
                '}';
    }

    public MusicBand(String name, int dateOfIssue, List<MusicArtist> musicArtist) {
        this.name = name;
        this.dateOfIssue = dateOfIssue;
        this.musicArtist = musicArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public List<MusicArtist> getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(List<MusicArtist> musicArtist) {
        this.musicArtist = musicArtist;
    }

    public static void transferMembers(MusicBand recipient, MusicBand provider) { //groups
        List<MusicArtist> newMembers = new ArrayList<>(recipient.getMusicArtist());
        newMembers.addAll(provider.getMusicArtist());
        recipient.setMusicArtist(newMembers);
        provider.setMusicArtist(null);
        System.out.println(recipient.getMusicArtist());
    }
}
