package day12.task3;

import java.util.*;

// Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы, которые
// были созданы как до 2000 года, так и после, жанр не важен). Перемешать список. Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после
// 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп. Вывести
// в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> mb = new ArrayList<>();
        mb.add(new MusicBand("Karmin", 1999));
        mb.add(new MusicBand("Hospital", 1998));
        mb.add(new MusicBand("M.O", 1997));
        mb.add(new MusicBand("Little big", 2014));
        mb.add(new MusicBand("Ninety one", 2013));
        mb.add(new MusicBand("Hurts", 2009));
        mb.add(new MusicBand("Major Lazer", 2009));
        mb.add(new MusicBand("Migos", 2008));
        mb.add(new MusicBand("T9", 2007));
        mb.add(new MusicBand("The Glitch Mob", 2006));

        Collections.shuffle(mb);
        System.out.println(mb);
        System.out.println(groupsAfter2000(mb));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> mb1 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getDateOfIssue() > 2000) {
                mb1.add(band);
            }
        }
        return mb1;
    }
}
