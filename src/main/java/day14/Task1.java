package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/day14/text.txt"); //Когда указываю неполный адрес:"text", выдаёт исключение

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersLine = line.split(", ");
            int[] numbers = new int[10];
            int counter = 0;
            for (String number : numbersLine) {
                numbers[counter++] = Integer.parseInt(number);
            }
            if (counter != 10) {
                throw new IOException();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");

        }
        printSumDigits(file);
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersLine = line.split(", ");
        int[] numbers = new int[10];
        int counter = 0;
        int sum = 0;
        for (String number : numbersLine) {
            numbers[counter] = Integer.parseInt(number);
            sum += numbers[counter];
            counter++;
        }
        System.out.println(sum);
        scanner.close();

    }
}
