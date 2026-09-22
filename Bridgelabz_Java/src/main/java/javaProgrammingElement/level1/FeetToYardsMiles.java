package javaProgrammingElement.level1;

import java.util.Scanner;
// Creating Class with name FeetToYardsMiles to convert feet to yards and miles
class FeetToYardsMiles {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        // Create a variable distanceInFeet and take user input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        // Create variables for unit conversion
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        // Convert feet to yards
        double distanceInYards = distanceInFeet / feetPerYard;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display the result
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

        // Close the Scanner
        input.close();
    }
}
