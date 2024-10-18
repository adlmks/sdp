package BehavioralPatterns2.Template;

public abstract class QualityCheck {

    // Основной метод check() выполняет последовательные этапы проверки.
    public void check() {
        checkAppearance(); // Шаг 1: Проверка внешнего вида.
        checkSpecificCharacteristics(); // Шаг 2: Проверка специфических характеристик (реализуется в дочерних классах).
        printReport(); // Шаг 3: Печать отчета.
    }

    // Метод проверки внешнего вида (реализован в базовом классе).
    private void checkAppearance() {
        System.out.println("Checking appearance...");
    }

    // Абстрактный метод для проверки специфических характеристик.
    // Этот метод должен быть реализован в дочерних классах.
    protected abstract void checkSpecificCharacteristics();

    // Метод печати отчета (реализован в базовом классе).
    private void printReport() {
        System.out.println("Printing report...");
    }
}
