package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax8To12Then12() {
        int left = 8;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax12To8Then12() {
        int left = 12;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To8To9Then9() {
        int first = 7;
        int second = 8;
        int third = 9;
        int result = Max.max(first, second, third);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To10To14To15Then15() {
        int first = 10;
        int second = 15;
        int third = 5;
        int forth = 14;
        int result = Max.max(first, second, third, forth);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}