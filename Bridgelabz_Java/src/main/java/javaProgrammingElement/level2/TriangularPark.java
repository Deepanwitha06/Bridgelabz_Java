package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name TriangularPark to calculate rounds around a triangular park
class TriangularPark {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable for the 3 sides and take user input trespectively
        System.out.print("Enter the first side of the park in meters: ");    double side1 = input.nextDouble();
        System.out.print("Enter the second side of the park in meters: ");   double side2 = input.nextDouble();
        System.out.print("Enter the third side of the park in meters: ");     double side3 = input.nextDouble();

        // Create a variable totalDistanceInKilometers and assign value 5
        double totalDistanceInKilometers = 5;
        // Create a variable metersPerKilometer and assign value 1000
        double metersPerKilometer = 1000;

        // Convert the total running distance from kilometers to meters
        double totalDistanceInMeters = totalDistanceInKilometers * metersPerKilometer;
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        // Calculate the number of rounds required
        double numberOfRounds = totalDistanceInMeters / perimeter;

        // Display the result
        System.out.println("The total number of rounds required to complete "+ totalDistanceInKilometers + " km is " + numberOfRounds);

        // Close the Scanner
        input.close();
    }
}