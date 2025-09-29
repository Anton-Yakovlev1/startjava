import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int targetNum;
    private boolean gameOver;
    Scanner scanner = new Scanner(System.in);

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
        gameOver = false;
    }

    public void play() {
        int turn = 1;
        while (!gameOver) {
            Player currentPlayer = (turn % 2 == 1) ? playerOne : playerTwo;
            System.out.println("\n" + currentPlayer.getName() + ", введите число от 1 до 100:");
            int guess = scanner.nextInt();
            
            if (guess == targetNum) {
                System.out.println(currentPlayer.getName() + " выиграл");
                gameOver = true;
            } else if (guess < 1 || guess > 100) {
                System.out.println("Ошибка: введённое число должно быть в диапазоне от 1 до 100");
            } else {
                System.out.println("Попробуйте ещё раз");
                turn++;
            }
        }
    }

    public void restart() {
        resetGame();
    }
}