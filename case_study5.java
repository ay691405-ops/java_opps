import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean available;

    Book(int bookId, String title, String author, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        available = true;
        System.out.println("Book returned successfully.");
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }
}

public class case_study5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book ID: ");
        int id = sc.nextInt();

        System.out.print("Enter book title: ");
        String title = sc.next();

        System.out.print("Enter author: ");
        String author = sc.next();

        Book b = new Book(id, title, author, true);

        b.displayBook();

        System.out.println("\nIssuing book...");
        b.issueBook();

        System.out.println("Trying to issue again...");
        b.issueBook();

        System.out.println("\nReturning book...");
        b.returnBook();

        b.displayBook();

        sc.close();
    }
}
