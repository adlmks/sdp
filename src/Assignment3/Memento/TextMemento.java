package Assignment3.Memento;

/**
 Класс TextMemeto хранит текст редактора и предоставляет доступ к нему.
 */
public class TextMemento {

    private final String text;

    public TextMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
