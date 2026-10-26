
/*
Program 9: Decorator Design Pattern

Purpose:
Decorator Pattern adds extra functionality to an object
without modifying its original class.
Here, milk and sugar are added to coffee.
*/

// Common interface for all types of coffee
interface Coffee {
    double getCost();

    String getDescription();
}

// Basic coffee without additional ingredients
class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 50.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}

// Base decorator wraps an existing Coffee object
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

// Decorator adds milk to the existing coffee
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        // Add milk cost to the original coffee cost
        return coffee.getCost() + 10.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}

// Decorator adds sugar to the existing coffee
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        // Add sugar cost to the wrapped coffee cost
        return coffee.getCost() + 5.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        // Create basic coffee
        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getDescription());
        System.out.println("Cost: Rs. " + coffee.getCost());

        // Wrap coffee with milk and then sugar
        Coffee specialCoffee =
                new SugarDecorator(new MilkDecorator(coffee));

        System.out.println(specialCoffee.getDescription());
        System.out.println("Cost: Rs. " + specialCoffee.getCost());
    }
}
