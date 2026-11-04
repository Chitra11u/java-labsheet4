class Fibonacci {
    static int seriesCount = 0;

    void displayTerms(int n) {
        int localN = n;
        int t1 = 0, t2 = 1;
        seriesCount++;
        System.out.print("Fibonacci Series (Count " + seriesCount + "): ");
        for (int i = 1; i <= localN; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }
}

public class Labsheet4Q24 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.displayTerms(5);
    }
}
