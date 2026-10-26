
/*
Program 7: Bridge Design Pattern

Purpose:
Bridge Pattern separates abstraction from implementation.
Shapes and colors can be changed independently.
*/

// Implementation interface for colors
interface Color {
    void applyColor();
}

class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Red color");
    }
}

class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Blue color");
    }
}

// Abstraction maintains a reference to the Color implementation
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    // Each shape provides its own drawing implementation
    abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Circle: ");
        color.applyColor();
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Square: ");
        color.applyColor();
    }
}

public class BridgePattern {
    public static void main(String[] args) {
        // Combine a Circle with Red
        Shape circle = new Circle(new Red());

        // Combine a Square with Blue
        Shape square = new Square(new Blue());

        // Draw both shapes with their selected colors
        circle.draw();
        square.draw();
    }
}
