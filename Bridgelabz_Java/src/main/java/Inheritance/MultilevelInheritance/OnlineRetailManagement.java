/*

Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
Name: Utakarsh Jain
Date : 3/10/2026

*/

package main.java.Inheritance.MultilevelInheritance;
class Order{ //Base class
    int orderId;
    String orderDate;
    Order(int orderId , String orderDate){ //Parameterized constructor for Order
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    void displayDetails(){ //Method to display Order details
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}
class ShippedOrder extends Order{ //Child class
    String trackingNumber;
    ShippedOrder(int orderId , String orderDate , String trackingNumber){ //Parameterized constructor for ShippedOrder
        super(orderId, orderDate); //call to the parent class
        this.trackingNumber = trackingNumber;
    }
    void displayDetails(){ //Method to display ShippedOrder details
        super.displayDetails(); //call to the parent class method
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{ //Grandchild class
    String deliveryDate;
    DeliveredOrder(int orderId , String orderDate , String trackingNumber , String deliveryDate){ //Parameterized constructor for DeliveredOrder
        super(orderId, orderDate, trackingNumber); //call to the parent class
        this.deliveryDate = deliveryDate;
    }
    void displayDetails(){ //Method to display DeliveredOrder details
        super.displayDetails(); //call to the parent class method
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineRetailManagement { //Main class for execution
    public static void main(String[] args) { //Main method
        DeliveredOrder deliveredOrder = new DeliveredOrder(1, "2024-01-01", "123456", "2024-01-02"); //Creating an object of DeliveredOrder class
        deliveredOrder.displayDetails(); //Displaying the order details
    }
}
