package Assignment3.Memento;

/**
 Класс для восстановления и хранения
 */
public class Caretaker {

    private TextMemento memento;

    public void save(TextEditor editor) {
        memento = editor.save();
    }

    public void restore(TextEditor editor) {
        if (memento != null) {
            editor.restore(memento);
        } else {
            System.out.println("No saved states!");
        }
    }

}
