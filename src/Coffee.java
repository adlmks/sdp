abstract class Coffee {
    String name;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }
}

class Espresso extends Coffee {
    public Espresso() {
        name = "Espresso";
    }
}

class Latte extends Coffee {
    public Latte() {
        name = "Latte";
    }
}

class Cappuccino extends Coffee {
    public Cappuccino() {
        name = "Cappuccino";
    }
}

abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
}

class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}

class LatteFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}

class CappuccinoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}
