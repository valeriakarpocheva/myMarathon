package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYearOfIssue(2000);
        car.info();
        System.out.println(car.yearDifference(2004));

        System.out.println();

        Motorbike moto = new Motorbike(2020, "white", "toyota");
        moto.info();
        System.out.println(moto.yearDifference(2005));

    }
}
