package by.epamtc.lyskovkirill.task0101.util;

public class SqrLastDigit {

    public static int calculateSqrLastDigit(int number) {
        return (int)Math.pow(number % 10, 2) % 10;
    }
}
