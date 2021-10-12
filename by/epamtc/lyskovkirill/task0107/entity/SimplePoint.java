package by.epamtc.lyskovkirill.task0107.entity;

public class SimplePoint {
    private double x;
    private double y;

    public SimplePoint() {}

    public SimplePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double calculateRadiusVector() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{x=" + x +
                ", y=" + y +
                '}';
    }
}
