import java.util.Scanner;

public class Lab_6_33 {
    
    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: num1 = " + a + ", num2 = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        swapNumbers(num1, num2);
    }
}
