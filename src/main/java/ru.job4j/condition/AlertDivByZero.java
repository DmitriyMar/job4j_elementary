package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(-2);
        possibleDiv(-15);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
