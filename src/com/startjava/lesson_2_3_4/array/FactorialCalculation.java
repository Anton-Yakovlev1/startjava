package com.startjava.lesson_2_3_4.array;

public class FactorialCalculation {
    public static void main(String[] args) {
        long[] results = calculateFactorials();
        printResult(results, new int[0]);

        results = calculateFactorials(null);
        printResult(results, null);

        results = calculateFactorials(-5);
        printResult(results, -5);

        results = calculateFactorials(21, 0, 7);
        printResult(results, 21, 0, 7);

        results = calculateFactorials(1, 20, 5, -3);
        printResult(results, 1, 20, 5, -3);
    }

    public static long[] calculateFactorials(int... numbers) {
        if (numbers == null) {
            return null;
        }

        long[] results = new long[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number < 0) {
                results[index++] = Long.MIN_VALUE;
            } else if (number > 20) {
                results[index++] = Long.MAX_VALUE;
            } else {
                long result = factorial(number);
                results[index++] = result;
            }
        }
        return results;
    }

    public static void printResult(long[] results, int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: передан недействительный массив!\n");
            return;
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (results[i] == Long.MIN_VALUE) {
                output.append("Ошибка: факториал ").append(numbers[i]).append("! не определен\n");
            } else if (results[i] == Long.MAX_VALUE) {
                output.append("Ошибка: факториал ").append(numbers[i]).append("! слишком велик (максимум 20!)\n");
            } else {
                output.append(buildFactorialExpression(numbers[i], results[i])).append("\n");
            }
        }
        System.out.println(output);
    }

    private static String buildFactorialExpression(int number, long result) {
        StringBuilder expression = new StringBuilder();
        expression.append(number).append("! = ");

        boolean showFormula = !(number == 0 || number == 1);
        if (showFormula) {
            for (int i = 1; i <= number; i++) {
                expression.append(i).append((i < number) ? " * " : "");
            }
            expression.append(" = ");
        }
        expression.append(result);
        return expression.toString();
    }

    public static long factorial(int number) {
        if (number == 0 || number == 1) return 1;
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}