package Assignment3.Chain;

// Интерфейс для обработки платежей
public abstract class PaymentHandler {
    protected PaymentHandler next;

    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    public abstract boolean pay(int amount);
}
