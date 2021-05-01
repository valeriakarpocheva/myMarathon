package day12;

import java.util.ArrayList;
import java.util.List;

//Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
public class Task2 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int counter = 0; counter < 31; counter += 2) {
            evenNumbers.add(counter);
        }
        for (int counter1 = 300; counter1 < 351; counter1 += 2) {
            evenNumbers.add(counter1);
        }
        System.out.println(evenNumbers);
    }
}
