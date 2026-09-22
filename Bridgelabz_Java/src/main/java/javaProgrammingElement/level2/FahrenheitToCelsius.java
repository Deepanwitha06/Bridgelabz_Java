package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name FahrenheitToCelsius to convert Fahrenheit to Celsius
class FahrenheitToCelsius {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable fahrenheit and take user input
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Create variables for the conversion formula
        double celsiusMultiplier = 5.0 / 9.0;
        double fahrenheitOffset = 32;

        // Calculate the temperature in Celsius
        double celsiusResult = (fahrenheit - fahrenheitOffset)* celsiusMultiplier;

        // Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");

        // Close the Scanner
        input.close();
    }
}