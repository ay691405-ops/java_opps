import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displaySalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double gross = basicSalary + hra + da;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

public class case_study3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);

        e.displaySalary();

        sc.close();
    }
}
