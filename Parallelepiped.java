package ua.vodafone.homework;

public class Parallelepiped {
    public static void main(String[] args) {
        double aSide = 3d;
        double bSide = 4d;
        double cSide = 2d;
        double volume = aSide * bSide * cSide;
        double length = 4 * (aSide + bSide + cSide);
        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Cумарна довжина всіх сторін = " + length);
    }
}
