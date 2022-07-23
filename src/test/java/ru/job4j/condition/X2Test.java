package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {
    @Test
    public void whenA10B0C0X2Then40() {
       int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}