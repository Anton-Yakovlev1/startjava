package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int guess;
    private int targetNum;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        targetNum = 1 + (int) (Math.random() * 100);
    }

    public void play() {
        currentPlayer = playerOne;
        while (true) {
            inputNumber();
            if (isGuessed()) {
                break;
            }
            switchPlayer();
        }
    }

    public void inputNumber() {
        System.out.println("\n" + currentPlayer.getName() + ", введите число от 1 до 100:");
        Scanner scanner = new Scanner(System.in);
        guess = scanner.nextInt();
        if (guess < 1 || guess > 100) {
            System.out.println("Ошибка: введённое число должно быть в диапазоне от 1 до 100");
        }
    }

    public boolean isGuessed() {
        if (guess == targetNum) {
            System.out.println(currentPlayer.getName() + " выиграл");
            return true;
        }

        if (guess < targetNum) {
            System.out.println("Число меньше загаданного. Попробуйте ещё раз");
        } else {
            System.out.println("Число больше загаданного. Попробуйте ещё раз");
        }
        return false;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
    }
}