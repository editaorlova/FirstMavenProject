package school.redrover.Lecture18.Interfaces.payment;

public interface Payment {
    double MAX_AMOUNT = 1000;

    void pay(double amount);
}
