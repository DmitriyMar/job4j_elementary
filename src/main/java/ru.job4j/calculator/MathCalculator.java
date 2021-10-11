package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
         return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDev(double first, double second) {
        return razn(first, second)
                + del(first, second);
    }

    public static double totalAm(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + razn(first, second)
                + del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен:" + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления:" + minusAndDev(10, 20));
        System.out.println("Сумма всех чисел" + totalAm(10, 20));
    }
}

