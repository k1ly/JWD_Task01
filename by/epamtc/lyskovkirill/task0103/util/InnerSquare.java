package by.epamtc.lyskovkirill.task0103.util;

public class InnerSquare {

    public static double getInnerSquareArea(double outerSquareArea) throws Exception {
        if (outerSquareArea < 0)
            throw new Exception("Below zero");
        double radius = Math.sqrt(outerSquareArea) / 2;
        return 2 * Math.pow(radius, 2);
    }
}
