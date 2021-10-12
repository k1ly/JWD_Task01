package by.epamtc.lyskovkirill.task0104.runner;

import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0104.util.TwoEvenNumbers;

public class Main {

    public static void main(String[] args) {
        int A = ConsoleScanner.enterInteger();
        int B = ConsoleScanner.enterInteger();
        int C = ConsoleScanner.enterInteger();
        int D = ConsoleScanner.enterInteger();

        var twoEvenNumbers = TwoEvenNumbers.hasTwoEvenNumbers(A, B, C, D);
        System.out.println("Среди заданных чисел " + (twoEvenNumbers ? "есть 2 четных" : "нет 2 четных"));
    }
}
