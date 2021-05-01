package day12.task4;

import java.util.ArrayList;
import java.util.List;

//Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и удалять
// участников. Под участником понимается строка (String) с именем и фамилией. Реализовать статический метод слияния
// групп (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
// Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. В классе MusicBand, реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий список участников.
//Проверить состав групп после слияния.
public class Task4 {
    public static void main(String[] args) {
            List<String> membersT9 = new ArrayList();
            membersT9.add("Ann");
            membersT9.add("Andy");
            MusicBand mb = new MusicBand("T9", 2007, membersT9);
            List <String> membersHurts = new ArrayList<>();
            membersHurts.add("Hugh");
            membersHurts.add("Hedwig");
            MusicBand mb1 = new MusicBand("Hurts", 2008, membersHurts);

            mb.transferMembers(mb, mb1);

        }
    }
