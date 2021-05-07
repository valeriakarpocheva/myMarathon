package day15;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day15/shoes.csv");
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new File("src/main/java/day15/missing_shoes.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] allShoes = line.split(";");
                if (Integer.parseInt(allShoes[2])<0){
                    throw new IOException();
                }
                if (Integer.parseInt(allShoes[2]) == 0){
                    pw.print(allShoes[0]+"; "+ allShoes[1]+ "; "+allShoes[2]+"\n ");
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Incorrect file");
        }
    }
}
