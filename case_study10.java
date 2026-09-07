import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class NetBanking implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }
}

public class case_study10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        System.out.print("Choose payment method: ");
        int choice = sc.nextInt();

        Payment p;

        if (choice == 1)
            p = new CreditCard();
        else if (choice == 2)
            p = new UPI();
        else
            p = new NetBanking();

        p.pay(amount);

        sc.close();
    }
}
