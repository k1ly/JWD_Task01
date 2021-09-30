package by.epamtc.lyskovkirill.task0109.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0109.util.Circle;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите радиус");
            double radius = ConsoleScanner.getDouble();
            var area = new Circle(radius).getArea();
            var length = new Circle(radius).getLength();
            System.out.println("Площадь круга заданного радиуса: " + area);
            System.out.println("Длина окружности заданного радиуса: " + length);
        } catch (Exception e) {
            System.out.println("Ошибка: Радиус не может быть отрицательным");
        }
    }
}
