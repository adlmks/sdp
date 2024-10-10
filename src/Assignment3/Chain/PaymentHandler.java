package Assignment3.Chain;

/**
 PaymentHandler - абстрактный класс, определяет структуру для цепочки
 **/
public abstract class PaymentHandler {
    protected PaymentHandler next;
    public PaymentHandler setNext(PaymentHandler next) {
        this.next = next;
        return next;
    }


    public abstract boolean handle(float money);
}
