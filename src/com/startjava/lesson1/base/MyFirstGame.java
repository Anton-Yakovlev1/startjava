package com.startjava.lesson1.base;

public class MyFirstGame {
    public static void main(String[] args) {
        int targetNum = 1 + (int) (Math.random() * 100);
        System.out.println("Число компьютера " + targetNum);
        int playerNum = 33;
        System.out.println("Число пользователя " + playerNum);
        int diff = targetNum - playerNum;
        while (playerNum != targetNum) {
            if (playerNum > targetNum) {
                System.out.println(playerNum + " больше того, что загадал компьютер");
                playerNum += diff;
            } else if (playerNum < targetNum) {
                System.out.println(playerNum + " меньше того, что загадал компьютер");
                playerNum += diff;
            }
        }
        System.out.println("Вы победили " + targetNum + " = " + playerNum);
    }
}
