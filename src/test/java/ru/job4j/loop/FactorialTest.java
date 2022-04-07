package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int a = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, a);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int a = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, a);
    }
}