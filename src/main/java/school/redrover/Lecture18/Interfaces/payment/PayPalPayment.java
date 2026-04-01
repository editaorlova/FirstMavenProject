package school.redrover.Lecture18.Interfaces.payment;

import school.redrover.Lecture18.Interfaces.payment.paypal.MandatoryPayment;
import school.redrover.Lecture18.Interfaces.payment.paypal.PaypalInvalidAmountException;

public class PayPalPayment extends MandatoryPayment implements Payment {

    @Override
    public void pay(double amount) {
        try {
            payViaPayPal(amount);
        } catch (PaypalInvalidAmountException e) {
            throw new InvalidAmountException(e.getMessage());
        }
    }

}
