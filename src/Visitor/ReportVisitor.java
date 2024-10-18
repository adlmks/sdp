package BehavioralPatterns2.Visitor;


public class ReportVisitor implements Visitor {

    // Метод visit для работы с текстовыми файлами.
    // Здесь создается отчет для текстового файла.
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file...");
    }

    // Метод visit для работы с исполняемыми файлами.
    // Здесь создается отчет для исполняемого файла.
    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file...");
    }
}
