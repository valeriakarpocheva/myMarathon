package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList(new File("src/main/java/day14/people")));

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<Person>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IOException();
                }
                people.add(new Person(Integer.parseInt(person[1]), person[0]));
            }
            scanner.close();
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
