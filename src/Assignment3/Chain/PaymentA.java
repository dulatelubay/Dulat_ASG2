package Assignment3.Chain;

// Класс для обработки платежей через способ A
public class PaymentA extends PaymentHandler {
    private int balance = 100;

    @Override
    public boolean pay(int amount) {
        if (balance >= amount) {
            System.out.println("Payment A processed: " + amount);
            return true;
        } else if (next != null) {
            return next.pay(amount);
        }
        return false;
    }
}
