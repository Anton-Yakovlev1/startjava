import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private int targetNum;
    private boolean isGameFinished;
    private int guess;
    Scanner scanner = new Scanner(System.in);

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getTargetNum() {
        return targetNum;
    }

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        resetGame();
    }

    private void resetGame() {
        targetNum = 1 + (int) (Math.random() * 100);
        isGameFinished = false;
    }

    public void numberCheck() {
        if (guess == targetNum) {
            System.out.println(currentPlayer.getName() + " выиграл");
            isGameFinished = true;
        } else if (guess < 1 || guess > 100) {
            System.out.println("Ошибка: введённое число должно быть в диапазоне от 1 до 100");
        } else {
            System.out.println("Попробуйте ещё раз");
            currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
        }
    }

    public void play() {
        System.out.println("\nЧисло компьютера: " + getTargetNum());
        currentPlayer = playerOne;
        while (!isGameFinished) {
            System.out.println("\n" + currentPlayer.getName() + ", введите число от 1 до 100:");
            setGuess(scanner.nextInt());
            numberCheck();
        }
    }

    public void restart() {
        resetGame();
    }
}