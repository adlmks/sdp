package BehavioralPatterns2.State;

// Класс PlayingState реализует состояние "Играет" для плеера.
// В этом состоянии плеер воспроизводит контент и может быть поставлен на паузу или остановлен.
public class PlayingState implements PlayerState {

    // Метод play() в состоянии "Играет" просто выводит сообщение, что плеер уже воспроизводит контент.
    @Override
    public void play(Player player) {
        System.out.println("Already playing");
    }

    // Метод pause() переводит плеер в состояние "Пауза" и выводит сообщение о паузе.
    @Override
    public void pause(Player player) {
        System.out.println("Pausing");
        player.setState(new PausedState());  // Устанавливаем состояние в "Пауза".
    }

    // Метод stop() останавливает плеер и переводит его в состояние "Остановлено".
    @Override
    public void stop(Player player) {
        System.out.println("Stopping");
        player.setState(new StoppedState());  // Устанавливаем состояние в "Остановлено".
    }
}
