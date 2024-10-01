interface Milk {
    String getMilk();
}

class WholeMilk implements Milk {
    @Override
    public String getMilk() {
        return "Whole Milk";
    }
}

class AlmondMilk implements Milk {
    @Override
    public String getMilk() {
        return "Almond Milk";
    }
}

interface Syrup {
    String getSyrup();
}

class VanillaSyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Vanilla Syrup";
    }
}

class CaramelSyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Caramel Syrup";
    }
}

interface CoffeeIngredientsFactory {
    Milk createMilk();
    Syrup createSyrup();
}

class LatteIngredientsFactory implements CoffeeIngredientsFactory {
    @Override
    public Milk createMilk() {
        return new WholeMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}

class CappuccinoIngredientsFactory implements CoffeeIngredientsFactory {
    @Override
    public Milk createMilk() {
        return new AlmondMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new CaramelSyrup();
    }
}
