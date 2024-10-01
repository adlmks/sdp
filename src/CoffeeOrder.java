class CoffeeOrder implements Cloneable {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeOrder(Coffee coffee, Milk milk, Syrup syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    @Override
    protected CoffeeOrder clone() throws CloneNotSupportedException {
        return (CoffeeOrder) super.clone();
    }

    public void displayOrder() {
        System.out.println("Order: " + coffee.getName() + " with " + milk.getMilk() + " and " + syrup.getSyrup());
    }
}
