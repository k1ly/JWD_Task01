package by.epamtc.lyskovkirill.task0109.runner;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;
import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0109.util.SimpleCircle;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите радиус");
            double radius = ConsoleScanner.enterDouble();

            var area = SimpleCircle.calculateArea(radius);
            var length = SimpleCircle.calculateLength(radius);
            System.out.println("Площадь круга заданного радиуса: " + area);
            System.out.println("Длина окружности заданного радиуса: " + length);
        } catch (NegativeValueException e) {
            System.out.println(e);
        }
    }
}
