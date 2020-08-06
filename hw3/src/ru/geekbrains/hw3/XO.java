package ru.geekbrains.hw3;

import java.util.Random;
import java.util.Scanner;

public class XO {
    static char[][] board;
    static Scanner input = new Scanner(System.in);
    static char player = 'x';
    static char computer = 'o';
    static char blank = ',';
    static Random numb = new Random();
    public static boolean checkWin(char dot) {
        if (board[0][0] == dot && board[0][1] == dot && board[0][2] == dot) {
            return true;
        }
        if (board[1][0] == dot && board[1][1] == dot && board[1][2] == dot) {
            return true;
        }
        if (board[2][0] == dot && board[2][1] == dot && board[2][2] == dot) {
            return true;
        }
        if (board[0][0] == dot && board[1][0] == dot && board[2][0] == dot) {
            return true;
        }
        if (board[0][1] == dot && board[1][1] == dot && board[2][1] == dot) {
            return true;
        }
        if (board[0][2] == dot && board[1][2] == dot && board[2][2] == dot) {
            return true;
        }
        if (board[0][0] == dot && board[1][1] == dot && board[2][2] == dot) {
            return true;
        }
        if (board[2][0] == dot && board[1][1] == dot && board[0][2] == dot) {
            return true;
        }
        return false;
    }
    public static boolean overBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == blank) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void computer() {
        int x, y;
        do {
            x = numb.nextInt(3);
            y = numb.nextInt(3);
        } while (!cell(x, y));
        board[y][x] = computer;
    }
    public static boolean cell(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        if (board[y][x] == blank) {
            return true;
        }
        return false;
    }
    public static void player() {
        int x, y;
        do {
            System.out.println("Введите ячейку в формате X Y:");
            x = input.nextInt() - 1;
            y = input.nextInt() - 1;
        } while (!cell(x, y));
        board[y][x] = player;

    }
    public static void launchBoard() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = blank;
            }
        }
    }

    public static void printBoard() {
        System.out.println();
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        launchBoard();
        printBoard();
        while (true) {
            player();
            printBoard();
            if (checkWin(player)) {
                System.out.println("Победа!");
                break;
            }
            if (overBoard()) {
                break;
            }
            computer();
            printBoard();
            if (checkWin(computer)) {
                System.out.println("Проигрыш!");
                break;
            }
            if (overBoard()) {
                break;
            }
        }
        System.out.print("Конец игры.");
    }
}
