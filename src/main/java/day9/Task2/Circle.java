package day9.Task2;

public class Circle extends Figure {
    private double r;

    public Circle(double r, String colour) {
        super(colour);
        this.r = r;
    }

    public double area() {
        return Math.PI * (Math.pow(r, 2));
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
