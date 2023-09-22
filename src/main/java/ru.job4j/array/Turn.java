package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < 1; i++) {
            int cell = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = cell;
            int temp = array[1];
            array[1] = array[2];
            array[2] = temp;
        }
        return array;
    }

    public static int[] backTwo(int[] array) {
        for (int i = 0; i < 1; i++) {
            int cell = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = cell;
            int temp = array[1];
            array[1] = array[3];
            array[3] = temp;
        }
        return array;
    }
}
