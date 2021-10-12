package by.epamtc.lyskovkirill.task0108.runner;

import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0108.util.CustomFunction;

public class Main {

    public static void main(String[] args) {
            double num = ConsoleScanner.enterDouble();

            var functionValue = CustomFunction.calculateFunctionValue(num);
            System.out.println("Значение функции от заданного аргумента: " + functionValue);
    }
}
