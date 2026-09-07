import java.util.Scanner;

class Patient {
    int patientId;
    String name;
    int age;
    double temperature;

    Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    void checkFever() {
        if (temperature > 100.4)
            System.out.println("Fever");
        else
            System.out.println("Normal");
    }

    void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + " F");
        checkFever();
    }
}

public class case_study6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient ID: ");
        int id = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        Patient p = new Patient(id, name, age, temp);

        p.displayPatient();

        sc.close();
    }
}
