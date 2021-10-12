package by.epamtc.lyskovkirill.task0102.runner;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;
import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0102.entity.SimpleMonth;
import by.epamtc.lyskovkirill.task0102.util.DaysInMonth;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите год");
            int year = ConsoleScanner.enterInteger();
            SimpleMonth month = ConsoleScanner.enterMonth();

            var days = DaysInMonth.calculateDaysByMonthYear(month, year);
            System.out.println("Количество дней в этом месце (в этом году): " + days);
        } catch (NegativeValueException e) {
            System.out.println(e);
        }
    }
}
