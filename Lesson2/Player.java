public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        if (number > 0 && number <= 100) {
            this.number = number;
        } else {
            System.out.println("Ошибка: число должно быть в диапазоне от 1 до 100");
        }
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}