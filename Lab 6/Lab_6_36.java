import java.util.Scanner;

public class Lab_6_36 {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        
        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = sc.next().charAt(0);
        
        if (unit == 'C' || unit == 'c') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (unit == 'F' || unit == 'f') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid unit");
        }
    }
}
