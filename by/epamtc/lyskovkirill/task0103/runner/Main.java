package by.epamtc.lyskovkirill.task0103.runner;

import by.epamtc.lyskovkirill.task01.ConsoleScanner;
import by.epamtc.lyskovkirill.task0103.util.InnerSquare;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите площадь квадрата");
            double squareArea = ConsoleScanner.getDouble();
            var innerSquareArea = InnerSquare.getInnerSquareArea(squareArea);
            System.out.println("Площадь квадрата вписанного в окружность, вписанную во внешний квадрат, с заданной площадью: "
                    + innerSquareArea);
            System.out.println("Площадь внешнего квадрата больше внутреннего в " + squareArea / innerSquareArea + " раз");
        } catch (Exception e) {
            System.out.println("Ошибка: Площадь не может быть отрицательной");
        }
    }
}
