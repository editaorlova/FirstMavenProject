package school.redrover.Lecture18.Interfaces.payment;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String message) {
        super(message);
    }
}
