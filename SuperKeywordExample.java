class Person {
    String name = "Unknown";

    void display() {
        System.out.println("Person Name: " + name);
    }
}

class Student extends Person {
    String name = "Siyam";

    @Override
    void display() {
        super.display();  
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
