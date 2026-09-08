import java.util.*;

public class ATM {

    int pin = 1234;
    double balance = 10000;

    boolean checkPin(int enteredPin) {

        if (enteredPin == pin) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawal successful");
            System.out.println("Amount withdrawn: " + amount);

        } else {

            System.out.println("Insufficient balance");
        }
    }

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount deposited: " + amount);
    }

    void displayBalance() {

        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM obj = new ATM();

        int attempts = 0;
        boolean correct = false;

        while (attempts < 3) {

            System.out.println("Enter PIN");
            int enteredPin = sc.nextInt();

            if (obj.checkPin(enteredPin)) {

                System.out.println("Correct PIN");
                correct = true;
                break;

            } else {

                attempts++;

                System.out.println("Incorrect PIN");
                System.out.println("Attempts remaining: " + (3 - attempts));
            }
        }

        if (correct == true) {

            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Enter amount to withdraw");
                double amount = sc.nextDouble();

                obj.withdraw(amount);

            } else if (choice == 2) {

                System.out.println("Enter amount to deposit");
                double amount = sc.nextDouble();

                obj.deposit(amount);

            } else if (choice == 3) {

                obj.displayBalance();

            } else {

                System.out.println("Invalid choice");
            }

        } else {

            System.out.println("Maximum incorrect attempts reached");
            System.out.println("Account blocked");
        }
    }
}