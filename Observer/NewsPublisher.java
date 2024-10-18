package BehavioralPatterns2.Observer;

// Интерфейс NewsPublisher, который представляет издателя новостей
public interface NewsPublisher {

    // Метод для подписки нового наблюдателя (подписчика)
    void subscribe(Observer observer);

    // Метод для отписки существующего наблюдателя (подписчика)
    void unsubscribe(Observer observer);

    // Метод для публикации новостей в определенной категории
    // и уведомления подписчиков, которые подписаны на эту категорию
    void publishNews(String category, String news);
}
