package day4;

import java.util.Random;

//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите
// значение суммы и индекс первого элемента тройки.
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];


        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int maxSum = 0;
        int maxSumInd = 0;

        for (int i = 0; i < array.length - 2; i++) {
            int sumOfThree = 0;
            for (int y = i; y < i + 3; y++) {
                sumOfThree += array[y];
            }

            if (sumOfThree > maxSum) {
                maxSum = sumOfThree;
                maxSumInd = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumInd);
    }
}

