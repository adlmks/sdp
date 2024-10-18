package BehavioralPatterns2.Observer;

public interface Observer {

    // Метод update будет вызываться для обновления состояния наблюдателя
    // при публикации новых новостей
    void update(String category, String news);
}
