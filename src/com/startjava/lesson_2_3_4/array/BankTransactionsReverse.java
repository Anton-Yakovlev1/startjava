package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionsReverse {
    public static void main(String[] args) {
        int[] transactions1 = new int[0];
        int[] transactions2 = null;
        int[] transactions3 = {5};
        int[] transactions4 = {6, 8, 9, 1};
        int[] transactions5 = {13, 8, 5, 3, 2, 1, 1};

        displayTransactions(transactions1);
        displayTransactions(transactions2);
        displayTransactions(transactions3);
        displayTransactions(transactions4);
        displayTransactions(transactions5);
    }

    private static void displayTransactions(int[] transactions) {
        System.out.print("\nИсходные транзакции: ");
        printTransactions(transactions);
        System.out.print("В обратном порядке: ");
        printTransactions(reverseTransactions(transactions));
    }

    private static void printTransactions(int[] transactions) {
        if (transactions == null) {
            System.out.println("null");
        } else if (transactions.length == 0) {
            System.out.println("[]");
        } else {
            System.out.println(Arrays.toString(transactions));
        }
    }

    private static int[] reverseTransactions(int[] transactions) {
        if (transactions == null || transactions.length == 0) {
            return transactions;
        }

        int[] reversed = new int[transactions.length];
        for (int i = 0; i < transactions.length; i++) {
            reversed[i] = transactions[transactions.length - 1 - i];
        }
        return reversed;
    }
}
