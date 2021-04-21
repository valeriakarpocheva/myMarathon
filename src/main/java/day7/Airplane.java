package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска:" + year + ", длина:" + length + ", вес:" + weight + ", количество топлива в баке:" + fuel);
    }

    static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.length > plane2.length)
            System.out.println("The plane №1 is longer than the plane №2");
        if (plane2.length > plane1.length)
            System.out.println("The plane №2 is longer than the plane №1");
    }

    public int fillUp(int n) {
        fuel = fuel + n;
        return fuel;
    }
}
