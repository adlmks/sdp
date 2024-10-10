package Assignment3.Command;

import java.util.HashMap;
import java.util.Map;

/**
 Класс RemoteControl, позволяет имитировать нажатие кнопок
 */
public class RemoteControl{
    private Map<String, Command> commands = new HashMap<>();

    public RemoteControl setCommand(String action, Command command) {
        commands.put(action, command);
        return this;
    }

    public RemoteControl buttonPressed(String action) {
        Command command = commands.get(action);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Unknown command");
        }
        return this;
    }
}
