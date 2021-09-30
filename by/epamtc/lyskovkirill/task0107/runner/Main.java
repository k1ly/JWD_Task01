package by.epamtc.lyskovkirill.task0107.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0107.entity.Point;
import by.epamtc.lyskovkirill.task0107.util.ClosestToZeroPoint;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите координаты двух точек");
        double x1 = ConsoleScanner.getDouble();
        double y1 = ConsoleScanner.getDouble();
        double x2 = ConsoleScanner.getDouble();
        double y2 = ConsoleScanner.getDouble();
        var closestToZeroPoint = ClosestToZeroPoint.getClosestToZeroPoint(new Point(x1, y1), new Point(x2, y2));
        System.out.println("Ближайшая к нулю точка имеет следующие координаты: " + closestToZeroPoint.getX() + ", " +
                closestToZeroPoint.getY());
    }
}
