package by.epamtc.lyskovkirill.task0106.util;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;
import by.epamtc.lyskovkirill.task0106.entity.SimpleTime;

public class TimeFromSecondNumber {
    public final static int SECONDS_IN_DAY = 86400;
    public final static int SECONDS_IN_HOUR = 3600;
    public final static int SECONDS_IN_MINUTE = 60;

    public static SimpleTime calculateTimeFromSecondNumber(int number) throws NegativeValueException {
        if (number < 0)
            throw new NegativeValueException("Ошибка: Число секунд " + number + " не может быть отрицательным");
        number %= SECONDS_IN_DAY;
        int hours = number / SECONDS_IN_HOUR;
        int minutes = (number - hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int seconds = number - hours * SECONDS_IN_HOUR - minutes * SECONDS_IN_MINUTE;
        return new SimpleTime(hours, minutes, seconds);
    }
}
