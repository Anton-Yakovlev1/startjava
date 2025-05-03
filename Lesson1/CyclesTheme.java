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
                    System.out.printf("%3s", i*j);
                }
            }
            System.out.println(' ');
        }
    }
}
