package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int x = x1 - x2;
        int y = y1 - y2;
        if (Math.abs(x) == Math.abs(y)) {
            return rsl;
        }
        return 0;
    }
}
