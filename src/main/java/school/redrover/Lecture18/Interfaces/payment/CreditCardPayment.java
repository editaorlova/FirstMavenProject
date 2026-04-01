package school.redrover.Lecture18.Interfaces.payment;

public class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        if (amount < 0) {
            throw new InvalidAmountException("Amount must be positive");
        }
        if (amount > MAX_AMOUNT) {
            throw new LimitExceededException(amount, MAX_AMOUNT);
        }
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}
