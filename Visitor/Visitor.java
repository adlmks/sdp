package BehavioralPatterns2.Visitor;

public interface Visitor {
    // Метод visit для работы с текстовыми файлами.
    void visit(TextFile textFile);

    // Метод visit для работы с исполняемыми файлами.
    void visit(ExecutableFile executableFile);
}
