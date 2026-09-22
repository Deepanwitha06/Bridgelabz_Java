package javaProgrammingElement.level1;
import java.util.Scanner;
// Creating Class with name UniversityFeeInput to calculate discounted university fee
class UniversityFeeInput {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable fee and take user input
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();

        // Create a variable discountPercent and take user input
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = fee * discountPercent / 100;
        // Calculate the final fee after discount
        double discountedFee = fee - discount;

        // Display the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);

        // Close the Scanner
        input.close();
    }
}
