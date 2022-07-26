package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left < right ? right : left;
    }

    public static void main(String[] args) {
        System.out.println(max(8, 12));
    }
}