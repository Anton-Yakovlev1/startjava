package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ElementsRemover {
    public static void main(String[] args) {
        double[] mass = fillWithRandoms(15);
        double[] finalMass = mass.clone();
        massTest(finalMass, 15);
        printArrays(mass, finalMass, 14);
        //System.out.println(Arrays.toString(mass));
        //System.out.println(Arrays.toString(finalMass));
    }

    public static double[] fillWithRandoms(int size) {
        double[] array = new double[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextDouble();
        }
        return array;
    }

    public static double[] massTest(double[] finalMass, int index) {
        if (checkIndex(finalMass, index) == true) {
            return finalMass;
        } else {
            for (int i = ++index; i < finalMass.length; i++) {
                finalMass[i] = 0;
            }
        }
        return finalMass;
    }

    public static void printArrays(double[] mass, double[] finalMass, int index) {
        if (checkIndex(mass, index) == false) {
            for (int i = 0; i < 8; i++) {
                System.out.print(mass[i] + " ");
            }
            System.out.println();
            for (int i = 8; i < mass.length; i++) {
                System.out.print(mass[i] + " ");
            }
            System.out.println("\n\n");
            for (int i = 0; i < 8; i++) {
                System.out.print(finalMass[i] + " ");
            }
            System.out.println();
            for (int i = 8; i < mass.length; i++) {
                System.out.print(finalMass[i] + " ");
            }

            System.out.println("\n\n" + index);
        }
    }

    public static boolean checkIndex(double[] mass, int index) {
        boolean check = false;
        if (index < 0 || index > mass.length - 1) {
            int i = 0;
            int[] indexes = new int[mass.length];
            for (double ind : mass) {
                indexes[i] += i;
                i++;
            }
            //System.out.println("Индекс не входит в границы");
            //System.out.println("Передан индекс " + index + " допустимые индексы " + Arrays.toString(indexes));
            check = true;
        }
        return check;
    }
}