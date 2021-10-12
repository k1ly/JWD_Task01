package by.epamtc.lyskovkirill.task0105.util;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = num / 2; i > 0; i--)
            if (num % i == 0)
                sum += i;
        return sum == num;
    }
}
