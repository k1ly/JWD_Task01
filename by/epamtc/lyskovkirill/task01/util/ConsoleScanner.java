package by.epamtc.lyskovkirill.task01.util;

import by.epamtc.lyskovkirill.task0102.entity.SimpleMonth;

import java.util.Scanner;

public class ConsoleScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static int enterInteger() {
        System.out.println("Введите целое число..");
        int ret = 0;
        while (scanner.hasNext()) {
            try {
                ret = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте ввести число снова");
            }
        }
        return ret;
    }

    public static double enterDouble() {
        System.out.println("Введите число..");
        double ret = 0;
        while (scanner.hasNext()) {
            try {
                ret = Double.parseDouble(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте ввести число снова");
            }
        }
        return ret;
    }

    public static SimpleMonth enterMonth() {
        System.out.println("Введите номер месяца (от 1 до 12)..");
        int num;
        SimpleMonth ret = SimpleMonth.JANUARY;
        while (scanner.hasNext()) {
            try {
                num = Integer.parseInt(scanner.next()) - 1;
                if (num < 0 || num > SimpleMonth.values().length) {
                    System.out.println("Попробуйте ввести число от 1 до 12");
                    continue;
                }
                ret = SimpleMonth.values()[num];
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте ввести число снова");
            }
        }
        return ret;
    }
}
