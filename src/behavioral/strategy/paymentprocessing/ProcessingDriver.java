package behavioral.strategy.paymentprocessing;

public class ProcessingDriver {

    public static void main(String[] args) {
        PaymentContext creditCardPayment = new PaymentContext(new CreditCardPayment());
        creditCardPayment.execute(1000);
    }
}
