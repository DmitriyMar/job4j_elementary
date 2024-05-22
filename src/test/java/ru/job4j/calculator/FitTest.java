package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FitTest {

    @Test
    public void testCalculateManWeightNormalHeight() {
        // Arrange
        short height = 187;
        double expectedWeight = 88.55;

        // Act
        double actualWeight = Fit.calculateManWeight(height);

        // Assert
        assertEquals(expectedWeight, actualWeight, 0.01);
    }

    @Test
    public void testCalculateWomanWeightNormalHeight() {
        // Arrange
        short height = 170;
        double expectedWeight = 63.25;

        // Act
        double actualWeight = Fit.calculateWomanWeight(height);

        // Assert
        assertEquals(expectedWeight, actualWeight, 0.01);
    }

    @Test
    public void testCalculateManWeightMinimumHeight() {
        // Arrange
        short height = 100;
        double expectedWeight = 0;

        // Act
        double actualWeight = Fit.calculateManWeight(height);

        // Assert
        assertEquals(expectedWeight, actualWeight, 0.01);
    }

    @Test
    public void testCalculateWomanWeightMinimumHeight() {
        // Arrange
        short height = 110;
        double expectedWeight = 0;

        // Act
        double actualWeight = Fit.calculateWomanWeight(height);

        // Assert
        assertEquals(expectedWeight, actualWeight, 0.01);
    }
}