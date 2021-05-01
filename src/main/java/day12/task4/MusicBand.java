package day12.task4;

import java.util.ArrayList;
import java.util.List;

//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
public class MusicBand {
    private String name;
    private int yearOfIssue;
    public MusicBand(String name, int yearOfIssue, List<String> members) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.members = members;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    public List<String> getMembers() {
        return members;
    }
    public void setMembers(List<String> members) {
        this.members = members;
    }
    private List<String> members;
    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", members=" + members +
                '}';
    }
    public static void transferMembers(MusicBand recipient, MusicBand provider){
        List<String> newMembers = new ArrayList<String>(provider.getMembers());
        newMembers.addAll(recipient.getMembers());
        recipient.setMembers(newMembers);
        provider.setMembers(null);
        System.out.println(recipient.getMembers());
    }
}
