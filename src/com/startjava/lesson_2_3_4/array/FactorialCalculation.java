package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class FactorialCalculation {
    public static void main(String[] args) {
        calculateFactorials();
        calculateFactorials(null);
        calculateFactorials(-5);
        calculateFactorials(21, 0, 7);
        calculateFactorials(1, 20, 5, -3);
    }

    public static long factorial(int number) {
        if (number == 0 || number == 1) return 1;
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void printResult(int number, long result) {
        String formula = "";
        for (int i = 1; i <= number; i++) {
            if (number == 1) {
                break;
            }
            formula += i + (i < number ? " * " : " = ");
        }
        System.out.println(number + "! = " + formula + result);
    }

    public static void calculateFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: передан недействительный массив!");
            return;
        }

        //long[] results = new long[numbers.length];
        //int index = 0;

        for (int number : numbers) {
            if (number < 0) {
                System.out.println("Ошибка: факториал " + number + "! не определен");
            } else if (number > 20) {
                System.out.println("Ошибка: факториал " + number + "! слишком велик (максимум 20!)");
            } else {
                long result = factorial(number);
                //results[index++] = result;
                printResult(number, result);
            }
        }
        //System.out.println(Arrays.toString(results));
    }
}