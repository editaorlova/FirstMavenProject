package school.redrover.Lecture18;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundExceprion {
        if (amount > balance) {
            throw new InsufficientFundExceprion("Don't have anough to cover " + amount);
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
