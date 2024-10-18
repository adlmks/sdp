package BehavioralPatterns2.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {

    // Метод calculateTotal() вычисляет итоговую сумму, добавляя к заказу 300 единиц.
    @Override
    public double calculateTotal(double orderAmount) {
        return orderAmount + 300;  // Добавляем 300 единиц к общей сумме заказа.
    }
}
