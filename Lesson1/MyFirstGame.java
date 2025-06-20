public class MyFirstGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        max -= min;
        int rnd = ((int) (Math.random() * ++max)) + min;
        System.out.println("Число компьютера " + rnd);
        int userNum = 33;
        System.out.println("Число пользователя " + userNum);
        int diff = rnd - userNum;
        while (rnd - userNum != 0) {
            if (rnd - userNum < 0) {
            System.out.println(userNum + " больше того, что загадал компьютер");
            userNum += diff;
            } else if (rnd - userNum > 0) {
                System.out.println(userNum + " меньше того, что загадал компьютер");
            userNum += diff;
            }
        }
        System.out.println("Вы победили " + rnd + " = " + userNum);
    }
}
