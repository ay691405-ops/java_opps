import java.util.Scanner;

class Student {
    String name;
    String[] courses = new String[5];
    int count = 0;

    Student(String name) {
        this.name = name;
    }

    void registerCourse(String course) {
        if (count < 5) {
            courses[count] = course;
            count++;
            System.out.println("Course registered.");
        } else {
            System.out.println("Maximum 5 courses allowed.");
        }
    }

    void displayCourses() {
        System.out.println("Student: " + name);
        System.out.println("Registered Courses:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
    }
}

public class case_study9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.next();

        Student s = new Student(name);

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            s.registerCourse(sc.next());
        }

        System.out.println();
        s.displayCourses();

        sc.close();
    }
}
