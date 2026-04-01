package school.redrover.Lecture18.Interfaces.payment;

public class CashPayment implements Payment{

    @Override
    public void pay(double amount) {
        if (amount < 0) {
            throw new InvalidAmountException("Amount must be positive");
        }
        System.out.println("Paid $" + amount + " using Cash");
    }
}
