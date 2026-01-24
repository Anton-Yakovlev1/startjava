package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionsReverser {
    public static void main(String[] args) {
        int[][] original = {new int[0], null, {5}, {6, 8, 9, 1}, {13, 8, 5, 3, 2, 1, 1}};
        int[] reversed;

        for (int[] transaction : original) {
            reversed = reverse(transaction);
            displayTransactions(transaction, reversed);
        }
    }

    private static int[] reverse(int[] transactions) {
        if (transactions == null || transactions.length == 0) {
            return transactions;
        }

        int[] reversed = new int[transactions.length];
        int index = transactions.length;
        for (int transaction : transactions) {
            reversed[--index] = transaction;
        }
        return reversed;
    }

    private static void displayTransactions(int[] transactions, int[] reversed) {
        System.out.println("\nИсходные транзакции: " + Arrays.toString(transactions));
        System.out.println(" В обратном порядке: " + Arrays.toString(reversed));
    }
}