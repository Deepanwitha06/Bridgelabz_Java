package javaProgrammingElement.level1;
import java.util.Scanner;
class TriangleArea {                                                             // Creating Class with name TriangleArea to calculate area of a triangle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                        // Create Scanner object to take user input
        System.out.print("Enter the base of the triangle in inches: ");        // Create a variable base and take user input
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");        // Create a variable height and take user input
        double height = input.nextDouble();
        double half = 0.5;                                                           // Create a variable half and assign value 0.5

        double areaInSquareInches = half * base * height;                          // Calculate the area of the triangle in square inches
        double centimetersPerInch = 2.54;                                           // Create a variable centimetersPerInch for conversion
        double baseInCentimeters = base * centimetersPerInch;                         // Convert base and height from inches to centimeters
        double heightInCentimeters = height * centimetersPerInch;

        double areaInSquareCentimeters = half * baseInCentimeters * heightInCentimeters;                              // Calculate the area in square centimeters

        System.out.println("The area of the triangle is "+ areaInSquareInches + " square inches and " + areaInSquareCentimeters + " square centimeters"); // Display the result

        input.close();                                                                      // Close the Scanner
    }
}
