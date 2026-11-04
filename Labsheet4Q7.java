class BankAccount {
    String accountNumber;
    double balance;
    static String bankName = "National Bank";

    void deposit(String accNum, double amount) {
        String localAccNum = accNum;
        double localAmount = amount;
        this.accountNumber = localAccNum;
        this.balance += localAmount;
        System.out.println("Bank: " + bankName + ", Account: " + this.accountNumber + ", Deposited: " + localAmount + ", Balance: " + this.balance);
    }
}

class Labsheet4Q7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit("ACC123456", 500.0);
    }
}
