import java.util.*;

public class Product {

    int id;
    String name;
    double price;
    int quantity;

    Product(int idd, String namee, double pricee, int quantityy) {
        id = idd;
        name = namee;
        price = pricee;
        quantity = quantityy;
    }

    double totalCost() {
        double total = price * quantity;
        return total;
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product ID");
        int idd = sc.nextInt();

        System.out.println("Enter Product Name");
        String namee = sc.next();

        System.out.println("Enter Price");
        double pricee = sc.nextDouble();

        System.out.println("Enter Quantity");
        int quantityy = sc.nextInt();

        Product obj = new Product(idd, namee, pricee, quantityy);

        obj.display();

        double bill = obj.totalCost();

        System.out.println("Total Bill: " + bill);

        if (bill > 5000) {

            double discount = bill / 10;
            double finalBill = bill - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Bill: " + finalBill);

        } else {

            System.out.println("Final Bill: " + bill);
        }
    }
}