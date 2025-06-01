import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.printf("%-12s%-14s%s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (char i = 33; i <= 122; i++) {
            if ((i <= 47 && (i % 2 != 0)) || (i >= 97 && (i % 2 == 0))) {
                System.out.printf("%4d%13c%14c%-1s\n", (int) i, i, ' ', Character.getName(i));
            }
        }

        System.out.println("\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int i = 0; i < 5; i++) {
            System.out.print("----------");
            for (int j = 0; j < 12; j++) {
                if (j > 0 && (j < 6 - i)) {
                    System.out.print("*");
                } else if ((j > 6 - i) && (j < 8 + i)) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.println("  |  2  3  4  5  6  7  8  9\n--+------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int upper = 24;
        for (int i = 0; i < upper;) {
            for (int j = 0; j < 10; j++) {
                if (i % 2 != 0 && i < upper) {
                    System.out.printf("%2d ", i);
                }
                if (i % 2 != 0 && i >= upper) {
                    System.out.printf("%2d ", 0);
                }
                i++;
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

        System.out.println("\n\n6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");
        int initialNumber = 1232324;
        int currNumber = initialNumber;
        int reversed = 0;
        int twosNumber = 0;
        while (initialNumber > 0) {
            if (initialNumber % 10 == 2) {
                twosNumber++;
            }
            reversed = reversed * 10 + initialNumber % 10;
            initialNumber /= 10;
        }
        System.out.printf("%s - %s %s (%s) количеством двоек\n", reversed,
                currNumber == reversed ? "палиндром" : "не палиндром",
                (twosNumber % 2) == 0 ? "с четным" : "с нечетным", twosNumber);

        System.out.println("\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА");
        initialNumber = 101002;
        int firstHalf = initialNumber / 1000;
        int secondHalf = initialNumber % 1000;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        while (firstHalf > 0) {
            int digit = firstHalf % 10;
            firstHalfSum += digit;
            firstHalf /= 10;
            digit = secondHalf % 10;
            secondHalfSum += digit;
            secondHalf /= 10;
        }
        System.out.println(initialNumber + " - " + (firstHalfSum == secondHalfSum ?
                "счастливое число" : "несчастливое число"));
        System.out.printf("Сумма цифр %03d = %s\n", initialNumber % 1000, secondHalfSum);
        System.out.printf("Сумма цифр %03d = %s\n", initialNumber / 1000, firstHalfSum);

        System.out.println("\n8. ГЕНЕРАТОР ПАРОЛЯ");
        String password = "";
        int totalSymbolsCounter = 0;
        boolean hasDigits = false;
        boolean hasSpecialSymbols = false;
        boolean hasLowerWords = false;
        boolean hasUpperWords = false;
        for (int i = 0; i < 8; i++) {
            char symbol = (char) (new Random().nextInt(33, 127));
            if (Character.isDigit(symbol)) {
                hasDigits = true;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                hasSpecialSymbols = true;
            }
            if (Character.isLowerCase(symbol)) {
                hasLowerWords = true;
            }
            if (Character.isUpperCase(symbol)) {
                hasUpperWords = true;
            }
            totalSymbolsCounter++;
            password += symbol;
        }
        System.out.println("Пароль: " + password);
        if (totalSymbolsCounter >= 8 && hasLowerWords &&
                hasUpperWords && hasSpecialSymbols) {
            System.out.println("Надежность: Надежный");
        } else if (totalSymbolsCounter >= 8 && (hasUpperWords || hasDigits)) {
            System.out.println("Надежность: Средний");
        } else {
            System.out.println("Надежность: Слабый");
        }
    }
}
