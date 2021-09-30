package by.epamtc.lyskovkirill.task0109.util;

public class Circle {
    double radius;

    public Circle(double radius) throws Exception {
        if (radius <= 0)
            throw new Exception();
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }
}