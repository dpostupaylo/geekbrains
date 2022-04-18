package ru.geekbrains.postupaylo;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 0;
        int b = 0;

        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    private static void printColor() {
        int value = 0;

        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    private static void checkSumSign() {
        int a = 0;
        int b = 0;

        int c = a + b;
        if (c >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
}
