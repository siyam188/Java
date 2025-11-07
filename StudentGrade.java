import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double mark;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getMark() {
        return mark;
    }

    public String calculateGrade() {
        if (mark >= 90) {
            return "A+";
        } else if (mark >= 80) {
            return "A";
        } else if (mark >= 70) {
            return "B";
        } else if (mark >= 60) {
            return "C";
        } else {
            return "F";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        s1.setName(name);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        s1.setId(id);

        System.out.print("Enter Student Mark: ");
        double mark = sc.nextDouble();
        s1.setMark(mark);

        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + s1.getName());
        System.out.println("ID    : " + s1.getId());
        System.out.println("Mark  : " + s1.getMark());
        System.out.println("Grade : " + s1.calculateGrade());

        sc.close();
    }
}
