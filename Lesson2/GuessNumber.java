public class GuessNumber {
    private boolean result;

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public void startGame(int playerNum, int targetNum, String playerName) {
        if (playerNum > targetNum) {
            System.out.println(playerNum + " больше того, что загадал компьютер");
        } else if (playerNum < targetNum) {
            System.out.println(playerNum + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число угадано! Победил " + playerName);
            result = true;
        }
    }
}