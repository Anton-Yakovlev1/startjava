public class Calculator {
    private double result = 0;
    private int a;
    private int b;
    private char operation;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setOperation(char operation) {
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/' ||
                operation == '%' || operation == '^') {
            this.operation = operation;
        } else {
            System.out.println("Ошибка: операция " + operation + " не поддерживается");
        }
    }

    public double getResult() {
        return result;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0 && operation == '/') {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    result = 0;
                } else {
                    result = (double) a / b;
                }
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= Math.abs(b); i++) {
                    result *= a;
                }
                if (b >= 0) {
                    result = result;
                } else {
                    result = 1 / result;
                }
                break;
        }
    }
}