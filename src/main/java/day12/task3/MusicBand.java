package day12.task3;
//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
public class MusicBand {
    private String name;
    private int dateOfIssue;

    public MusicBand(String name, int dateOfIssue) {
        this.name = name;
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }
}
