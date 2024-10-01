// Интерфейс для различных видов молока
interface Milk {
    // Метод для получения типа молока
    String getMilk();
}

// Класс представляющий Whole Milk
class WholeMilk implements Milk {
    @Override
    public String getMilk() {
        return "Whole Milk"; // Возвращает название типа молока
    }
}

// Класс представляющий Almond Milk
class AlmondMilk implements Milk {
    @Override
    public String getMilk() {
        return "Almond Milk"; // Возвращает название типа молока
    }
}

// Интерфейс для различных видов сиропов
interface Syrup {
    // Метод для получения типа сиропа
    String getSyrup();
}

// Класс, представляющий ванильный сироп (Vanilla Syrup)
class VanillaSyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Vanilla Syrup"; // Возвращает название типа сиропа
    }
}

// Класс, представляющий карамельный сироп (Caramel Syrup)
class CaramelSyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Caramel Syrup"; // Возвращает название типа сиропа
    }
}

// Интерфейс для создания ингредиентов (молока и сиропа) для различных видов кофе
interface CoffeeIngredientsFactory {
    // Метод для создания молока
    Milk createMilk();

    // Метод для создания сиропа
    Syrup createSyrup();
}

// Конкретная фабрика ингредиентов для Латте (Latte)
class LatteIngredientsFactory implements CoffeeIngredientsFactory {
    @Override
    public Milk createMilk() {
        return new WholeMilk(); // Латте обычно используется с цельным молоком
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup(); // Латте может быть с ванильным сиропом
    }
}

// Конкретная фабрика ингредиентов для Капучино (Cappuccino)
class CappuccinoIngredientsFactory implements CoffeeIngredientsFactory {
    @Override
    public Milk createMilk() {
        return new AlmondMilk(); // В капучино можно использовать миндальное молоко
    }

    @Override
    public Syrup createSyrup() {
        return new CaramelSyrup(); // Капучино можно приготовить с карамельным сиропом
    }
}
