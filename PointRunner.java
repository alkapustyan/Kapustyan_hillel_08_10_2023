package ua.vodafone.homework;

public class PointRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point pointA = new Point(1, 1);
        Point pointB = new Point(3, 3);

        System.out.println("Coordinates of point A using toString: " + pointA.toString());
        System.out.println("Coordinates of point B using toString: " + pointB.toString());
        System.out.println();
        System.out.println("Coordinates of point A using getter: {" + pointA.getX() + "," + pointA.getY() + "}");
        System.out.println("Coordinates of point B using getter: {" + pointB.getX() + "," + pointB.getY() + "}");
        System.out.println();

        pointA.setX(2);
        pointA.setY(2);
        pointB.setX(5);
        pointB.setY(5);
        System.out.println("NEW Coordinates of A and B after using setter:");
        System.out.println("Point A: " + pointA.toString() + ", Point B: " + pointB.toString());
        System.out.println();

        System.out.println("Calculate distance from A to B: " + pointA.getDistance(pointB));
        System.out.println("Calculate distance between A and B: " + Point.getDistance(pointA, pointB));
        System.out.println();

        System.out.println("Is point A equals point B : " + pointA.equals(pointB));
        System.out.println();

        System.out.println("Make clone of point A using method clone() : ");
        Point clonePointA = pointA.clone();
        System.out.println("Clone of point A: clonePointA " + clonePointA.toString());
        System.out.println();
        System.out.println("Make clone of point B using constructor: ");
        Point clonePointB = new Point(pointB);
        System.out.println("Clone of point B: clonePointB " + clonePointB.toString());


    }
}
