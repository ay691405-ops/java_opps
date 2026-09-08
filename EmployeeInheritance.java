import java.util.*;

class Employee {

    String name;
    double salary;

    Employee(String namee, double salaryy) {
        name = namee;
        salary = salaryy;
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    double bonus;

    Manager(String namee, double salaryy, double bonuss) {

        super(namee, salaryy);
        bonus = bonuss;
    }

    void displayManager() {

        display();

        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class EmployeeInheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Manager Name");
        String namee = sc.next();

        System.out.println("Enter Salary");
        double salaryy = sc.nextDouble();

        System.out.println("Enter Bonus");
        double bonuss = sc.nextDouble();

        Manager obj = new Manager(namee, salaryy, bonuss);

        obj.displayManager();
    }
}