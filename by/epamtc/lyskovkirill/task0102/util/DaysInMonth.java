package by.epamtc.lyskovkirill.task0102.util;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;
import by.epamtc.lyskovkirill.task0102.entity.SimpleMonth;

public class DaysInMonth {
    public final static int DAYS_IN_MONTH_31 = 31;
    public final static int DAYS_IN_MONTH_30 = 30;
    public final static int DAYS_IN_FEBRUARY_29 = 29;
    public final static int DAYS_IN_FEBRUARY_28 = 28;

    public static int calculateDaysByMonthYear(SimpleMonth month, int year) throws NegativeValueException {
        if (year < 0)
            throw new NegativeValueException("Ошибка: Год " + year + " не может быть отрицательным");
        int days = DAYS_IN_MONTH_31;
        if (month == SimpleMonth.APRIL || month == SimpleMonth.JUNE || month == SimpleMonth.SEPTEMBER || month == SimpleMonth.NOVEMBER)
            days = DAYS_IN_MONTH_30;
        else if(month == SimpleMonth.FEBRUARY) {
            if (year % 4 == 0)
                days = DAYS_IN_FEBRUARY_29;
            else
                days = DAYS_IN_FEBRUARY_28;
        }
        return days;
    }
}
