package ru.job4j.calculator;

public class Fit {
    private static final double WEIGHT_COEFFICIENT = 1.15;

    /**
     * Рассчитывает оптимальный вес для мужчины на основе его роста.
     *
     * @param height рост мужчины
     * @return оптимальный вес для мужчины
     */
    public static double calculateManWeight(short height) {
        return (height - 100) * WEIGHT_COEFFICIENT;
    }

    /**
     * Рассчитывает оптимальный вес для женщины на основе ее роста.
     *
     * @param height рост женщины
     * @return оптимальный вес для женщины
     */
    public static double calculateWomanWeight(short height) {
        return (height - 110) * WEIGHT_COEFFICIENT;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double manWeight = calculateManWeight(heightMan);
        System.out.println("Optimal weight for a man with height 187 is " + manWeight);

        // Расчет веса женщины и вывод результата
        double womanWeight = calculateWomanWeight(heightWoman);
        System.out.println("Optimal weight for a woman with height 170 is " + womanWeight);
    }
}

