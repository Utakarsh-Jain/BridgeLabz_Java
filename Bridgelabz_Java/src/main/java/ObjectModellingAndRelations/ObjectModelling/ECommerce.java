/*
Problem 4 
E-commerce Platform with Orders, Customers, and Products
Description: Design an e-commerce platform with Order, Customer, and Product classes. Model relationships where a Customer places an Order, and each Order contains multiple Product objects.
Goal: Show communication and object relationships by designing a system where customers communicate through orders, and orders aggregate products.
Name: Utakarsh Jain
Date : 2/10/26

*/

import java.util.ArrayList;
class Orders {
    private int orderId;
    private ArrayList<Product> products;
    private double totalPrice;
    public Orders(int orderId) { //Parameterized Constructor
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }
    public void addProduct(Product product) { //Method to add the product
        products.add(product);
        totalPrice += product.getPrice(); //Method to get the price of the product
    }
    public void displayOrder() { //Method to display the details of the order
        System.out.println("Order ID: " + orderId);
        for (Product product : products) { //Method to display the details of the product
            product.display();
        }
        System.out.println("Total Price: " + totalPrice);
    }
}
class Customer {
    private String name;
    private ArrayList<Orders> orders;
    public Customer(String name) { //Parameterized Constructor
        this.name = name;
        this.orders = new ArrayList<>();
    }
    public void addOrder(Orders order) { //Method to add the order
        orders.add(order);
    }
    public void displayOrders() { //Method to display the details of the order
        System.out.println("Customer: " + name);
        for (Orders order : orders) { //Method to display the details of the order
            order.displayOrder();
        }
    }
}
class Product {
    private String name;
    private double price;
    public Product(String name, double price) { //Parameterized Constructor
        this.name = name;
        this.price = price;
    }
    public double getPrice() { //Method to get the price of the product
        return price;
    }
    public void display() { //Method to display the details of the product
        System.out.println("Product: " + name + " - Price: " + price);
    }
}
public class ECommerce {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Rahul");
        Customer customer2 = new Customer("Aman");
        Orders order1 = new Orders(101);
        Orders order2 = new Orders(102);
        Product product1 = new Product("Laptop", 50000);
        Product product2 = new Product("Mouse", 500);
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product2);
        customer1.addOrder(order1);
        customer2.addOrder(order2);
        System.out.println();
        customer1.displayOrders();
        System.out.println();
        customer2.displayOrders();
    }
}