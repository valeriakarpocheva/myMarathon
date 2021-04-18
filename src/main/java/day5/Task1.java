package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColour("White");
        car.setYearOfIssue(2000);
        car.setModel("Toyota");

        System.out.println(car.getColour());
        System.out.println(car.getYearOfIssue());
        System.out.println(car.getModel());

    }
}
