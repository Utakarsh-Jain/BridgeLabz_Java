/*
E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
Name: Utakarsh Jain
Date: 3/10/2026

*/


package main.java.EncapsulationPolymorphismAbstractionInterfaces;
import java.util.ArrayList;

interface Taxable { //Interface
    double calculateTax(); //Method to calculate tax
    String getTaxDetails(); //Method to get tax details
}
abstract class Product { //Abstract class
    private int productId; //Instance variable for product ID
    private String name; //Instance variable for product name
    private double price; //Instance variable for product price

    public Product(int productId, String name, double price) { //Parameterized constructor for product
        this.productId = productId;
        this.name = name;
        setPrice(price);
    }

    public int getProductId() { //Getter method for product ID
        return productId;
    }

    public String getName() { //Getter method for product name
        return name;
    }

    public void setName(String name) { //Setter method for product name
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getPrice() { //Getter method for product price
        return price;
    }

    public void setPrice(double price) { //Setter method for product price
        if (price >= 0) {
            this.price = price;
        }
    }

    public abstract double calculateDiscount(); //Abstract method to calculate discount

    public void displayProduct() { //Method to display product details
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) { //Parameterized constructor for electronics
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() { //Method to calculate discount
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() { //Method to calculate tax
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() { //Method to get tax details
        return "Electronics Tax: 18%";
    }
}

class Clothing extends Product implements Taxable { //Clothing class

    public Clothing(int productId, String name, double price) { //Parameterized constructor for clothing
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() { //Method to calculate discount
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() { //Method to calculate tax
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() { //Method to get tax details
        return "Clothing Tax: 5%";
    }
}

class Groceries extends Product { //Groceries class

    public Groceries(int productId, String name, double price) { //Parameterized constructor for groceries
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() { //Method to calculate discount
        return getPrice() * 0.05;
    }
}

public class ECommerceSystem { //ECommerceSystem class

    public static double calculateFinalPrice(Product product) { //Method to calculate final price

        double discount = product.calculateDiscount(); //Calculate discount
        double tax = 0; //Initialize tax

        if (product instanceof Taxable) { //Check if product is taxable
            Taxable taxableProduct = (Taxable) product; //Cast to Taxable
            tax = taxableProduct.calculateTax(); //Calculate tax
        }

        return product.getPrice() + tax - discount; //Return final price
    }

    public static void ECommerce(String[] args) { //Main method

        ArrayList<Product> products = new ArrayList<>(); //Create ArrayList

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice", 1000));

        for (Product product : products) {

            product.displayProduct();

            double finalPrice = calculateFinalPrice(product);

            System.out.println("Discount: " + product.calculateDiscount());
            System.out.println("Final Price: " + finalPrice);

            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                System.out.println(taxableProduct.getTaxDetails());
            }

            System.out.println();
        }
    }
}
