
/*
Program 23: Visitor Design Pattern

Purpose:
Visitor Pattern adds new operations to existing object structures
without changing the classes of those objects.
Here, a visitor calculates the area of different shapes.
*/

// Element interface allows a visitor to operate on a shape
interface Shape {
    void accept(ShapeVisitor visitor);
}

// Visitor interface declares operations for each shape type
interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Rectangle rectangle);
}

// Circle stores its own data and accepts a visitor
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        // Dispatch this object to the circle-specific visitor method
        visitor.visit(this);
    }
}

// Rectangle stores its own data and accepts a visitor
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        // Dispatch this object to the rectangle-specific visitor method
        visitor.visit(this);
    }
}

// Concrete visitor implements the area calculation operations
class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        // Calculate circle area using pi * radius * radius
        double area = Math.PI * circle.getRadius() * circle.getRadius();

        System.out.printf("Circle area: %.2f%n", area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        // Calculate rectangle area using length * width
        double area = rectangle.getLength() * rectangle.getWidth();

        System.out.printf("Rectangle area: %.2f%n", area);
    }
}

public class VisitorPattern {
    public static void main(String[] args) {
        // Create different shape objects
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // Create a visitor that calculates areas
        ShapeVisitor visitor = new AreaCalculator();

        // Ask each shape to accept the visitor
        circle.accept(visitor);
        rectangle.accept(visitor);
    }
}
