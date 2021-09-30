package by.epamtc.lyskovkirill.task0110.util;

import by.epamtc.lyskovkirill.task0110.entity.Point;

import java.util.ArrayList;

public class TangentFunction {

    public static ArrayList<Point> getFunctionValues(double a, double b, double h) throws Exception {
        if ((a < b && h <= 0) || (a > b && h >= 0))
            throw new Exception();
        ArrayList<Point> table = new ArrayList<>();
        for (double i = a; i < b; i += h) {
            table.add(new Point(i, Math.tan(i)));
        }
        return table;
    }
}

