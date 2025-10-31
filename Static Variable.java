public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Siyam", 101);
        s1.display();
    }
}

class Student {
    String name;
    int id;
    static String universityName = "uu";

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.print("Name: " + name);
        System.out.print(" ID: " + id);
    }
}
