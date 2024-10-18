package BehavioralPatterns2.Template;

public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        // Выполняет проверку специфических характеристик для продуктов питания.
        System.out.println("Checking expiration date and ingredients...");
    }
}
