package by.epamtc.lyskovkirill.task0110.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0110.entity.Point;
import by.epamtc.lyskovkirill.task0110.util.TangentFunction;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите начальное значение аргумента");
            double start = ConsoleScanner.getDouble();
            System.out.println("Введите конечное значение аргумента");
            double finish = ConsoleScanner.getDouble();
            System.out.println("Введите значение шага");
            double step = ConsoleScanner.getDouble();
            var table = TangentFunction.getFunctionValues(start, finish, step);
            System.out.println("Таблица значений аргумента и функции");
            for (Point t : table) {
                System.out.println(t.getX() + "\t" + t.getY());
            }
        } catch (Exception e) {
            System.out.println("Ошибка: Конечное значение аргумента не соответсвует напралению шага");
        }
    }
}
