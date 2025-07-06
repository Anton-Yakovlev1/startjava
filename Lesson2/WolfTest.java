public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();
        firstWolf.gender = "male";
        firstWolf.name = "Jack";
        firstWolf.weight = 30.3;
        firstWolf.age = 10;
        firstWolf.color = "Grey";

        System.out.println("Имя: " + firstWolf.name + "\nПол: " + firstWolf.gender +
                "\nВес: " + firstWolf.weight + "\nВозраст: " + firstWolf.age + "\nЦвет: " + firstWolf.color);

        firstWolf.walk();
        firstWolf.sit();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}
