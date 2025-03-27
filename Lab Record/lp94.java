// 94.	Create a program to demonstrate the Factory design pattern.
// Step 1: Create an interface
interface Shape {
    void draw();
}

// Step 2: Implement concrete classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Step 3: Create a Factory class
class ShapeFactory {
    // Factory method to return object of a specific shape
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("CIRCLE")) return new Circle();
        else if (type.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        else throw new IllegalArgumentException("Unknown shape type");
    }
}

// Step 4: Client code using the Factory
public class lp94 {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw(); // Output: Drawing a Circle

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw(); // Output: Drawing a Rectangle
    }
}
