package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file2 = new File("src/main/java/day16/file2.txt");
        printResult(file2);
        try {
            File file = new File("src/main/java/day16/file1.txt");
            PrintWriter pw = new PrintWriter(file);
            Random random = new Random();
            for (int counter = 0; counter < 1000; counter++)
                pw.println(random.nextInt(100));
            pw.close();
            Scanner scanner = new Scanner(file);
            PrintWriter pw1 = new PrintWriter(file2);
            int counter1 = 0;
            int sum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                sum += Integer.parseInt(line);
                counter1++;
                if (counter1 == 20) {
                    pw1.println(sum / 20.0);
                    counter1 = 0;
                    sum = 0;
                }
            }
            pw1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    static void printResult(File file) throws FileNotFoundException {
        // Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив
        // вещественную часть.
        Scanner scanner1 = new Scanner(file);
        float sum = 0;
            while(scanner1.hasNextLine())
                sum += Float.parseFloat(scanner1.nextLine());
                System.out.println((int) sum);
            scanner1.close();
    }
}
