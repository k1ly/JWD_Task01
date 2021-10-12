package by.epamtc.lyskovkirill.task0110.runner;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;
import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0107.entity.SimplePoint;
import by.epamtc.lyskovkirill.task0110.util.TangentFunction;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите начальное значение аргумента");
            double start = ConsoleScanner.enterDouble();
            System.out.println("Введите конечное значение аргумента");
            double finish = ConsoleScanner.enterDouble();
            System.out.println("Введите значение шага");
            double step = ConsoleScanner.enterDouble();

            var table = TangentFunction.getFunctionValues(start, finish, step);
            System.out.println("Таблица значений аргумента и функции");
            for (SimplePoint t : table) {
                System.out.println(t.getX() + "\t" + t.getY());
            }
        } catch (NegativeValueException e) {
            System.out.println(e);
        }
    }
}
