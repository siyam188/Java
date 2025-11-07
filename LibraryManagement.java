import java.util.Scanner;

class Library {
    private String title;
    private String author;
    private boolean isAvailable = true;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You've successfully borrowed \"" + title + "\"");
        } else {
            System.out.println("\"" + title + "\" was already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned \"" + title + "\"");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        System.out.print("Enter author name: ");
        String auth = sc.nextLine();
        l.setAuthor(auth);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        l.setTitle(title);

        System.out.println("Book added: \"" + l.getTitle() + "\" by " + l.getAuthor());
        System.out.println("Available: " + l.isAvailable());

        System.out.println("\nDo you want to borrow the book? (yes/no)");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            l.borrowBook();
        }

        System.out.println("\nDo you want to return the book? (yes/no)");
        choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            l.returnBook();
        }

        System.out.println("\nFinal Availability: " + l.isAvailable());
    }
}
