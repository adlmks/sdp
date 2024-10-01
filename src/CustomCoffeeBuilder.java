// Builder: Создание кастомного кофе
class CustomCoffeeBuilder {
    // Поля для хранения данных о кофе, молоке и сиропе
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    // Метод для установки конкретного типа кофе
    public CustomCoffeeBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    // Метод для установки конкретного типа молока
    public CustomCoffeeBuilder setMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    // Метод для установки конкретного типа сиропа
    public CustomCoffeeBuilder setSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    // Метод для создания и возвращения объекта CoffeeOrder
    public CoffeeOrder build() {
        // Создаем новый заказ кофе c выбранными ингредиентами
        return new CoffeeOrder(coffee, milk, syrup);
    }
}
