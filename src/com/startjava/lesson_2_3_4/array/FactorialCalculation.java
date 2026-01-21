package com.startjava.lesson_2_3_4.array;

public class FactorialCalculation {

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

    /*public static void addResult(long result, countResult) {
        long[] factorials = new long[countResult.length];
        int countValidNumbers = 0;
        for (int i = 0; i < countResult.length; i++) {
            //int number = numbers[i];
            factorials[countValidNumbers++] = result;
        }

        for (long fact : factorials) {
            System.out.println(fact);
        }
    }*/

    public static void calculateFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: передан недействительный массив!");
            return;
        }

        //int countResult = 0;
        //int newArrayLength = 0;
        for (int number : numbers) {
            if (number < 0) {
                System.out.println("Ошибка: факториал " + number + "! не определен");
            } else if (number > 20) {
                System.out.println("Ошибка: факториал " + number + "! слишком велик (максимум 20!)");
            } else {
                long result = factorial(number);
                //countResult++;
                printResult(number, result);
                //addResult(result, numbers);
            }
        }
        //newArrayLength += countResult;
        //System.out.println(newArrayLength);
    }

    public static void main(String[] args) {
        calculateFactorials();               // пустой массив
        calculateFactorials(null);           // null-значение
        calculateFactorials(-5);             // отрицательное число
        calculateFactorials(21, 0, 7);      // смешанное значение, одно большое
        calculateFactorials(1, 20, 5, -3);  // ещё одна смесь значений
    }
}