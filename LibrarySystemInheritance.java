class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Ebook extends Book {
    double fileSize; // in MB

    Ebook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
    }
}

class PrintedBook extends Book {
    int pageCount;

    PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count: " + pageCount);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Ebook e = new Ebook("Java Basics", "John Smith", 2.5);
        PrintedBook p = new PrintedBook("C Programming", "Dennis Ritchie", 320);

        System.out.println("Ebook Info:");
        e.displayInfo();

        System.out.println("\nPrinted Book Info:");
        p.displayInfo();
    }
}
