 package ru.job4j.condition;

public class DummyBot {
    public static String answer(String questions) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(questions)) {
            rsl = "Привет, Умник.";
        }  else if ("Пока.".equals(questions)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
}

public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Любая другая фраза.");
        System.out.println(rsl);
    }
}
