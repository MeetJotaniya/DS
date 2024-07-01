import java.util.*;

    class Student_Detail{
        long Enrollment_No;
        String Name;
        int Semester;
        double CPI;

        void scan() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Enrollment_No : ");
            Enrollment_No = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter Name : ");
            Name = sc.nextLine();
            System.out.print("Enter Semester : ");
            Semester = sc.nextInt();
            System.out.print("Enter CPI : ");
            CPI = sc.nextDouble();
        }

        void printDetails(){
            System.out.println("Enrollment no. : " + Enrollment_No);
            System.out.println("Name : " + Name);
            System.out.println("Semester : " + Semester);
            System.out.println("CPI : " + CPI);
        }
    }
public class Lab_6_35 {
    public static void main(String[] args) {
        int i;
     
        Student_Detail[] Student = new Student_Detail[5];
        for(i=0;i<5;i++){
        Student[i] = new Student_Detail();
        System.out.println("enter student("+(i+1)+") details");
        Student[i].scan();
        
        Student[i].printDetails();
        }    
    }
}
