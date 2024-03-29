package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int cell = array[source];
        array[source] = array[dest];
        array[dest] = cell;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbs = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(numbs);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}

