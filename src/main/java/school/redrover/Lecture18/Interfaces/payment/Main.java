package school.redrover.Lecture18.Interfaces.payment;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        try {
            creditCardPayment.pay(100);
            throw new IllegalAccessException("xxx");
        } catch (LimitExceededException e) {
            System.out.println("Too expensive: " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println("Can't pay this amount: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}
