package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        double result2 = SqArea.square(8, 4);
        double result3 = SqArea.square(10, 6);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        System.out.println(" p = 8, k = 4, s = 4, real = " + result2);
        System.out.println(" p = 10, k = 6, s = 6, real = " + result3);
    }
}