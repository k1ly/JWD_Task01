package by.epamtc.lyskovkirill.task0105.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0105.util.PerfectNumber;

public class Main {

    public static void main(String[] args) {
        int num = ConsoleScanner.getInt();
        var perfectNumber = PerfectNumber.isPerfectNumber(num);
        if (perfectNumber)
            System.out.println(num + " - совершенное число");
        else
            System.out.println(num + " - не совершенное число");
    }
}
