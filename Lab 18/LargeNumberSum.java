import java.util.Scanner;

public class LargeNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to hold 1000 digits each
        int[] num1 = new int[1000];
        int[] num2 = new int[1000];
        int[] sum = new int[1001]; // Result can be up to 1001 digits

        System.out.println("Enter the first 1000-digit number:");
        for (int i = 0; i < 1000; i++) {
            num1[i] = scanner.nextInt();
        }

        System.out.println("Enter the second 1000-digit number:");
        for (int i = 0; i < 1000; i++) {
            num2[i] = scanner.nextInt();
        }

        // Perform the addition digit by digit
        int carry = 0;
        for (int i = 999; i >= 0; i--) {
            int digitSum = num1[i] + num2[i] + carry;
            sum[i + 1] = digitSum % 10; // Store the unit digit
            carry = digitSum / 10; // Carry for the next digit
        }
        sum[0] = carry; // Store the final carry if any

        // Print the result
        boolean leadingZero = true;
        for (int i = 0; i < 1001; i++) {
            if (leadingZero && sum[i] == 0) {
                continue;
            }
            leadingZero = false;
            System.out.print(sum[i]);
        }
        if (leadingZero) { // In case both numbers are zero
            System.out.print("0");
        }
        System.out.println();
        
        scanner.close();
    }
}
