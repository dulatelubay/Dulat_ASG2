package Assignment4.strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double amount) {
        return amount; // No fee
    }
}
