package by.epamtc.lyskovkirill.task0108.util;

public class CustomFunction {

    public static double calculateFunctionValue(double x) {
        double y;
        if (x >= 3)
            y = -x * Math.pow(x, 2) + 3 * x + 9;
        else
            y = 1 / (Math.pow(x, 3) - 6);
        return y;
    }
}
