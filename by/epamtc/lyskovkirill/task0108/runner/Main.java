package by.epamtc.lyskovkirill.task0108.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0108.util.Function;

public class Main {

    public static void main(String[] args) {
            double num = ConsoleScanner.getDouble();
            var functionValue = Function.calculateValue(num);
            System.out.println("Значение функции от заданного аргумента: " + functionValue);
    }
}
