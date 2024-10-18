package BehavioralPatterns2.State;

public interface PlayerState {
    // Метод для воспроизведения. Каждый класс состояния будет по-своему реализовывать это поведение.
    void play(Player player);

    // Метод для паузы. Каждый класс состояния будет по-своему реализовывать это поведение.
    void pause(Player player);

    // Метод для остановки. Каждый класс состояния будет по-своему реализовывать это поведение.
    void stop(Player player);
}
