package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        int[][] original = {null,
                {-5},
                {21, 0, 7},
                {1, 20, 5, -3},
                {}};

        for (int[] transactions : original) {
            long[] results = calculateFactorials(transactions);
            displayExpression(results, transactions);
        }
    }

    private static long[] calculateFactorials(int... numbers) {
        if (numbers == null) {
            return null;
        }

        long[] results = new long[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number < 0 || number > 20) {
                results[index] = (number < 0) ? -1 : Long.MAX_VALUE;
            } else {
                long factorial = 1;
                for (int i = 2; i <= number; i++) {
                    factorial *= i;
                }
                results[index] = factorial;
            }
            index++;
        }
        return results;
    }

    private static void displayExpression(long[] results, int... numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Ошибка: передан недействительный массив!\n");
            return;
        }

        StringBuilder numberAnalysisOutput = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (results[i] == -1) {
                numberAnalysisOutput.append("Ошибка: факториал ").append(numbers[i])
                        .append("! не определен\n");
            } else if (results[i] == Long.MAX_VALUE) {
                numberAnalysisOutput.append("Ошибка: факториал ").append(numbers[i])
                        .append("! слишком велик (максимум 20!)\n");
            } else {
                numberAnalysisOutput.append(buildExpression(numbers[i], results[i])).append("\n");
            }
        }
        System.out.println(numberAnalysisOutput);
    }

    private static String buildExpression(int number, long result) {
        StringBuilder expression = new StringBuilder();
        expression.append(number).append("! = ");

        boolean isFormulaNeeded = (number != 0 && number != 1);
        if (isFormulaNeeded) {
            for (int i = 1; i <= number; i++) {
                expression.append(i).append((i < number) ? " * " : "");
            }
            expression.append(" = ");
        }
        expression.append(result);
        return expression.toString();
    }
}