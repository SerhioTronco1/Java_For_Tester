package ru.stqa.geometry.Figures;

public class Square {
    public static void printSquareArea(double side) {
        String twxt = String.format("Площадь квадрата со стороной %f = %f ", side, squareArea(side));
        System.out.println(twxt);
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
