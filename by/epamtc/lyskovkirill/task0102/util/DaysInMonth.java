package by.epamtc.lyskovkirill.task0102.util;

import by.epamtc.lyskovkirill.task0102.entity.Months;

public class DaysInMonth {

    public static int getDaysInMonth(Months month, int year) throws Exception {
        if (year < 0)
            throw new Exception("Below zero");
        int days = 31;
        if (month == Months.APRIL || month == Months.JUNE || month == Months.SEPTEMBER || month == Months.NOVEMBER)
            days = 30;
        else if(month == Months.FEBRUARY) {
            if (year % 4 == 0)
                days = 29;
            else
                days = 28;
        }
        return days;
    }
}
