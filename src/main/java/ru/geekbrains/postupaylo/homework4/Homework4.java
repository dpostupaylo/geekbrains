package ru.geekbrains.postupaylo.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static int SIZE = 4;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        return  getMatchesInRows(symb) == DOTS_TO_WIN
                || getMatchesInColumns(symb)  == DOTS_TO_WIN
                || getMatchesInLeftDiagonal(symb)  == DOTS_TO_WIN
                || getMatchesInRightDiagonal(symb)  == DOTS_TO_WIN;
    }

    private static int getMatchesInRows(char symb) {
        int maxCountOfMatchesInRows = 0;

        for (int i = 0; i < map.length; i++) {
            String currentRow = Arrays.toString(map[i]);
            int maxCountOfMatchesInRow = getCountOfSequenceSymbols(currentRow, symb);
            maxCountOfMatchesInRows = Math.max(maxCountOfMatchesInRow, maxCountOfMatchesInRows);
        }

        return maxCountOfMatchesInRows;
    }

    private static int getMatchesInColumns(char symb) {
        int maxCountOfMatchesInRows = 0;

        for (int i = 0; i < map.length; i++) {
            String currentColumn = "";
            for (int j = 0; j < map[i].length; j++) {
                currentColumn += map[j][i];
            }

            int maxCountOfMatchesInRow = getCountOfSequenceSymbols(currentColumn, symb);
            maxCountOfMatchesInRows = Math.max(maxCountOfMatchesInRow, maxCountOfMatchesInRows);
        }

        return maxCountOfMatchesInRows;
    }

    private static int getMatchesInLeftDiagonal(char symb) {
        String currentLeftDiagonal = "";
        for (int i = 0; i < map.length; i++) {
            currentLeftDiagonal += map[i][i];
        }
        return getCountOfSequenceSymbols(currentLeftDiagonal, symb);
    }

    private static int getMatchesInRightDiagonal(char symb) {
        String currentRightDiagonal = "";
        for (int i = 0; i < map.length; i++) {
            currentRightDiagonal += map[i][map.length - i - 1];
        }

        return getCountOfSequenceSymbols(currentRightDiagonal, symb);
    }

    private static int getCountOfSequenceSymbols(String row, char symb){
        int count = 0;
        int maxCountOfMatchesInRow = count;

        for (int j = 0; j < row.length(); j++) {
            if (row.charAt(j) == symb) {
                count++;
            } else {
                count = 0;
            }
            maxCountOfMatchesInRow = Math.max(maxCountOfMatchesInRow, count);
        }

        return maxCountOfMatchesInRow;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y +
                1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
