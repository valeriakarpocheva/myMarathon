package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 5;
        int j = 1;
        int sum = k * j;
        while (j < 10) {
            System.out.println(j + " x " + k + " = " + sum);
            j++;
            sum = k * j;
        }
    }
}
