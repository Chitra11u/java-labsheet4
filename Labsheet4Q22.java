class Armstrong {
    static int totalChecks = 0;

    void checkArmstrong(int num) {
        int localNum = num;
        int original = localNum;
        int sum = 0;
        while (localNum > 0) {
            int digit = localNum % 10;
            sum += digit * digit * digit;
            localNum /= 10;
        }
        totalChecks++;
        if (sum == original) {
            System.out.println(original + " is an Armstrong number. Total checks: " + totalChecks);
        } else {
            System.out.println(original + " is not an Armstrong number. Total checks: " + totalChecks);
        }
    }
}

public class Labsheet4Q22 {
    public static void main(String[] args) {
        Armstrong arm = new Armstrong();
        arm.checkArmstrong(153);
    }
}
