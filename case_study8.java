import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class case_study8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter manager name: ");
        String name = sc.next();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        Manager m = new Manager(name, salary, bonus);

        System.out.println("\n--- Manager Details ---");
        m.display();

        sc.close();
    }
}
