package Assignment3.Command;

/**
 Класс для выключения телевизора
 */
public class TurnOffCommand implements Command {
    private Television television;

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.turnOff();
    }
}
