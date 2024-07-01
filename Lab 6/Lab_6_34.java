import java.util.Scanner;

class Employee_Detail {
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;

    void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        Employee_ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Designation: ");
        Designation = sc.nextLine();
        System.out.print("Enter Salary: ");
        Salary = sc.nextDouble();
    }

    void printDetails() {
        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
    }
}

public class Lab_6_34 {
    public static void main(String[] args) {
        Employee_Detail employee = new Employee_Detail();
        employee.readDetails();
        employee.printDetails();
    }
}
