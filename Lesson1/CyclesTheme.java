import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.printf("%-12s%-14s%s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (char i = 33; i <= 122; i++) {
            if ((i <= 47 && (i % 2 != 0)) || (i >= 97 && (i % 2 == 0))) {
                System.out.printf("%4s%13c%14c%-1s\n", (int) i, i, ' ', Character.getName(i));
            }
        }

        System.out.println("\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 22; j++) {
                if (j < 10) {
                    System.out.print("-");
                } else if (j > 10 && (j < 16 - i)) {
                    System.out.print("*");
                } else if ((j > 16 - i) && (j < 18 + i)) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                System.out.print("  |");
            } else if (i == 1) {
                System.out.print("--+");
            } else {
                System.out.printf("%s |", i);
            }
            for (int j = 2; j <= 9; j++) {
                if (i == 0) {
                    System.out.printf("%3s", j);
                } else if (i == 1) {
                    System.out.print("---");
                } else {
                    System.out.printf("%3s", i * j);
                }
            }
            System.out.println(' ');
        }

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");

        /* Работающая версия кода, но до конца не понял как (подсмотрено на https://translated.turbopages
                .org/proxy_u/en-ru.ru.83757b9f-68175b5f-6510e8cf-74722d776562/https/stackoverflow
                .com/questions/27092911/display-five-numbers-per-line-in-java)
        */
        /*
        int upper = 24;
        for (int i = 1; i <= upper; i++) {
            for (int j = 0; j < 5; i++) {
                if ((i % 2 != 0) && i < upper) {
                    System.out.printf("%2d%s", i, " ");
                    j++;
                } else if (i > upper) {
                    System.out.printf("%2d%s", 0, " ");
                    j++;
                }
            }
            System.out.println();
        }
        */

        int upper = 24;
        int count = 0;
        for (int i = 1; i <= upper; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d%s", i, " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        if (count % 5 != 0) {
            int remaining = 5 - (count % 5);
            for (int i = 0; i < remaining; i++) {
                System.out.printf("%2d%s", 0, " ");
            }
            System.out.println();
        }

        System.out.println("\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        for (int i = max - 1; i >= min + 1; i--) {
            System.out.printf("%s ", i);
        }
        System.out.println();

        System.out.println("\n6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");
        int initialNumber = 1232324;
        int reserveNumber = initialNumber;
        int reversed = 0;
        int twosNumber = 0;
        while (initialNumber != 0) {
            int digit = initialNumber % 10;
            if (digit == 2) {
                twosNumber++;
            }
            reversed = reversed * 10 + digit;
            initialNumber /= 10;
        }
        boolean isPalindrome = reserveNumber == reversed;
        boolean isTwosNumberEven = (twosNumber % 2) == 0;
        System.out.printf("%s - %s %s (%s) количеством двоек\n", reversed,
                isPalindrome ? "палиндром" : "не палиндром",
                isTwosNumberEven ? "с четным" : "с нечетным", twosNumber);

        System.out.println("\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА");
        int originalNumber = 101002;
        int numLength = (int) (Math.log10(originalNumber) + 1);
        int firtsThreeDigits = originalNumber / (int) Math.pow(10, (numLength - 3));
        int firtsThreeDigitsSum = 0;
        while (firtsThreeDigits != 0) {
            int oneDigit = firtsThreeDigits % 10;
            firtsThreeDigitsSum += oneDigit;
            firtsThreeDigits /= 10;
        }
        int tempNum = originalNumber;
        int reversedNum = 0;
        while (tempNum != 0) {
            int oneDigit = tempNum % 10;
            reversedNum = reversedNum * 10 + oneDigit;
            tempNum /= 10;
        }
        int lastThreeDigits = reversedNum / (int) Math.pow(10, (numLength - 3));
        int lastThreeDigitsSum = 0;
        while (lastThreeDigits != 0) {
            int oneDigit = lastThreeDigits % 10;
            lastThreeDigitsSum += oneDigit;
            lastThreeDigits /= 10;
        }
        System.out.println(originalNumber + " - " + (firtsThreeDigitsSum == lastThreeDigitsSum ?
                "счастливое число" : "несчастливое число"));
        System.out.printf("Сумма цифр %03d = %s\n", originalNumber % (int) Math.pow(10, (numLength - 3)),
                lastThreeDigitsSum);
        System.out.printf("Сумма цифр %03d = %s\n", originalNumber / (int) Math.pow(10, (numLength - 3)),
                firtsThreeDigitsSum);

        System.out.println("\n8. ГЕНЕРАТОР ПАРОЛЯ");
        String password = "";
        int totalSymbolsCounter = 0;
        int digitsCounter = 0;
        int specialSymbolCounter = 0;
        int smallWordsCounter = 0;
        int bigWordsCounter = 0;
        for (int i = 0; i < 8; i++) {
            char symbol = (char) (new Random().nextInt(33, 126) + 1);
            if (symbol >= '0' && symbol <= '9') {
                digitsCounter++;
            }
            if ((symbol >= '!' && symbol <= '/') || (symbol >= ':' && symbol <= '@') ||
                    (symbol >= '[' && symbol <= '`') || (symbol >= '{' && symbol <= '~')) {
                specialSymbolCounter++;
            }
            if (symbol >= 'a' && symbol <= 'z') {
                smallWordsCounter++;
            }
            if (symbol >= 'A' && symbol <= 'Z') {
                bigWordsCounter++;
            }
            totalSymbolsCounter++;
            password += symbol;
        }
        System.out.println("Пароль: " + password);
        if (totalSymbolsCounter >= 8 && smallWordsCounter > 0 &&
                bigWordsCounter > 0 && specialSymbolCounter > 0) {
            System.out.println("Надежность: Надежный");
        } else if (totalSymbolsCounter >= 8 && (bigWordsCounter > 0 || digitsCounter > 0)) {
            System.out.println("Надежность: Средний");
        } else {
            System.out.println("Надежность: Слабый");
        }
    }
}
