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

    public static float eurotoDollar(float value) {
        double rsl = 70 / 70 * value;
        return (float) rsl;
    }

    public static float dollarToRubl(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float dollar = Converter.rubleToDollar(140);
        float in1 = 120;
        float expected1 = 2;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rublei 2. Test result: " + passed1);
        System.out.println("140 рублей это " + dollar + " долларов.");
        float eurotorubl = Converter.euroToRubli(140);
        float in2 = 2;
        float expected2 = 140;
        float out3 = Converter.euroToRubli(in2);
        boolean passed2 = expected2 == out3;
        System.out.println("  Euro to Rubli 2. Test result " + passed2);
        System.out.println("140 Евро это " + eurotorubl + " рублей");
        double eurovdollar = Converter.eurotoDollar(140);
        System.out.println("140 Евро это " + eurovdollar +  " долларов");
        float in3 = 140;
        float expected3 = 140;
        float out4 = Converter.eurotoDollar(in3);
        boolean passed3 = expected3 == out4;
        System.out.println(" 140 rublei are 2. Test result " + passed3);
        float dollarvrubl = Converter.dollarToRubl(140);
        System.out.println("140 Долларов это " + dollarvrubl + " рублей");
        float in4 = 2;
        float expected4 = 120;
        float out5 = Converter.dollarToRubl(in4);
        boolean passed4 = expected4 == out5;
        System.out.println("Dollar to rubl 2. Test result : " + passed4);
    }
}
