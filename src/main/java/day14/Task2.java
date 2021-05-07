package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.List;


public class Task2 {

    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("src/main/java/day14/people.txt")));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> peopleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] people = line.split(" ");
                if (Integer.parseInt(people[1]) < 0)
                    throw new IOException();
                peopleList.add(line);
            }
            scanner.close();
            return peopleList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}

