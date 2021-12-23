package ru.job4j.condition;

public class MyltipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tue" -> 2;
            case "Среда", "Wed" -> 3;
            case "Четверг", "Thu" -> 4;
            case "Пятница", "Fri" -> 5;
            case "Суббота", "Sat" -> 6;
            case "Воскресенье", "Sun" -> 7;
            default -> -1;
        };
    }

   public static void main(String[] args) {
        int rsl = MyltipleSwitchWeek.numberOfDay("Вторник");
        System.out.println(rsl);
    }
}