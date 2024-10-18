package BehavioralPatterns2.Observer;

// Класс NewsSubscriberSmartphone реализует интерфейс Observer
// Этот класс представляет конкретного наблюдателя - подписчика на новости для смартфона
public class NewsSubscriberSmartphone implements Observer {

    // Метод update вызывается для обновления состояния подписчика с новыми новостями
    @Override
    public void update(String category, String news) {
        // Проверяем, что категория новости - "Sports" (Спорт)
        if (category.equals("Sports")) {
            // Если категория соответствует, выводим новость на экран
            System.out.println("Smartphone: " + news);
        }
    }
}
