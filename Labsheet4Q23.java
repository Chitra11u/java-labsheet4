class PrimeChecker {
    static int totalPrimeChecks = 0;

    void checkPrime(int num) {
        int localNum = num;
        boolean isPrime = true;
        if (localNum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(localNum); i++) {
                if (localNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        totalPrimeChecks++;
        if (isPrime) {
            System.out.println(localNum + " is prime. Total checks: " + totalPrimeChecks);
        } else {
            System.out.println(localNum + " is not prime. Total checks: " + totalPrimeChecks);
        }
    }
}

public class Labsheet4Q23 {
    public static void main(String[] args) {
        PrimeChecker pc = new PrimeChecker();
        pc.checkPrime(11);
    }
}
