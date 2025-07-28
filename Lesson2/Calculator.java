public class Calculator {
    private double result = 0;
    private int a;
    private int b;
    private char operation;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setOperation(char operation) {
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/' ||
                operation == '%' || operation == '^') {
            this.operation = operation;
        } else {
            System.out.println("Ошибка: операция " + operation + " не поддерживается");
        }
    }

    public char getOperation() {
        return operation;
    }

    public double getResult() {
        return result;
    }

    public void startCalculation() {
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
                result = (double) a / b; 
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                if (b >= 0) {
                    result = 1;
                    for (int i = 1; i <= b; i++) {
                        result *= a;
                    }
                } else {
                    result = 1;
                    for (int i = -1; i >= b; i--) {
                        result *= a;
                    }
                    result = 1 / result;
                }
                break;
        }
    }
}