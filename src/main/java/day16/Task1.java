package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        printResult(new File("src/main/java/day14/text.txt"));
    }
    public static void printResult(File file){
        try (Scanner scanner = new Scanner(file)) {
            String line= scanner.nextLine();
            String[] nums = line.split(", ");
            int counter = 0;
            float[] numbersLine = new float[10];
            float sum = 0;
            for (String num : nums){
                numbersLine[counter] = Integer.parseInt(num);
                sum += numbersLine[counter];
                counter++;
            }
            float average = sum / numbersLine.length;
            System.out.println(average);
            System.out.printf("%.3f", average);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
    }
}

