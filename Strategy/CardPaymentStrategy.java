package BehavioralPatterns2.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {

    // Метод calculateTotal() вычисляет итоговую сумму с учетом комиссии 2%.
    @Override
    public double calculateTotal(double orderAmount) {
        return orderAmount * 1.02;  // Увеличиваем сумму заказа на 2%.
    }
}
