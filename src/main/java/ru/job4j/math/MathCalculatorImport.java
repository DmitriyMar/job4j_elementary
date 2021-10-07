package ru.job4j.math;

import ru.job4j.math.MathFunction;

public class MathCalculatorImport {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }
    public static double raznAndSum(double first, double second) {
        return MathFunction.razn(first, second)
                +MathFunction.del(first, second);
    }
    public static double summaVseh(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.razn(first, second)
                + MathFunction.del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления: " + raznAndSum(10,20));
        System.out.println("Сумма всех чисел " + summaVseh(10, 20));
    }
}