import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanner2.nextLine());

        GuessNumber game = new GuessNumber();

        String answer = "";
        do {
            int targetNum = 1 + (int) (Math.random() * 100);
            System.out.println("Число компьютера: " + targetNum);
            game.setResult(false);
            while (game.getResult() == false) {
                System.out.print("\nВведите число первого игрока: ");
                playerOne.setNumber(scanner.nextInt());

                game.startGame(playerOne.getNumber(), targetNum, playerOne.getName());
                if (game.getResult() == true) {
                    break;
                }

                System.out.print("\nВведите число второго игрока: ");
                playerTwo.setNumber(scanner2.nextInt());

                game.startGame(playerTwo.getNumber(), targetNum, playerTwo.getName());
            }
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                answer = scanner.next().trim().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
        scanner.close();
    }
}
