public abstract class Shape {
    double dim1, dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract void area();
}
class Triangle extends Shape {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Triangle: " + result);
    }
}
class Circle extends Shape {

    public Circle(double r) {
        super(r, r);
    }
    @Override
    void area() {
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle: " + result);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s;
        s = new Triangle(10, 20);
        s.area();
        s = new Circle(10);
        s.area();
    }
}
