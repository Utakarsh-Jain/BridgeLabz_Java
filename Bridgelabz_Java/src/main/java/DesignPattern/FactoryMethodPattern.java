
/*
Pattern 2: Factory Pattern
Purpose: Create objects through a factory.
*/

interface Shape { //interface
    void draw();
}

class Circle implements Shape {
    public void draw() { //draw method of circle
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {//draw method of rectangle
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) { //checking if the type is circle
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) { //checking if the type is rectangle
            return new Rectangle();
        }

        throw new IllegalArgumentException("Invalid shape type");
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        Shape shape2 = ShapeFactory.getShape("rectangle");

        shape1.draw();
        shape2.draw();
    }
}
