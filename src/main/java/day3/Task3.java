package day3;

import java.util.Scanner;

// Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель. Для этих двух
// чисел программа рассчитывает результат деления и выводит его в консоль. Если пользователь вводит 0 в качестве
// делителя, вместо того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и выводим в консоль
// сообщение “Деление на 0”.
//Ключевое слово else или два if использовать в этой программе нельзя. В решении обязательно использовать
// оператор continue.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (counter = 0; counter < 5; counter++) {
            double number = scanner.nextDouble();
            double number1 = scanner.nextDouble();
            if (number1 == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(number / number1);
        }
    }
}
