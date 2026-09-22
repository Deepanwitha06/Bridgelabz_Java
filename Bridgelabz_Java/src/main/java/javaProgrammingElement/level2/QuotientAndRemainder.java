package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name QuotientAndRemainder to find quotient and remainder
class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                     // Create Scanner object to take user input
        System.out.print("Enter the first number: ");                            // Create a variable number1 and take user input
        int number1 = input.nextInt();

        // Create a variable number2 and take user input
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Calculate the quotient
        int quotient = number1 / number2;

        // Calculate the remainder
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1  + " and " + number2);

        // Close the Scanner
        input.close();
    }
}