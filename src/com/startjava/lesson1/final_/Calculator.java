package com.startjava.lesson1.final_;

public class Calculator {
    public static void main(String[] args) {
        double result = 0;
        int a = 3;
        int b = 4;
        char operation = '%';
        if (a >= 0 && b >= 0) {
            if (operation == '+') {
                result = a + b;
            } else if (operation == '-') {
                result = a - b;
            } else if (operation == '*') {
                result = a * b;
            } else if (operation == '/') {
                result = (double) a / b;
            } else if (operation == '%') {
                result = a % b;
            } else if (operation == '^') {
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            } else {
                System.out.println("Не правильно определено действие");
            }
            System.out.printf("%d %c %d = %s", a, operation, b, result);
        } else {
            System.out.printf("Одно или несколько чисел не являются натуральными, результат: %s", result);
        }
    }
}
