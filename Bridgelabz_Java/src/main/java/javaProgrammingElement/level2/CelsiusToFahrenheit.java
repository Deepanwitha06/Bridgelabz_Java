package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name CelsiusToFahrenheit to convert Celsius to Fahrenheit
class CelsiusToFahrenheit {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable celsius and take user input
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Create variables for the conversion formula
        double fahrenheitMultiplier = 9.0 / 5.0;
        double fahrenheitOffset = 32;

        // Calculate the temperature in Fahrenheit
        double fahrenheitResult = (celsius * fahrenheitMultiplier) + fahrenheitOffset;

        // Display the result
        System.out.println("The " + celsius+ " Celsius is " + fahrenheitResult + " Fahrenheit");

        // Close the Scanner
        input.close();
    }
}