package Assignment4.strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double amount) {
        return amount + 300; // 300 fee for delivery
    }
}
