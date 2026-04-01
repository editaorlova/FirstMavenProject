package school.redrover.Lecture18.Interfaces;

import school.redrover.Lecture18.Interfaces.payment.CashPayment;
import school.redrover.Lecture18.Interfaces.payment.CreditCardPayment;
import school.redrover.Lecture18.Interfaces.payment.PayPalPayment;
import school.redrover.Lecture18.Interfaces.payment.Payment;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payment> payments = List.of(
                new CashPayment(),
                new CreditCardPayment()
        );

        for (Payment payment : payments) {
            payment.pay(20);
        }

        new PayPalPayment().pay(100);

        List<Payment> paymentSystems = List.of(new CashPayment(), new PayPalPayment());
    }
}
