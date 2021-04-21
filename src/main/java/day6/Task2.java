package day6;

//Создать новый объект класса Самолет с произвольными данными.
//Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза, передав разные значения.
// Вызвать метод info().
public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2000, 5, 10000, 0);

        plane.setYear(2005);
        plane.setLength(10);

        plane.fillUp(100);
        plane.fillUp(200);

        plane.info();
    }
}
