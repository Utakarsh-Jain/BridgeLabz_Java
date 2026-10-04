/*

Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
Name: Utakarsh Jain
Date: 3/10/2026

*/

package main.java.EncapsulationPolymorphismAbstractionInterfaces;
import java.util.ArrayList;
// Interface defines insurance-related behavior
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
// Abstract class provides common vehicle properties
abstract class Vehicle {
    // Encapsulation using private fields
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        setRentalRate(rentalRate);
    }
    public String getVehicleNumber() { //Getter method for vehicle number
        return vehicleNumber;
    }
    public String getType() { //Getter method for vehicle type
        return type;
    }
    public double getRentalRate() { //Getter method for rental rate
        return rentalRate;
    }
    // Validation prevents negative rental rates
    public void setRentalRate(double rentalRate) { //Setter method for rental rate
        if (rentalRate >= 0) {
            this.rentalRate = rentalRate;
        }
    }
    // Each vehicle type calculates rental cost differently
    public abstract double calculateRentalCost(int days);
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}
class Car extends Vehicle implements Insurable { //Car class extending Vehicle and implementing Insurable
    public Car(String vehicleNumber, double rentalRate) { //Parameterized constructor for car
        super(vehicleNumber, "Car", rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) { //Method to calculate rental cost
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() { //Method to calculate insurance
        return 2000;
    }
    @Override
    public String getInsuranceDetails() { //Method to get insurance details
        return "Car Insurance: Rs. 2000";
    }
}
class Bike extends Vehicle implements Insurable { //Bike class extending Vehicle and implementing Insurable
    public Bike(String vehicleNumber, double rentalRate) { //Parameterized constructor for bike
        super(vehicleNumber, "Bike", rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) { //Method to calculate rental cost
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() { //Method to calculate insurance
        return 1000;
    }
    @Override
    public String getInsuranceDetails() { //Method to get insurance details
        return "Bike Insurance: Rs. 1000";
    }
}
class Truck extends Vehicle implements Insurable { //Truck class extending Vehicle and implementing Insurable
    public Truck(String vehicleNumber, double rentalRate) { //Parameterized constructor for truck
        super(vehicleNumber, "Truck", rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) { //Method to calculate rental cost
        return getRentalRate() * days + 500;
    }
    @Override
    public double calculateInsurance() { //Method to calculate insurance
        return 5000;
    }
    @Override
    public String getInsuranceDetails() { //Method to get insurance details
        return "Truck Insurance: Rs. 5000";
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        // Parent reference stores different vehicle types
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR101", 2000));
        vehicles.add(new Bike("BIKE101", 800));
        vehicles.add(new Truck("TRUCK101", 5000));

        int days = 3;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost: " + vehicle.calculateRentalCost(days));

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println("Insurance: " + insurableVehicle.calculateInsurance());
                System.out.println(insurableVehicle.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
