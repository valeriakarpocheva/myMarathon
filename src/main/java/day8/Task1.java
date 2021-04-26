package day8;

public class Task1 {
    public static void main(String[] args) {
        int i;
        String string = " ";
        final long startTime1 = System.currentTimeMillis();
        for (i = 0; i < 20001; i++)
            string += i + " ";
        System.out.println(string);
        final long endTime1 = System.currentTimeMillis(); //Total execution time: 1211

        System.out.println("Total execution time: " + (endTime1 - startTime1));

        StringBuilder sb = new StringBuilder(" ");

        final long startTime = System.currentTimeMillis();
        for (i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);
        final long endTime = System.currentTimeMillis(); //Total execution time: 45

        System.out.println("Total execution time: " + (endTime - startTime));
    }
}

