package Assignment3.Memento;

public class Caretaker {
    private TextMemento memento;

    public void save(TextEditor editor) {
        memento = editor.save();
    }

    public void restore(TextEditor editor) {
        if (memento != null) {
            editor.restore(memento);
        }
    }
}