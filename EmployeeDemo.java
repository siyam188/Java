class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee constructor called");
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);  // calling parent constructor
        this.department = department;
        System.out.println("Manager constructor called");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Manager m = new Manager("Siyam", 50000, "IT");
        m.displayInfo();
    }
}
