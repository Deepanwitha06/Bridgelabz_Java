package javaProgrammingElement.level2;

import java.util.Scanner;
// Creating Class with name PoundsToKilograms to convert pounds to kilograms
class PoundsToKilograms{
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable pounds and take user input
        System.out.print("Enter the weight in pounds: ");
        double pounds = input.nextDouble();

        // Create a variable kilogramsPerPound and assign the conversion value
        double kilogramsPerPound = 2.2;

        // Convert pounds to kilograms
        double kilograms = pounds / kilogramsPerPound;

        // Display the result
        System.out.println("The weight in pound is " + pounds+" and in kilograms is " +kilograms);

        // Close the Scanner
        input.close();
    }
}