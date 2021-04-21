package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его
// случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < arrayLength; i++)
            array[i] = random.nextInt(10);

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);


        int counter8 = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > 8)
                counter8++;
        }
        System.out.println(counter8);


        int counter1 = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == 1)
                counter1++;
        }
        System.out.println(counter1);

        int counterEven = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0)
                counterEven++;
        }
        System.out.println(counterEven);

        int counterUneven = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 != 0)
                counterUneven++;
        }
        System.out.println(counterUneven);

        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
