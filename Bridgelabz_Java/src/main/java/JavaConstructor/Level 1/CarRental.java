/*
Problem 6 : Java Constructor Level 1
Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
Name: Utakarsh Jain
Date: 30/09/2026
*/

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;
    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) { // Parameterized Constructor
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = dailyRate * rentalDays;
    }
    void display() { // Method to display the rental details
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }
    public static void main(String args[]) { // Main method
        CarRental rental1 = new CarRental("Utakarsh", "Toyota Camry", 5, 50.0); // Creates a rental with parameterized values
        rental1.display();
    }
}
