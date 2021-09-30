package by.epamtc.lyskovkirill.task0104.util;

public class TwoEvenNumbers {

    public static boolean hasTwoEvenNumbers(int A, int B, int C, int D) {
        byte ret = 0;
        if (A % 2 == 0)
            ret++;
        if (B % 2 == 0)
            ret++;
        if (C % 2 == 0)
            ret++;
        if (D % 2 == 0)
            ret++;
        return ret >= 2;
    }
}
