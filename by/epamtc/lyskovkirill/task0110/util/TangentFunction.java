package by.epamtc.lyskovkirill.task0110.util;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;
import by.epamtc.lyskovkirill.task0107.entity.SimplePoint;

import java.util.ArrayList;

public class TangentFunction {

    public static ArrayList<SimplePoint> getFunctionValues(double a, double b, double h) throws NegativeValueException {
        if ((a < b && h <= 0) || (a > b && h >= 0))
            throw new NegativeValueException("Ошибка: Конечное значение аргумента " + b + " не соответсвует напралению шага " + h);
        ArrayList<SimplePoint> table = new ArrayList<>();
        for (double i = a; i < b; i += h) {
            table.add(new SimplePoint(i, Math.tan(i)));
        }
        return table;
    }
}

