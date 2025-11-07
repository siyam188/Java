import java.util.Scanner;

class Area {
    private int length;
    private int breadth;

    // Setter methods
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Getter methods
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getResult() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a1 = new Area();

        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        a1.setLength(length);

        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();
        a1.setBreadth(breadth);

        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Length  : " + a1.getLength());
        System.out.println("Breadth : " + a1.getBreadth());
        System.out.println("Area    : " + a1.getResult());

        sc.close();
    }
}
