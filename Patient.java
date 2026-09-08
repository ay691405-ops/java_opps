import java.util.*;

public class Patient {

    int id;
    String name;
    int age;
    double temperature;

    Patient(int idd, String namee, int agee, double temperaturee) {
        id = idd;
        name = namee;
        age = agee;
        temperature = temperaturee;
    }

    void checkTemperature() {

        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }

    void display() {

        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + " F");

        System.out.print("Condition: ");
        checkTemperature();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient ID");
        int idd = sc.nextInt();

        System.out.println("Enter Patient Name");
        String namee = sc.next();

        System.out.println("Enter Age");
        int agee = sc.nextInt();

        System.out.println("Enter Temperature");
        double temperaturee = sc.nextDouble();

        Patient obj = new Patient(idd, namee, agee, temperaturee);

        obj.display();
    }
}