package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
    double rls = (height - 100) * 1.15;
    return rls;
}
    public static double womanWeight(short heightwoman) {
    double rls = (heightwoman - 110) * 1.15;
    return rls;
}
    public static void main (String [] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        short heightwoman = 175;
        double woman = Fit.womanWeight(heightwoman);
        System.out.println("Woman 175 is " + woman);
    }

}

