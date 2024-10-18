package BehavioralPatterns2.State;

// Класс PausedState представляет состояние "Приостановлено" для плеера.
// Этот класс реализует интерфейс PlayerState и определяет действия, которые можно выполнить, когда плеер находится в состоянии паузы.
public class PausedState implements PlayerState {

    // Метод play() возобновляет воспроизведение.
    // Когда вызывается play(), состояние плеера меняется на PlayingState.
    @Override
    public void play(Player player) {
        System.out.println("Resuming playback");
        player.setState(new PlayingState()); // Меняем состояние на "Воспроизведение"
    }

    // Метод pause() сообщает, что плеер уже находится в состоянии паузы.
    // В данном случае никаких изменений не происходит.
    @Override
    public void pause(Player player) {
        System.out.println("Already paused");
    }

    // Метод stop() останавливает воспроизведение и меняет состояние на StoppedState.
    @Override
    public void stop(Player player) {
        System.out.println("Stopping");
        player.setState(new StoppedState()); // Меняем состояние на "Остановлено"
    }
}
