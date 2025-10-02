import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int guess;
    private int targetNum;
    private boolean isGameFinished;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        targetNum = 1 + (int) (Math.random() * 100);
        isGameFinished = false;
    }

    public void play() {
        currentPlayer = playerOne;
        while (!isGameFinished) {
            System.out.println("\n" + currentPlayer.getName() + ", введите число от 1 до 100:");
            setGuess();
            continuationManage();
        }
    }

    public void setGuess() {
        guess = scanner.nextInt();
        if (guess == targetNum) {
            System.out.println(currentPlayer.getName() + " выиграл");
        } else if (guess < 1 || guess > 100) {
            System.out.println("Ошибка: введённое число должно быть в диапазоне от 1 до 100");
        } else if (guess < targetNum) {
            System.out.println("Число меньше загаданного. Попробуйте ещё раз");
        } else {
            System.out.println("Число больше загаданного. Попробуйте ещё раз");
        }
    }

    public void continuationManage() {
        if (guess == targetNum) {
            isGameFinished = true;
        } else {
            switchPlayer();
        }
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
    }
}