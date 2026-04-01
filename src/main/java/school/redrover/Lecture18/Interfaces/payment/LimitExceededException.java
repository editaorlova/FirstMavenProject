package school.redrover.Lecture18.Interfaces.payment;

public class LimitExceededException extends RuntimeException{
    public LimitExceededException(double amount, double limit) {
        super("Payment of " + amount + " exceeds limit of " + limit);
    }
}
