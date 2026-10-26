
/*
Program 3: Abstract Factory Design Pattern

Purpose:
Abstract Factory creates families of related objects
without specifying their concrete classes.
*/

// Common interface for cars
interface Car {
    void drive();
}

// Common interface for bikes
interface Bike {
    void ride();
}

// Sports car implementation
class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Sedan");
    }
}

// Utility car implementation
class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving SUV");
    }
}

// Sports bike implementation
class SportsBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding Sports Bike");
    }
}

// Normal bike implementation
class NormalBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding Normal Bike");
    }
}

// Abstract factory declares methods to create related products
abstract class VehicleFactory {
    abstract Car createCar();

    abstract Bike createBike();
}

// Factory creates the sports vehicle family
class SportsVehicleFactory extends VehicleFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public Bike createBike() {
        return new SportsBike();
    }
}

// Factory creates the utility vehicle family
class UtilityVehicleFactory extends VehicleFactory {

    @Override
    public Car createCar() {
        return new SUV();
    }

    @Override
    public Bike createBike() {
        return new NormalBike();
    }
}

public class AbstractFactoryPattern {
    public static void main(String[] args) {

        // Create the sports vehicle family
        VehicleFactory sportsFactory = new SportsVehicleFactory();

        Car sportsCar = sportsFactory.createCar();
        Bike sportsBike = sportsFactory.createBike();

        sportsCar.drive();
        sportsBike.ride();

        // Create the utility vehicle family
        VehicleFactory utilityFactory = new UtilityVehicleFactory();

        Car utilityCar = utilityFactory.createCar();
        Bike normalBike = utilityFactory.createBike();

        utilityCar.drive();
        normalBike.ride();
    }
}
