package by.epamtc.lyskovkirill.task0101.runner;

import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0101.util.SqrLastDigit;

public class Main {

    public static void main(String[] args) {
        int num = ConsoleScanner.enterInteger();
        var sqrLastDigit = SqrLastDigit.calculateSqrLastDigit(num);
        System.out.println("Последняя цифра квадрата этого числа: " + sqrLastDigit);
    }
}

