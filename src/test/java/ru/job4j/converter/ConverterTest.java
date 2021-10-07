package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

//import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert3EvroThenRubli() {
        float in = 3;
        float expected = 210;
        float out = Converter.euroToRubli(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when3EvroThen3Dollar() {
        float in = 3;
        float expected = 3;
        float out = Converter.eurotoDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenDollarThenRubl() {
        float in = 3;
        float expected = 180;
        float out = Converter.dollarToRubl(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}



