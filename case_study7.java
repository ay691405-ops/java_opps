import java.util.Scanner;

class ATM {
    int pin;
    double balance;

    ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    boolean checkPin(int enteredPin) {
        return enteredPin == pin;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class case_study7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(1234, 10000);
        int attempts = 0;
        boolean correctPin = false;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (atm.checkPin(enteredPin)) {
                correctPin = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");
            }
        }

        if (correctPin) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                atm.withdraw(sc.nextDouble());
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                atm.deposit(sc.nextDouble());
            } else if (choice == 3) {
                atm.displayBalance();
            } else {
                System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Account blocked. Too many incorrect attempts.");
        }

        sc.close();
    }
}
