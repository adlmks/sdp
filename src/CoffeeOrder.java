// Prototype: Клонирование заказа
class CoffeeOrder implements Cloneable {
    // Поля для хранения данных о кофе, молоке и сиропе
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    // Конструктор, принимающий конкретный кофе, молоко и сироп
    public CoffeeOrder(Coffee coffee, Milk milk, Syrup syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    // Метод клонирования заказа
    @Override
    protected CoffeeOrder clone() throws CloneNotSupportedException {
        return (CoffeeOrder) super.clone();
    }

    // Метод для отображения информации о заказе
    public void displayOrder() {
        // Вывод информации о заказе
        System.out.println("Order: " + coffee.getName() + " with " + milk.getMilk() + " and " + syrup.getSyrup());
    }
}
