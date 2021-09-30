package by.epamtc.lyskovkirill.task0102.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0102.entity.Months;
import by.epamtc.lyskovkirill.task0102.util.DaysInMonth;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите год");
        int year = ConsoleScanner.getInt();
        Months month = ConsoleScanner.getMonth();
        try {
            var days = DaysInMonth.getDaysInMonth(month, year);
            System.out.println("Количество дней в этом месце (в этом году): " + days);
        } catch (Exception e) {
            System.out.println("Ошибка: Год не может быть отрицательным");
        }
    }
}
