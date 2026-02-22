package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ElementsRemover {
    public static void main(String[] args) {
        int size = 15;
        int index = -1;
        double[] mass = fillWithRandoms(size);
        double[] finalMass = mass.clone();
        replaceWithZero(finalMass, index);
        printArrays(mass, finalMass, index);

        finalMass = mass.clone();
        index = 15;
        replaceWithZero(finalMass, index);
        printArrays(mass, finalMass, index);

        finalMass = mass.clone();
        index = 0;
        replaceWithZero(finalMass, index);
        printArrays(mass, finalMass, index);

        finalMass = mass.clone();
        index = 14;
        replaceWithZero(finalMass, index);
        printArrays(mass, finalMass, index);
    }

    public static double[] fillWithRandoms(int size) {
        double[] array = new double[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextDouble();
        }
        return array;
    }

    public static double[] replaceWithZero(double[] finalMass, int index) {
        if (checkIndex(finalMass, index)) {
            return finalMass;
        } else {
            for (int i = ++index; i < finalMass.length; i++) {
                finalMass[i] = 0;
            }
        }
        return finalMass;
    }

    public static void printArrays(double[] mass, double[] finalMass, int index) {
        if (!checkIndex(mass, index)) {
            System.out.println("\nИсходный масив:");
            for (int i = 0; i < 8; i++) {
                System.out.printf("%.3f ", mass[i]);
            }
            System.out.println();
            for (int i = 8; i < mass.length; i++) {
                System.out.printf("%.3f ", mass[i]);
            }

            System.out.println("\n\nИзмененный массив:");

            for (int i = 0; i < 8; i++) {
                System.out.printf("%.3f ", finalMass[i]);
            }
            System.out.println();
            for (int i = 8; i < mass.length; i++) {
                System.out.printf("%.3f ", finalMass[i]);
            }

            System.out.println("\n\nПереданный индекс: " + index);
            System.out.printf("Значение ячейки из переданного индекса: %.3f ", finalMass[index]);
        } else {
            int i = 0;
            int[] indexes = new int[mass.length];
            for (double ind : mass) {
                indexes[i] += i;
                i++;
            }
            System.out.println("Индекс не входит в границы");
            System.out.println("Передан индекс " + index + " допустимые индексы " + Arrays.toString(indexes) + "\n");
        }
    }

    public static boolean checkIndex(double[] mass, int index) {
        boolean check = false;
        if (index < 0 || index > mass.length - 1) {
            check = true;
        }
        return check;
    }
}