package ru.job4j.converter;

public class Converter {

    public static float RubleToEuro (float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float RubleToDollar (float value) {
        float rsl = value / 60;
        return rsl;
    }
    public static float EuroToRubli (float value) {
        float rsl = value * 70;
        return rsl;
    }
    public static double EurotoDollar (double value) {
        double rsl = 70 / 60 * value;
        return rsl;
    }
    public static float DollarToRubl (float value) {
        float rsl = value * 60;
        return rsl;
    }
    public static void main(String[] args) {
        float euro = Converter.RubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.RubleToDollar(140);
        System.out.println("140 рублей это " + dollar + " долларов." );
        float eurotorubl = Converter.EuroToRubli(140);
        System.out.println("140 Евро это " + eurotorubl + " рублей");
        double eurovdollar = Converter.EurotoDollar(140);
        System.out.println("140 Евро это " + eurovdollar +  " долларов");
        float dollarvrubl = Converter.DollarToRubl(140);
        System.out.println("140 Долларов это " + dollarvrubl + " рублей");
    }
}
