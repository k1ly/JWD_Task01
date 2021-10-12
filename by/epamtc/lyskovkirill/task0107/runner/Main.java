package by.epamtc.lyskovkirill.task0107.runner;

import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0107.entity.NullSimplePointException;
import by.epamtc.lyskovkirill.task0107.entity.SimplePoint;
import by.epamtc.lyskovkirill.task0107.util.ClosestToZeroPoint;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите координаты двух точек");
            System.out.println("первая точка..");
            double x1 = ConsoleScanner.enterDouble();
            double y1 = ConsoleScanner.enterDouble();
            System.out.println("вторая точка..");
            double x2 = ConsoleScanner.enterDouble();
            double y2 = ConsoleScanner.enterDouble();

            var closestToZeroPoint = ClosestToZeroPoint.findClosestToZeroPoint(new SimplePoint(x1, y1), new SimplePoint(x2, y2));
            System.out.println("Ближайшая к нулю точка: " + closestToZeroPoint);
        } catch (NullSimplePointException e) {
            System.out.println(e);
        }
    }
}
