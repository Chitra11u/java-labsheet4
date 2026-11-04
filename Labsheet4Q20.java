class BankAccount {
    double balance;
    static String bankCode = "BK001";

    void withdraw(double b, double amount) {
        double localBalance = b;
        double localAmount = amount;
        this.balance = localBalance;
        if (localAmount <= this.balance) {
            this.balance -= localAmount;
            System.out.println("Bank Code: " + bankCode + ", Withdrawal successful. Remaining Balance: " + this.balance);
        } else {
            System.out.println("Bank Code: " + bankCode + ", Error: Withdrawal amount exceeds balance.");
        }
    }
}

public class Labsheet4Q20 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.withdraw(1000.0, 400.0);
    }
}
