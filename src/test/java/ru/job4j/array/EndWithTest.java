package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EndWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndWith.endsWith(word, post);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndWith.endsWith(word, post);
        assertThat(result).isFalse();
    }
}