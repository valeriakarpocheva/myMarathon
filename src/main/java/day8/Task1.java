package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        int i = 0;
        final long startTime = System.currentTimeMillis();
        for (i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);
        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
