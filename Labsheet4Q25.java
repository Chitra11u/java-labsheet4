class Factorial {
    static int totalCalls = 0;

    void compute(int n) {
        int localN = n;
        long fact = 1;
        for (int i = 1; i <= localN; i++) {
            fact *= i;
        }
        totalCalls++;
        System.out.println("Factorial of " + localN + " is " + fact + ". Total calls: " + totalCalls);
    }
}

public class Labsheet4Q25 {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.compute(5);
    }
}
