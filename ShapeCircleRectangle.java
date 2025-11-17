class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    double area() {
        return 3.1416 * radius * radius;
    }
}

class Rectangle extends Shape {
    double h = 4, w = 6;

    @Override
    double area() {
        return h * w;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
    }
}
