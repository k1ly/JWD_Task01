package by.epamtc.lyskovkirill.task0103.runner;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;
import by.epamtc.lyskovkirill.task01.util.ConsoleScanner;
import by.epamtc.lyskovkirill.task0103.util.InnerSquare;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите площадь квадрата");
            double squareArea = ConsoleScanner.enterDouble();

            var innerSquareArea = InnerSquare.calculateInnerSquareArea(squareArea);
            System.out.println("Площадь квадрата вписанного в окружность, вписанную во внешний квадрат, с заданной площадью: " +
                    innerSquareArea);
            System.out.println("Площадь внешнего квадрата больше внутреннего в " + squareArea / innerSquareArea + " раз");
        } catch (NegativeValueException e) {
            System.out.println(e);
        }
    }
}
