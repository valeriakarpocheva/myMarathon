package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2000, 10, 10000, 0);
        Airplane plane1 = new Airplane("Boeing", 2000, 15, 15000, 0);

        Airplane.compareAirplanes(plane, plane1);
    }
}