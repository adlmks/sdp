package Assignment3.Memento;


/**
 Класс TextEditor позволяет изменять текст и предоставляет
 функциональность для сохранения и восстановления своего состояния
 с использованием паттерна Memento.
 */
public class TextEditor {

    private StringBuilder currentText;

    public TextEditor() {
        currentText = new StringBuilder();
    }

    /**
     Добавляет новый текст к существующему
     */
    public void addText(String text) {
        currentText.append(text);
    }

    /**
     Отображает текущее содержимое редактора.
     */
    public void showText() {
        System.out.println("Current Text: " + currentText.toString());
    }

    public TextMemento save() {
        return new TextMemento(currentText.toString());
    }

    public void restore(TextMemento memento) {
        currentText = new StringBuilder(memento.getText());
    }

}
