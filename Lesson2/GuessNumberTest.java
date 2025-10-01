import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player playerOne = new Player(scanner.nextLine());

        System.out.print("\nВведите имя второго игрока: ");
        Player playerTwo = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        String answer = "";
        do {
            game.play();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine().trim().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
            if (answer.equals("yes")) {
                game.restart();
            }
        } while (answer.equals("yes"));

        System.out.println("Спасибо за игру!");

        scanner.close();
    }
}