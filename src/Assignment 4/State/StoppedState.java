package BehavioralPatterns2.State;

// Класс StoppedState реализует состояние "Остановлено" для плеера.
// В этом состоянии плеер не воспроизводит контент, и его нельзя поставить на паузу.
public class StoppedState implements PlayerState {

    // Метод play() в состоянии "Остановлено" запускает воспроизведение с начала.
    @Override
    public void play(Player player) {
        System.out.println("Starting playback from the beginning");
        player.setState(new PlayingState());  // Устанавливаем состояние в "Играет".
    }

    // Метод pause() в состоянии "Остановлено" не может быть вызван, так как плеер не воспроизводит контент.
    @Override
    public void pause(Player player) {
        System.out.println("Can't pause, player is stopped");
    }

    // Метод stop() просто выводит сообщение, что плеер уже в состоянии "Остановлено".
    @Override
    public void stop(Player player) {
        System.out.println("Already stopped");
    }
}
