public class Main {
    public static void main(String[] args) {
        // Singleton: Создание кофейни
        CoffeeShop coffeeShop = CoffeeShop.getInstance();
        coffeeShop.takeOrder("Latte");

        // Factory Method: Создание кофе с помощью фабрик
        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        latte.prepare();

        // Abstract Factory: Создание ингредиентов для кофе
        CoffeeIngredientsFactory latteIngredientsFactory = new LatteIngredientsFactory();
        Milk latteMilk = latteIngredientsFactory.createMilk();
        Syrup latteSyrup = latteIngredientsFactory.createSyrup();

        // Prototype: Клонирование заказа
        CoffeeOrder latteOrder = new CoffeeOrder(latte, latteMilk, latteSyrup);
        latteOrder.displayOrder();

        try {
            CoffeeOrder clonedLatteOrder = latteOrder.clone();
            clonedLatteOrder.displayOrder();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Builder: Создание кастомного кофе
        CustomCoffeeBuilder coffeeBuilder = new CustomCoffeeBuilder();
        CoffeeOrder customOrder = coffeeBuilder
                .setCoffee(new Cappuccino())
                .setMilk(new AlmondMilk())
                .setSyrup(new CaramelSyrup())
                .build();
        customOrder.displayOrder();
    }
}
