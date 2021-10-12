package by.epamtc.lyskovkirill.task0103.util;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;

public class InnerSquare {

    public static double calculateInnerSquareArea(double outerSquareArea) throws NegativeValueException {
        if (outerSquareArea < 0)
            throw new NegativeValueException("Ошибка: Площадь " + outerSquareArea + " не может быть отрицательной");
        return outerSquareArea / 2;
    }
}
