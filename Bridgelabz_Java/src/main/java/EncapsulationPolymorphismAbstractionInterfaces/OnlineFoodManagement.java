/*
Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.
Name : Utakarsh Jain
Date: 3/10/2026

*/

package main.java.EncapsulationPolymorphismAbstractionInterfaces;
import java.util.ArrayList;

// Interface defines discount-related behavior
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract class provides common food item properties
abstract class FoodItem {
    // Encapsulation protects order details
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if (itemName != null && !itemName.isEmpty()) {
            this.itemName = itemName;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // Validation prevents invalid price
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        // Validation prevents invalid quantity
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    // Total price differs according to food type
    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Additional charge for non-veg items
        double additionalCharge = 50 * getQuantity();
        return (getPrice() * getQuantity()) + additionalCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}

public class OnlineFoodManagement {
    // Polymorphic method processes different food item types
    public static void processOrder(ArrayList<FoodItem> items) {
        double total = 0;

        for (FoodItem item : items) {
            item.getItemDetails();

            double itemTotal = item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                double discount = discountableItem.applyDiscount();
                itemTotal -= discount;

                System.out.println(discountableItem.getDiscountDetails());
                System.out.println("Discount: " + discount);
            }

            System.out.println("Final Item Price: " + itemTotal);
            System.out.println();

            total += itemTotal;
        }

        System.out.println("Total Order Price: " + total);
    }

    public static void main(String[] args) {
        // Parent reference stores different food item objects
        ArrayList<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Pizza", 300, 2));
        order.add(new NonVegItem("Chicken Burger", 250, 2));

        processOrder(order);
    }
}
