package BehavioralPatterns2.Template;

public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        // Выполняет проверку специфических характеристик для электронных товаров.
        System.out.println("Checking functionality and warranty...");
    }
}
