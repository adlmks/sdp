class CustomCoffeeBuilder {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CustomCoffeeBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public CustomCoffeeBuilder setMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    public CustomCoffeeBuilder setSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeOrder build() {
        return new CoffeeOrder(coffee, milk, syrup);
    }
}
