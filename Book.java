import java.util.*;

public class Book {

    int id;
    String title;
    String author;
    boolean available;

    Book(int idd, String titlee, String authore) {
        id = idd;
        title = titlee;
        author = authore;
        available = true;
    }

    void issueBook() {

        if (available == true) {

            available = false;
            System.out.println("Book issued successfully");

        } else {

            System.out.println("Book is already issued");
        }
    }

    void returnBook() {

        available = true;
        System.out.println("Book returned successfully");
    }

    void displayBook() {

        System.out.println("Book ID: " + id);
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);

        if (available == true) {
            System.out.println("Availability: Available");
        } else {
            System.out.println("Availability: Issued");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ID");
        int idd = sc.nextInt();

        System.out.println("Enter Book Title");
        String titlee = sc.next();

        System.out.println("Enter Author Name");
        String authore = sc.next();

        Book obj = new Book(idd, titlee, authore);

        obj.displayBook();

        System.out.println("Do you want to issue the book? 1 for Yes, 2 for No");
        int choice = sc.nextInt();

        if (choice == 1) {
            obj.issueBook();
        }

        obj.displayBook();

        System.out.println("Do you want to return the book? 1 for Yes, 2 for No");
        int choice2 = sc.nextInt();

        if (choice2 == 1) {
            obj.returnBook();
        }

        obj.displayBook();
    }
}