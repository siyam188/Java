class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Programmer extends Employee {
    String language;

    Programmer(String name, double salary, String lang) {
        super(name, salary);
        this.language = lang;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Language: " + language);
    }
}

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer("Rahim", 55000, "Java");
        p.display();
    }
}
