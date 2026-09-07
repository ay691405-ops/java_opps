import java.util.Scanner;

class BankAccount {
    int accountNo;
    String name;
    double balance;

    BankAccount(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
    }

    void displayBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class case_study2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int no = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        BankAccount a = new BankAccount(no, name, balance);

        System.out.print("Enter deposit amount: ");
        a.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        a.withdraw(sc.nextDouble());

        a.displayBalance();

        sc.close();
    }
}
