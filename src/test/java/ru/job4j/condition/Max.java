package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left < right ? right : left;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int forth) {
        return max(max(first, second, third), forth);
    }

    public static void main(String[] args) {
        System.out.println(max(8, 12));
    }
}
