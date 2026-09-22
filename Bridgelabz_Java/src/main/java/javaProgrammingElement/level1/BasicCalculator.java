package javaProgrammingElement.level1;

import java.util.Scanner;
// Creating Class with name BasicCalculator to perform basic calculations
class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);           // Create Scanner object to take user input

        System.out.print("Enter first number: ");       // Take the first number as input
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");      // Take the second number as input
        double secondNumber = input.nextDouble();

        double addition = firstNumber + secondNumber;        // Perform arithmetic operations
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+firstNumber+"and "+secondNumber+"is"+ addition+","+subtraction+","+multiplication+"and"+division);           // Display the results
        // Close the Scanner
        input.close();
    }
}
