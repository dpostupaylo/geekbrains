package ru.geekbrains.postupaylo.homework3;

import java.util.Arrays;

public class Homework3 {
    private void swapZeroAndUnit(){
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i = 0; i < array.length; i++){
            if (array[i] == 0)
                array[i] = 1;
            else
                array[i] = 0;
        }
    }

    private void fillArrayWithSequence(){
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
    }

    private void multiplyNumbers(){
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
    }

    private void fillDiagonalWithUnits(int length){
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || (length - i - 1 == j))
                    array[i][j] = 1;
                else
                    array[i][j] = 2;
            }
        }
    }

    private int[] fillArray(int length, int value){
        int[] result = new int[length];
        Arrays.fill(result, value);
        return result;
    }

    private void findMaxAndMin(){
        int max = 0;
        int min = 0;
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Max is " + max + " min is " + min);
    }

    private boolean checkBalance(int[] array){
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            int sumLeftSide = getSummOfArray(Arrays.copyOfRange(array, 0, i));
            int sumRightSide = getSummOfArray(Arrays.copyOfRange(array, i, array.length));
            if (sumLeftSide == sumRightSide)
                result = true;
        }
        return result;
    }

    private int getSummOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private void shift(int[] array, int number) {
        while (number > 0) {
            int last = array[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                int current = array[i];
                array[i] = last;
                last = current;
            }
            number--;
        }
        System.out.println(Arrays.toString(array));
    }
}
