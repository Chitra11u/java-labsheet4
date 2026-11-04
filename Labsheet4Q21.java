class Palindrome {
    static int countChecks = 0;

    void checkPalindrome(int num) {
        int localNum = num;
        int original = localNum;
        int reversed = 0;
        while (localNum > 0) {
            int digit = localNum % 10;
            reversed = reversed * 10 + digit;
            localNum /= 10;
        }
        countChecks++;
        if (original == reversed) {
            System.out.println(original + " is a palindrome. Total checks: " + countChecks);
        } else {
            System.out.println(original + " is not a palindrome. Total checks: " + countChecks);
        }
    }
}

public class Labsheet4Q21 {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.checkPalindrome(121);
    }
}
