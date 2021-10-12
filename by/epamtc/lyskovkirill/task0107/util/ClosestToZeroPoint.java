package by.epamtc.lyskovkirill.task0107.util;

import by.epamtc.lyskovkirill.task0107.entity.NullSimplePointException;
import by.epamtc.lyskovkirill.task0107.entity.SimplePoint;

public class ClosestToZeroPoint {

    public static SimplePoint findClosestToZeroPoint(SimplePoint A, SimplePoint B) throws NullSimplePointException {
        if (A == null && B == null)
            throw new NullSimplePointException("Ошибка: Параметр является ссылкой на null");
        return A.calculateRadiusVector() <= B.calculateRadiusVector() ? A : B;
    }
}
