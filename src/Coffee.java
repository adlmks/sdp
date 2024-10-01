// Factory Method: Создание кофе с помощью фабрик
abstract class Coffee {
    String name;

    // Метод для получения названия кофе
    public String getName() {
        return name;
    }

    // Метод для приготовления кофе, выводит сообщение о процессе
    public void prepare() {
        System.out.println("Preparing " + name);
    }
}

class Espresso extends Coffee {
    // Конструктор, устанавливающий название кофе
    public Espresso() {
        name = "Espresso";
    }
}

class Latte extends Coffee {
    // Конструктор, устанавливающий название кофе
    public Latte() {
        name = "Latte";
    }
}

class Cappuccino extends Coffee {
    // Конструктор, устанавливающий название кофе
    public Cappuccino() {
        name = "Cappuccino";
    }
}

abstract class CoffeeFactory {
    // Абстрактный метод для создания конкретного кофе
    public abstract Coffee createCoffee();
}

class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}

// Фабрика для создания Latte
class LatteFactory extends CoffeeFactory {
    // Реализация метода для создания объекта Latte
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}

// Фабрика для создания Cappuccino
class CappuccinoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}
