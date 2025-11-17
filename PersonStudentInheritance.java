class Person {
    public String name;
    public int age;

    void display1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    public int id;

    void display2() {
        display1(); 
        System.out.println("ID: " + id);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Siyam";
        s.age = 20;
        s.id = 101;

        s.display2();
    }
}
