package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int multiply = 1;
        if (n == 0) {
            return 1;
        }
        for (int index = 1; index <= n; index++) {
          multiply = multiply * index;
        }
        return multiply;
    }
}