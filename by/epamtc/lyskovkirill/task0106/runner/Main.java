package by.epamtc.lyskovkirill.task0106.runner;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;
import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0106.util.TimeFromSecondNumber;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите число секунд");
            int num = ConsoleScanner.enterInteger();

            var time = TimeFromSecondNumber.calculateTimeFromSecondNumber(num);
            System.out.println("Полученное время суток: " + time);
        } catch (NegativeValueException e) {
            System.out.println(e);
        }
    }
}
