package by.epamtc.lyskovkirill.task0104.util;

public class TwoEvenNumbers {

    public static boolean hasTwoEvenNumbers(int... ints) {
        byte ret = 0;
        for (int i : ints) {
            if (i % 2 == 0)
                ret++;
        }
        return ret >= 2;
    }
}
