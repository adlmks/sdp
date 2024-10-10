package Assignment3.Chain;

/**
 Класс PaymentA Обрабатывает платежи до 100$
 **/
public class PaymentA extends PaymentHandler{
    private float dollars = 100;

    @Override
    public boolean handle(float money) {
        if (dollars >= money) {
            System.out.println("Payment A: You have enough money!");
            dollars -= money;
            return true;
        }
        System.out.println("Payment A: You don't have enough money!");
        if (next == null) return false;
        return next.handle(money);
    }
}