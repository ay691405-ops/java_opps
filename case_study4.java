import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product: " + productName);
        System.out.println("Total Cost: " + totalCost());
    }
}

public class case_study4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter product name: ");
        String name = sc.next();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Product p = new Product(id, name, price, quantity);

        double bill = p.totalCost();

        p.display();
        System.out.println("Total Bill: " + bill);

        if (bill > 5000) {
            double discount = bill * 0.10;
            bill = bill - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Final Bill: " + bill);
        }

        sc.close();
    }
}