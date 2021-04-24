package day9.Task2;

public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b, String colour){
        super(colour);
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a*b;
    }

    public double perimeter() {
        return (a+b)*2;
    }
}
