package javaProgrammingElement.level1;
import java.util.Scanner;

// Creating Class with name KilometersToMilesInput to convert kilometers to miles
class KilometersToMilesInput {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Create a double variable km and take user input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Create a double variable kilometersPerMile and assign conversion value 1.6
        double kilometersPerMile = 1.6;
        // Calculate the distance in miles
        double miles = km / kilometersPerMile;
        // Display the result
        System.out.println("The total miles is " + miles
                + " mile for the given " + km + " km");
        // Close the Scanner
        input.close();
    }
}