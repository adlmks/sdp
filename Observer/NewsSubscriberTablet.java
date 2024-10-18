package BehavioralPatterns2.Observer;

// Класс NewsSubscriberTablet реализует интерфейс Observer
// Этот класс представляет конкретного наблюдателя - подписчика на новости для планшета
public class NewsSubscriberTablet implements Observer {

    // Метод update вызывается для обновления состояния подписчика с новыми новостями
    @Override
    public void update(String category, String news) {
        // Этот подписчик интересуется всеми новостями, независимо от категории
        // Поэтому он просто выводит новость на экран
        System.out.println("Tablet: " + news);
    }
}
