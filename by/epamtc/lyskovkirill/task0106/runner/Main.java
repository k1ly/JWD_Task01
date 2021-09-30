package by.epamtc.lyskovkirill.task0106.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0106.util.TimeFromNSeconds;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите число секунд");
            int num = ConsoleScanner.getInt();
            var h = TimeFromNSeconds.getHourFromNSeconds(num);
            var m = TimeFromNSeconds.getMinutesFromNSeconds(num);
            var s = TimeFromNSeconds.getSecondsFromNSeconds(num);
            System.out.println("Полученное время суток: " + h + "ч. " + m + "м. " + s + "с.");
        } catch (Exception e) {
            System.out.println("Ошибка: Число секунд не может быть отрицательным");
        }
    }
}
