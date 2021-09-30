package by.epamtc.lyskovkirill.task0106.util;

public class TimeFromNSeconds {

    public static int getHourFromNSeconds(int seconds) throws Exception {
        if (seconds < 0)
            throw new Exception("Below zero");
        if (seconds > 24 * 3600)
            throw new Exception("More than a day");
        return seconds / 3600;
    }

    public static int getMinutesFromNSeconds(int seconds) throws Exception {
        return (seconds - getHourFromNSeconds(seconds) * 3600) / 60;
    }

    public static int getSecondsFromNSeconds(int seconds) throws Exception {
        return seconds - getHourFromNSeconds(seconds) * 3600 - getMinutesFromNSeconds(seconds) * 60;
    }
}
