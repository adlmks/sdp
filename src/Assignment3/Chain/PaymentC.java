package Assignment3.Chain;

/**
 Класс PaymentC обрабатывает платежи до 300$
 */
public class PaymentC extends PaymentHandler{
    private float dollars = 1000;

    @Override
    public boolean handle(float money) {
        if (dollars >= money) {
            System.out.println("Payment C: You have enough money!");
            dollars -= money;
            return true;
        }
        System.out.println("Payment C: You don't have enough money!");
        if (next == null) return false;
        return next.handle(money);
    }

}
