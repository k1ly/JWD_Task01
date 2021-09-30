package by.epamtc.lyskovkirill.task01;

import by.epamtc.lyskovkirill.task0102.entity.Months;

import java.util.Scanner;

public class ConsoleScanner {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int getInt() {
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

    public static double getDouble() {
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

    public static Months getMonth() {
        System.out.println("Введите номер месяца (от 1 до 12)..");
        int num;
        Months ret = Months.JANUARY;
        while (scanner.hasNext()) {
            try {
                num = Integer.parseInt(scanner.next()) - 1;
                if (num < 0 || num > Months.values().length) {
                    System.out.println("Попробуйте ввести число от 1 до 12");
                    continue;
                }
                ret = Months.values()[num];
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте ввести число снова");
            }
        }
        return ret;
    }
}
