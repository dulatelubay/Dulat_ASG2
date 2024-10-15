package Assignment3.Chain;

// Класс для обработки платежей через способ C
public class PaymentC extends PaymentHandler {
    private int balance = 1000;

    @Override
    public boolean pay(int amount) {
        if (balance >= amount) {
            System.out.println("Payment C processed: " + amount);
            return true;
        } else if (next != null) {
            return next.pay(amount);
        }
        return false;
    }
}
