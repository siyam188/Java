interface Figure {
    void area();
}
class Rectangle implements Figure {
    double dim1, dim2;

    public Rectangle(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public void area() {
        double result = dim1 * dim2;
        System.out.println("Area of Rectangle: " + result);
    }
}
class Circle implements Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 20);
        r.area();

        Circle c = new Circle(10);
        c.area();
    }
}
