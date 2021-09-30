package by.epamtc.lyskovkirill.task0107.util;

import by.epamtc.lyskovkirill.task0107.entity.Point;

public class ClosestToZeroPoint {

    public static Point getClosestToZeroPoint(Point A, Point B) {
        return A.getRadiusVector() <= B.getRadiusVector() ? A : B;
    }
}
