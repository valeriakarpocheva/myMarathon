package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Smith", "English");
        Student student = new Student("Sanchez");

        teacher.evaluate("Sanchez");
    }
}
