package BehavioralPatterns2.Strategy;

public class Order {
    // Поле для хранения стратегии оплаты (например, картой, наличными при доставке и т.д.).
    private PaymentStrategy paymentStrategy;

    // Конструктор принимает стратегию оплаты в качестве аргумента и устанавливает её.
    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Метод processOrder() принимает сумму заказа и возвращает итоговую сумму, используя выбранную стратегию оплаты.
    public double processOrder(double orderAmount) {
        return paymentStrategy.calculateTotal(orderAmount);  // Рассчитываем итоговую сумму через стратегию оплаты.
    }
}
