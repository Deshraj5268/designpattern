package behavioral.strategy.paymentprocessing;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
        return true;
    }
}
