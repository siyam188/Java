abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2]; 
        shapes[0] = new Rectangle(10, 20);
        shapes[1] = new Triangle(10, 20);

        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}
