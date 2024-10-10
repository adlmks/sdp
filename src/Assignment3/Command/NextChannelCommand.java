package Assignment3.Command;

/**
 Класс Command предназначен для переключения телевизора на следующий канал
 */
public class NextChannelCommand implements Command {
    private Television television;

    public NextChannelCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.nextChannel();
    }
}
