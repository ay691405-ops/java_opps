import java.util.*;

public class Student {

    String name;
    String[] courses = new String[5];
    int count = 0;

    Student(String namee) {
        name = namee;
    }

    void registerCourse(String course) {

        if (count < 5) {

            courses[count] = course;
            count++;

            System.out.println("Course registered successfully");

        } else {

            System.out.println("You cannot register for more than 5 courses");
        }
    }

    void displayCourses() {

        System.out.println("Student Name: " + name);
        System.out.println("Registered Courses:");

        for (int i = 0; i < count; i++) {

            System.out.println((i + 1) + ". " + courses[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name");
        String namee = sc.next();

        Student obj = new Student(namee);

        System.out.println("Enter Course 1");
        String course1 = sc.next();
        obj.registerCourse(course1);

        System.out.println("Enter Course 2");
        String course2 = sc.next();
        obj.registerCourse(course2);

        System.out.println("Enter Course 3");
        String course3 = sc.next();
        obj.registerCourse(course3);

        System.out.println("Enter Course 4");
        String course4 = sc.next();
        obj.registerCourse(course4);

        System.out.println("Enter Course 5");
        String course5 = sc.next();
        obj.registerCourse(course5);

        System.out.println("Enter Course 6");
        String course6 = sc.next();
        obj.registerCourse(course6);

        obj.displayCourses();
    }
}