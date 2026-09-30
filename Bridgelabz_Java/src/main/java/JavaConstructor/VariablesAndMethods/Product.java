package main.java.JavaConstructor.VariablesAndMethods;

/*
Problem 1 : Variables and Methods
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
Name : Utakarsh Jain
Date : 30/09/2026

*/

import java.util.Scanner;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;
    Product(String productName, double price) { // Parameterized Constructor
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    void displayProductDetails() { // Instance method to display the details of a product
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
    static void displayTotalProducts() { // Class method to display the total number of products created
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String args[]) { // Main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products");
        int n = sc.nextInt();
        Product products[] = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the product name");
            String productName = sc.next();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            products[i] = new Product(productName, price);
        }
        for (int i = 0; i < n; i++) {
            products[i].displayProductDetails();
        }
        Product.displayTotalProducts();
        sc.close();
    }
}