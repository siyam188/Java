import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary amount is: " + salary);
        } else {
            System.out.println("Salary amount must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();  // nextLine() allows full name input
        e.setName(name);

        System.out.print("Enter salary amount: ");
        double sal = sc.nextDouble();
        e.setSalary(sal);

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());

        sc.close();
    }
}
