package ua.vodafone.homework;

import java.util.Objects;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point pointB) {
        return calculateDistance(this.x, this.y, pointB.x, pointB.y);
    }

    public static double getDistance(Point pointA, Point pointB) {
        return calculateDistance(pointA.x, pointA.y, pointB.x, pointB.y);

    }

    private static double calculateDistance(int xOne, int yOne, int xTwo, int yTwo) {
        return Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return (getX() == point.getX() && getY() == point.getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
