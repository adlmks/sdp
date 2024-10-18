package BehavioralPatterns2.Observer;

import java.util.ArrayList;
import java.util.List;

// Класс NewsPublisherImpl реализует интерфейс NewsPublisher и управляет подписчиками
public class NewsPublisherImpl implements NewsPublisher {

    // Список подписчиков (наблюдателей), которые будут получать уведомления
    private List<Observer> observers = new ArrayList<>();

    // Метод для добавления нового подписчика в список
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);  // Добавляем наблюдателя в список
    }

    // Метод для удаления подписчика из списка
    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);  // Удаляем наблюдателя из списка
    }

    // Метод для публикации новостей в заданной категории и уведомления подписчиков
    @Override
    public void publishNews(String category, String news) {
        for (Observer observer : observers) {
            // Уведомляем каждого подписчика, вызывая метод update
            observer.update(category, news);
        }
    }
}
