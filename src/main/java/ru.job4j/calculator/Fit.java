package ru.job4j.calculator;

public class Fit {
    public static double manWeight(float height) {
    double rls = (height - 100) * 1.15;
        double rls1 = rls;
        return rls1;
}

    public static double womanWeight(short heightw) {
    double rls = (heightw - 110) * 1.15;
    return rls;
}

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        short heightw = 175;
        double woman = Fit.womanWeight(heightw);
        System.out.println("Woman 175 is " + woman);
    }

}

