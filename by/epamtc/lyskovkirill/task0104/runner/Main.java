package by.epamtc.lyskovkirill.task0104.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0104.util.TwoEvenNumbers;

public class Main {

    public static void main(String[] args) {
        int A = ConsoleScanner.getInt();
        int B = ConsoleScanner.getInt();
        int C = ConsoleScanner.getInt();
        int D = ConsoleScanner.getInt();
        var twoEvenNumbers = TwoEvenNumbers.hasTwoEvenNumbers(A, B, C, D);
        if (twoEvenNumbers)
            System.out.println("Среди заданных чисел есть 2 четных");
        else
            System.out.println("Среди заданных чисел нет 2 четных");
    }
}
