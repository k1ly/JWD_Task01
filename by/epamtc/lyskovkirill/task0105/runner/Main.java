package by.epamtc.lyskovkirill.task0105.runner;

import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0105.util.PerfectNumber;

public class Main {

    public static void main(String[] args) {
        int num = ConsoleScanner.enterInteger();

        var perfectNumber = PerfectNumber.isPerfectNumber(num);
        System.out.println(num + (perfectNumber ? " - совершенное число" : " - не совершенное число"));
    }
}
