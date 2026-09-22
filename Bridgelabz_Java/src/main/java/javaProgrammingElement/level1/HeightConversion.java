package javaProgrammingElement.level1;
import java.util.Scanner;
// Creating Class with name HeightConversion to convert height
class HeightConversion {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        // Create a variable heightInCentimeters and take user input
        System.out.print("Enter height in centimeters: ");
        double heightInCentimeters = input.nextDouble();
        // Create variables for unit conversion
        double centimetersPerInch = 2.54;
        int inchesPerFoot = 12;
        // Convert centimeters to total inches
        double totalInches = heightInCentimeters / centimetersPerInch;

        // Calculate feet
        int heightInFeet = (int) totalInches / inchesPerFoot;

        // Calculate remaining inches
        double remainingInches = totalInches % inchesPerFoot;

        // Display the result
        System.out.println("Height in feet is " + heightInFeet + " feet and " + remainingInches + " inches");

        // Close the Scanner
        input.close();
    }
}