package by.epamtc.lyskovkirill.task0101.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0101.util.SqrLastDigit;

public class Main {

    public static void main(String[] args) {
        int num = ConsoleScanner.getInt();
        var sqrLastDigit = SqrLastDigit.getSqrLastDigit(num);
        System.out.println("Последняя цифра квадрата этого числа: " + sqrLastDigit);
    }
}

