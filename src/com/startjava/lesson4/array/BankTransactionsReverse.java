package com.startjava.lesson4.array;

public class BankTransactionsReverse {
    static int[] transactions1 = new int[0];
    static int[] transactions2 = null;
    static int[] transactions3 = {5};
    static int[] transactions4 = {6, 8, 9, 1};
    static int[] transactions5 = {13, 8, 5, 3, 2, 1, 1};

    public static void main(String[] args) {
        System.out.print("\nИсходные транзакции: ");
        printTransactions(transactions1);
        System.out.print("В обратном порядке: ");
        printTransactions(reverseTransactions(transactions1));

        System.out.print("\nИсходные транзакции: ");
        printTransactions(transactions2);
        System.out.print("В обратном порядке: ");
        printTransactions(reverseTransactions(transactions2));

        System.out.print("\nИсходные транзакции: ");
        printTransactions(transactions3);
        System.out.print("В обратном порядке: ");
        printTransactions(reverseTransactions(transactions3));

        System.out.print("\nИсходные транзакции: ");
        printTransactions(transactions4);
        System.out.print("В обратном порядке: ");
        printTransactions(reverseTransactions(transactions4));

        System.out.print("\nИсходные транзакции: ");
        printTransactions(transactions5);
        System.out.print("В обратном порядке: ");
        printTransactions(reverseTransactions(transactions5));
    }

    public static void printTransactions(int[] transactions) {
        if (transactions == null) {
            System.out.println("null");
        } else if (transactions.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < transactions.length; i++) {
                System.out.print(transactions[i]);
                if (i < transactions.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static int[] reverseTransactions(int[] transactions) {
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
