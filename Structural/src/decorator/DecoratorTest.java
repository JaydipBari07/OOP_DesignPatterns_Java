package decorator;

abstract class Coffee {
    public abstract double getCost();
}

class SimpleCoffee extends Coffee {
    @Override
    public double getCost() {
        return 1.1;
    }
}

abstract class CoffeeDecorator extends Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    // Implement the Milk decorator
    public double getCost() {
        return 0.5 + decoratedCoffee.getCost();
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    // Implement the Sugar decorator
    public double getCost() {
        return 0.2 + decoratedCoffee.getCost();
    }
}

class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }
    // Implement the Cream decorator
    public double getCost() {
        return 0.7 + decoratedCoffee.getCost();
    }
}


public class DecoratorTest {

    public static void main(String[] args) {
        Coffee coffee = new CreamDecorator(new MilkDecorator(new SugarDecorator(new SimpleCoffee())));
        System.out.println(coffee.getCost());
    }

}
