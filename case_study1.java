public class case_study1 {
    static class student{
        String name;
        int Physics_marks;
        int Computer_marks;
        int Chemistry_marks;
        int English_marks;
        int Maths_marks;
        student(String name,int Physics_marks,int Computer_marks,int Chemistry_marks,int English_marks,int Maths_marks){
            int total_marks=Physics_marks+Chemistry_marks+Computer_marks+Maths_marks+English_marks;
            float percentage =total_marks/500.0f*100;
            if(percentage>=90){
                System.out.println("A+");
            }else if(percentage>=80){
                System.out.println("A");
            }else if(percentage>=70){
                System.out.println("B");
            }else if(percentage>=60){
                System.out.println("C");
            }else if(percentage>=50){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }
    }
    public static void main(String args[]){
        student s1=new student("Arpit", 94, 93, 98, 91, 94);
    }
}