package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRubli(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static double eurotoDollar(double value) {
        double rsl = 70 / 60 * value;
        return rsl;
    }

    public static float dollarToRubl(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 рублей это " + dollar + " долларов.");
        float eurotorubl = Converter.euroToRubli(140);
        System.out.println("140 Евро это " + eurotorubl + " рублей");
        double eurovdollar = Converter.eurotoDollar(140);
        System.out.println("140 Евро это " + eurovdollar +  " долларов");
        float dollarvrubl = Converter.dollarToRubl(140);
        System.out.println("140 Долларов это " + dollarvrubl + " рублей");
    }
}
