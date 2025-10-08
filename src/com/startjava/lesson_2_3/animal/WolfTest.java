package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();
        firstWolf.setGender("male");
        firstWolf.setName("Jack");
        firstWolf.setWeight(30.3);
        firstWolf.setAge(5);
        firstWolf.setColor("Grey");

        System.out.println("Имя: " + firstWolf.getName() + "\nПол: " + firstWolf.getGender() +
                "\nВес: " + firstWolf.getWeight() + "\nВозраст: " + firstWolf.getAge() +
                "\nЦвет: " + firstWolf.getColor());

        firstWolf.walk();
        firstWolf.sit();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}
