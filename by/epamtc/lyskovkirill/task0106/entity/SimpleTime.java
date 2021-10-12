package by.epamtc.lyskovkirill.task0106.entity;

import by.epamtc.lyskovkirill.task01.entity.NegativeValueException;

public class SimpleTime {
    private double hours;
    private double minutes;
    private double seconds;

    public SimpleTime() {}

    public SimpleTime(int hours, int minutes, int seconds) {
        this.hours = Math.max(hours, 0);
        this.minutes = Math.max(minutes, 0);
        this.seconds = Math.max(seconds, 0);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) throws NegativeValueException {
        if (hours < 0)
            throw new NegativeValueException("Ошибка: Число часов " + hours + " не может быть отрицательным");
        this.hours = hours;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) throws NegativeValueException {
        if (minutes < 0)
            throw new NegativeValueException("Ошибка: Число минут " + minutes + " не может быть отрицательным");
        this.minutes = minutes;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) throws NegativeValueException {
        if (seconds < 0)
            throw new NegativeValueException("Ошибка: Число секунд " + seconds + " не может быть отрицательным");
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
