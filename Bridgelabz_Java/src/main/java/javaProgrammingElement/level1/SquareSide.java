package javaProgrammingElement.level1;
import java.util.Scanner;
// Creating Class with name SquareSide to find the side of a square
class SquareSide {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable perimeter and take user input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Create a variable numberOfSides and assign value 4
        double numberOfSides = 4;

        // Calculate the length of the side
        double side = perimeter / numberOfSides;

        // Display the result
        System.out.println("The length of the side is " + side+ " whose perimeter is " + perimeter);

        // Close the Scanner
        input.close();
    }
}