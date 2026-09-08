import java.sql.SQLOutput;
import java.util.*;
public class account {
    long account_number;
    String name;
    double bal;
     account(long accno,String nam, double ball){
        account_number = accno;
        name = nam;
        bal = ball;
    }
    void depo(double amt){
        bal = bal+amt;
        System.out.println("Deposit successful");
    }
    void withdraw(double amt){
        bal = bal-amt;
        System.out.println("Money withdrawn");
    }
    void display(){
        System.out.println("Account number: " + account_number);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + bal);
    }
        public static void main(String[] args){
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter account number");
            long accno = obj.nextLong();
            System.out.println("Enter account holder name");
            String nam = obj.next();
            System.out.println("Enter account balance");
            double bal = obj.nextDouble();
            account a = new account(accno,nam,bal);
            System.out.println("Enter deposit amount");
            double amt = obj.nextDouble();
            a.depo(amt);
            System.out.println("Enter withdrawal amount");
            double withdraw = obj.nextDouble();
            a.withdraw(withdraw);
            a.display();

        }
    }

