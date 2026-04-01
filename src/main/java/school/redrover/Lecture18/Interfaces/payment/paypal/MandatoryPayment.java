package school.redrover.Lecture18.Interfaces.payment.paypal;

public abstract class MandatoryPayment {

    protected void payViaPayPal(double amount) {
        if (amount < 0) {
            throw new PaypalInvalidAmountException("Amount must be positive");
        }
        System.out.println("Sent " + amount + " to PayPal");
    }
}
