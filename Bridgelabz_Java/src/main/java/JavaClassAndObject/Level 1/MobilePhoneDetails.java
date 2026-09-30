/*
Problem 5 : Java Class And Object Level 1
Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.
Name : Utakarsh Jain
Date : 29/09/2026

*/

import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;
    void displayDetails() { //Method to display the details of the phone
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class MobilePhoneDetails {
    public static void main(String args[]) {
        MobilePhone mobilePhone = new MobilePhone(); //Initializing the object of the class MobilePhone
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the brand of the phone: ");
        mobilePhone.brand = sc.nextLine();
        System.out.print("Enter the model of the phone: ");
        mobilePhone.model = sc.nextLine();
        System.out.print("Enter the price of the phone: ");
        mobilePhone.price = sc.nextDouble(); 
        mobilePhone.displayDetails(); //Calling the display method to print the details
        sc.close();
    }
}