package BehavioralPatterns2.Visitor;


public class AntivirusVisitor implements Visitor {

    // Метод visit для обработки текстового файла.
    // Здесь выполняется сканирование текстового файла на наличие запрещенных слов.
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for forbidden words...");
    }

    // Метод visit для обработки исполняемого файла.
    // Здесь выполняется сканирование исполняемого файла на наличие вредоносного кода.
    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code...");
    }
}
