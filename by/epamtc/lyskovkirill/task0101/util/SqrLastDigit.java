package by.epamtc.lyskovkirill.task0101.util;

public class SqrLastDigit {

    public static int getSqrLastDigit(int number) {
        String numString = String.valueOf(number);
        number = Integer.parseInt(numString.substring(numString.length() - 1));
        numString = String.valueOf((int) Math.pow(number, 2));
        return Integer.parseInt(numString.substring(numString.length() - 1));
    }
}
