package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FitTest {

    @Test
    public void testCalculateManWeightNormalHeight() {
        short height = 187;
        double expectedWeight = 88.55;

        double actualWeight = Fit.calculateManWeight(height);

        assertEquals(expectedWeight, actualWeight, 0.01);
    }

    @Test
    public void testCalculateWomanWeightNormalHeight() {
        short height = 170;
        double expectedWeight = 63.25;

        double actualWeight = Fit.calculateWomanWeight(height);

        assertEquals(expectedWeight, actualWeight, 0.01);
    }

    @Test
    public void testCalculateManWeightMinimumHeight() {

        short height = 100;
        double expectedWeight = 0;

        double actualWeight = Fit.calculateManWeight(height);

        assertEquals(expectedWeight, actualWeight, 0.01);
    }

    @Test
    public void testCalculateWomanWeightMinimumHeight() {
        short height = 110;
        double expectedWeight = 0;

        double actualWeight = Fit.calculateWomanWeight(height);

        assertEquals(expectedWeight, actualWeight, 0.01);
    }
}