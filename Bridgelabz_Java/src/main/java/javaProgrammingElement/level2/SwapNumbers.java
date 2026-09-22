package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name SwapNumbers to swap two numbers
class  SwapNumbers{
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable number1 and number2 and take user input respectively
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Create a temporary variable to store number1
        int temporaryNumber = number1;
        // Assign number2 to number1
        number1 = number2;
        // Assign the temporary value to number2
        number2 = temporaryNumber;

        // Display the swapped numbers
        System.out.println("After swapping, the first number is " + number1+ " and the second number is " + number2);

        // Close the Scanner
        input.close();
    }
}