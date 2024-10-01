// Singleton: Создание кофейни
public class CoffeeShop {
    private static CoffeeShop instance;

    private CoffeeShop() {}

    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    // Метод для приема заказа на кофе
    public void takeOrder(String coffeeType) {
        // Выводим сообщение о принятии заказа
        System.out.println("Order received for: " + coffeeType);
    }
}
