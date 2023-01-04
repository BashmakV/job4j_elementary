package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left < right ? right : left;
    }

    public static int max(int first, int second, int third) {
        int tmp = max(second, third);
        return max(first, tmp);
    }

    public static int max(int first, int second, int third, int forth) {
        int four = max(first, second, third);
        return max(four, forth);
    }

    public static void main(String[] args) {
        System.out.println(max(8, 12));
    }
}
