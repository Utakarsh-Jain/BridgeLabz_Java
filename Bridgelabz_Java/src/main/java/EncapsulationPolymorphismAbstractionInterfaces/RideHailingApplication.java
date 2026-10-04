/*

Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
Name : Utakarsh Jain
Date : 3/10/2026

*/

package main.java.EncapsulationPolymorphismAbstractionInterfaces;
import java.util.ArrayList;

// Interface defines GPS-related behavior
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Abstract class provides common vehicle and driver details
abstract class Vehicle implements GPS {
    // Encapsulation protects driver and vehicle information
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        setRatePerKm(ratePerKm);
        this.currentLocation = "Not Available";
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Validation prevents negative rate
    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm >= 0) {
            this.ratePerKm = ratePerKm;
        }
    }

    // Fare calculation differs for each vehicle type
    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        if (location != null && !location.isEmpty()) {
            currentLocation = location;
        }
    }
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 30;
    }
}

public class RideHailingApplication {
    // Parent reference allows dynamic fare calculation
    public static void calculateFares(
            ArrayList<Vehicle> vehicles,
            double distance) {

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();

            // Runtime polymorphism calls correct fare method
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: Rs. " + vehicle.calculateFare(distance));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Parent reference stores different vehicle types
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car =
                new Car("CAR101", "Rahul", 20);

        Bike bike =
                new Bike("BIKE101", "Aman", 10);

        Auto auto =
                new Auto("AUTO101", "Ravi", 15);

        car.updateLocation("Chennai Central");
        bike.updateLocation("T Nagar");
        auto.updateLocation("Anna Nagar");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        calculateFares(vehicles, 10);
    }
}
