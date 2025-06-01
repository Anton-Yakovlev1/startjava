public class Calculator {
    public static void main(String[] args) {
        double result = -9999;
        int a = 3;
        int b = 4;
        char operation = '^';
        if (a >= 0 && b >= 0) {
            if (operation == '+') {
                result = a + b;
            }
            if (operation == '-') {
                result = a - b;
            }
            if (operation == '*') {
                result = a * b;
            }
            if (operation == '/') {
                result = (double) a / b;
            }
            if (operation == '%') {
                result = a % b;
            }
            if (operation == '^') {
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            }
            System.out.printf("%d %c %d = %s", a, operation, b, result);
        } else {
            System.out.printf("Одно или несколько чисел не являются натуральными, результат: %s", result);
        }
    }
}
