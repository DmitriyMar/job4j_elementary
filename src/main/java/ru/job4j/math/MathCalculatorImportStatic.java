package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculatorImportStatic {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double raznAndDel(double first, double second) {
        return razn(first, second)
                + del(first, second);
    }

    public static double summaVseh(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + razn(first, second)
                + del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления: " + raznAndDel(10,20));
        System.out.println("Сумма всех чисел " + summaVseh(10,20));
    }
}
