package ru.job4j.calculator;

public class Calculator {

    public static void plus (int a, int b){
        int summa = a + b;
        System.out.println(summa);
    }
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int onePlusTwo = one +  two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        int size = 10;
        size = size + 90;
        System.out.println(size);
        size = size - 5;
        System.out.println(size);
        Calculator.plus(100, 50);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);






    }
}
