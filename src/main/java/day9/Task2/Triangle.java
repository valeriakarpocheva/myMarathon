package day9.Task2;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String colour){
        super(colour);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double perimeter() {
        return a+b+c;
    }
}
