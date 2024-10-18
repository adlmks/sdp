package BehavioralPatterns2.Visitor;

public class ExecutableFile implements File {

    // Метод accept вызывает метод visit у переданного Visitor.
    // Этот метод позволяет передать текущий объект (ExecutableFile) в объект Visitor, который выполнит операцию с ним.
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
