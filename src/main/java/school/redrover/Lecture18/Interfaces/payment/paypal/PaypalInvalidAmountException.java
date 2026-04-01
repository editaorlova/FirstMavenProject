package school.redrover.Lecture18.Interfaces.payment.paypal;

public class PaypalInvalidAmountException extends  RuntimeException{
    public PaypalInvalidAmountException(String message) {
        super(message);
    }

}
