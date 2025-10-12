package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            calc.setA(scanner.nextInt());
            System.out.print("Введите второе число: ");
            calc.setB(scanner.nextInt());
            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            calc.setOperation(scanner.next().charAt(0));
            calc.calculate();
            System.out.print("Результат: ");
            System.out.println(calc.getResult());

            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next().trim().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
        scanner.close();
    }
}