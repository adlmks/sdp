package Assignment3.Chain;

/**
 Класс PaymentB обрабатывает платежи до 300$
 */
public class PaymentB extends PaymentHandler{
    private float dollars = 300;

    @Override
    public boolean handle(float money) {
        if (dollars >= money) {
            System.out.println("Payment B: You have enough money!");
            dollars -= money;
            return true;
        }
        System.out.println("Payment B: You don't have enough money!");
        if (next == null) return false;
        return next.handle(money);
    }

}
