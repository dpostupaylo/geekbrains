package ru.geekbrains.postupaylo.homework2;

public class Homework2 {
    private boolean sumInRange(int number1, int number2){
        int sum = number1 + number2;
        if (sum >= 10 && sum <= 20 )
            return true;
        return false;
    }

    private void isPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    private boolean numberIsPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private void printStringCountTimes(String item, int count){
        for (int i = 0; i < count; i++){
            System.out.println(item);
        }
    }

    private boolean isLeapYear(int year){
        if ((year % 4) == 0 || ((year % 100) == 0 && (year % 400) == 0))
            return true;
        else
            return false;
    }
}
