package ru.job4j.converter;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @org.junit.Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @org.junit.Test
    public void rubleToDollar() {
    }
}