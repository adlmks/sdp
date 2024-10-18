package BehavioralPatterns2.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        // Возвращает ту же сумму, что и переданную, так как оплата через кошелек не изменяет итоговую стоимость.
        return orderAmount;
    }
}
