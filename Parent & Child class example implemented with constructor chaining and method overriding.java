class Vehicle {
    String color;
    double weight;

    Vehicle(String c, double w) {
        color = c;
        weight = w;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}

class Car extends Vehicle {
    int gear;

    Car(String c, double w, int g) {
        super(c, w); // Calling Vehicle constructor
        gear = g;
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("Gear: " + gear);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("White", 1000, 5);
        c.display();

        System.out.println();

        Vehicle v = new Vehicle("Black", 1500);
        v.display();
    }
}
