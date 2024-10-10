package Assignment3.Command;

/**
 Класс для увеличения звука
 */
public class VolumeUpCommand implements Command {
    private Television television;

    public VolumeUpCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.volumeUp();
    }
}
