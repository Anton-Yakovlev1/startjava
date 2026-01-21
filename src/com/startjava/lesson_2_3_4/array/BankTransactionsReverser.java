package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionsReverser {
    public static int[] reversed;

    public static void main(String[] args) {
        final int[] transactions1 = new int[0];
        final int[] transactions2 = null;
        final int[] transactions3 = {5};
        final int[] transactions4 = {6, 8, 9, 1};
        final int[] transactions5 = {13, 8, 5, 3, 2, 1, 1};

        reversed = reverse(transactions1);
        displayTransactions(transactions1, reversed);

        reversed = reverse(transactions2);
        displayTransactions(transactions2, reversed);

        reversed = reverse(transactions3);
        displayTransactions(transactions3, reversed);

        reversed = reverse(transactions4);
        displayTransactions(transactions4, reversed);

        reversed = reverse(transactions5);
        displayTransactions(transactions5, reversed);
    }

    private static void displayTransactions(int[] transactions, int[] reversed) {
        System.out.print("\nИсходные транзакции: ");
        printTransactions(transactions);
        System.out.print(" В обратном порядке: ");
        printTransactions(reversed);
    }

    private static void printTransactions(int[] transactions) {
        System.out.println(Arrays.toString(transactions));
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
}
