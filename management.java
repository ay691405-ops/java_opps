import java.util.*;
public class management {
    int id;
    String name;
    double salary;
    management (int idd, String namee, double saalary) {
        id = idd;
        name = namee;
        salary = saalary;
    }
    double HRA(double salary){
        double hr = salary/20;
        return hr;
    }
    double Da(double salary) {
        double daa = salary / 10;
        return daa;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        int idd = sc.nextInt();
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        management obj = new management (idd,name,salary);
         double hr =obj.HRA(salary);
        double daa =obj.Da(salary);
        double finalSalary = salary+daa+hr;
        System.out.println("HRA:"+hr);
        System.out.println("DA"+daa);
        System.out.println("Final Salary: "+finalSalary);
    }
}
