package Assignment3.Chain;

// Класс для обработки платежей через способ B
public class PaymentB extends PaymentHandler {
    private int balance = 300;

    @Override
    public boolean pay(int amount) {
        if (balance >= amount) {
            System.out.println("Payment B processed: " + amount);
            return true;
        } else if (next != null) {
            return next.pay(amount);
        }
        return false;
    }
}
