package day9.Task2;
//Создайте абстрактный класс Фигура (англ. Figure). Этот класс будет являться абстрактным представлением геометрической
// фигуры в нашей программе.
//У всех фигур в нашей программе есть цвет, поэтому в классе Фигура есть строковое поле color. Создайте конструктор и
// геттер для этого поля.
//У класса Фигура определены два абстрактных метода:
//public abstract double area();
//public abstract double perimeter();
//Реализация первого метода должна возвращать площадь фигуры, а реализация второго метода должна возвращать периметр фигуры.
public abstract class Figure {
    private String colour;

    public Figure(String colour){
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
    public abstract double area();
    public abstract double perimeter();
}
