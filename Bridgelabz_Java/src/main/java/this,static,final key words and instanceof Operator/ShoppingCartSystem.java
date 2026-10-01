/*

Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.
Name : Utakarsh Jain
Date : 30/09/2026

*/

import java.util.*;
class Product { 
    static double discount;
    final int productID;
    String productName;
    int quantity;
    double price;

    Product (int productID, String productName, int quantity, double price) { //Parameterized Constructor
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    static void updateDiscount(double discount) { //Updating the discount percentage
        Product.discount = discount;
    }
    void displayDetails() { //Displaying the product details
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    double calcualteTotal() { //Calculating the total amount
        double total = quantity * price;
        double discountAmount = total * discount / 100;
        return total - discountAmount;
    }
}
public class ShoppingCartSystem {
    public static void main(String args[]) { //Main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Discount:");
        double discount = sc.nextDouble();
        Product.updateDiscount(discount);
        System.out.println("Enter Product Details:");
        System.out.print("Enter Product ID:");
        int productID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name:");
        String productName = sc.nextLine();
        System.out.print("Enter Quantity:");
        int quantity = sc.nextInt();
        System.out.print("Enter Price:");
        double price = sc.nextDouble();
        Product p1 = new Product(productID, productName, quantity, price); //passing the values of the variables to the parameterized constructor
        if (p1 instanceof Product) { //Checking if the object is an instance of Product class
            System.out.println("\nProduct Details:");
            p1.displayDetails();
            System.out.println("Total Amount: " + p1.calcualteTotal());
        }
        sc.close();
    }
}