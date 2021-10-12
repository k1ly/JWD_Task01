package by.epamtc.lyskovkirill.task0109.util;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;

public class SimpleCircle {

    public static double calculateArea(double radius) throws NegativeValueException {
        if (radius <= 0)
            throw new NegativeValueException("Ошибка: Радиус " + radius + " не может быть отрицательным");
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateLength(double radius) throws NegativeValueException {
        if (radius <= 0)
            throw new NegativeValueException("Ошибка: Радиус " + radius + " не может быть отрицательным");
        return 2 * Math.PI * radius;
    }
}