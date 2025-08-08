package behavioral.strategy.paymentprocessing;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public boolean execute(double amount){
        return paymentStrategy.pay(amount);
    }
}
