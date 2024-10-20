package Assignment4.strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double amount) {
        return amount + (amount * 0.02); // 2% fee
    }
}
