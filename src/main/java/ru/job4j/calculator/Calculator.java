package ru.job4j.calculator;

public class Calculator {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }
    public static void main(String[] args) {
        int result1 = Calculator.func1(100);
        int result3 = result1;
        System.out.println(result3);
    }
}