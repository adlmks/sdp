package Assignment3.Command;

/**
 Класс Command для переключения на предыдущий канал
 */
public class PreviousChannelCommand implements Command {
    private Television television;

    public PreviousChannelCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.prevChannel();
    }
}
