package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean massiv : data) {
            if (!massiv) {
                return false;
            }
        }
            return result;
        }
    }

