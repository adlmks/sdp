package BehavioralPatterns2.Strategy;

public interface PaymentStrategy {
    // Метод calculateTotal() принимает сумму заказа и возвращает итоговую сумму после применения стратегии.
    double calculateTotal(double orderAmount);
}
