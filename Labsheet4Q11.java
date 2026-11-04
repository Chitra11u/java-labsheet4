class Calculator {
    static int operationsCount = 0;

    void add(double a, double b) {
        double localA = a;
        double localB = b;
        double res = localA + localB;
        operationsCount++;
        System.out.println("Result: " + res + ", Operations Count: " + operationsCount);
    }

    void subtract(double a, double b) {
        double localA = a;
        double localB = b;
        double res = localA - localB;
        operationsCount++;
        System.out.println("Result: " + res + ", Operations Count: " + operationsCount);
    }

    void multiply(double a, double b) {
        double localA = a;
        double localB = b;
        double res = localA * localB;
        operationsCount++;
        System.out.println("Result: " + res + ", Operations Count: " + operationsCount);
    }

    void divide(double a, double b) {
        double localA = a;
        double localB = b;
        double res = localA / localB;
        operationsCount++;
        System.out.println("Result: " + res + ", Operations Count: " + operationsCount);
    }
}

public class Labsheet4Q11 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 5);
        calc.multiply(4, 3);
    }
}
