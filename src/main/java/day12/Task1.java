package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль. Добавить в середину еще
// 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.
public class Task1 {
    public static void main(String[] args) {
        List<String> cars = Arrays.asList("Lada", "Toyota", "Mercedes", "BMW", "Audi");
        System.out.println(cars);
        cars = new ArrayList<>(Arrays.asList("Lada", "Toyota", "Mercedes", "BMW", "Audi"));
        cars.remove(0);
        cars.add("Tesla");
        System.out.println(cars);

    }
}
