package javaProgrammingElement.level1;
import java.util.Scanner;
// Creating Class with name TotalPurchasePrice  to calculate total purchase price
class TotalPurchasePrice {    public static void main(String[] args) {

    // Create Scanner object to take user input
    Scanner input = new Scanner(System.in);

    // Create a variable unitPrice and take user input
    System.out.print("Enter the unit price: ");
    double unitPrice = input.nextDouble();

    // Create a variable quantity and take user input
    System.out.print("Enter the quantity: ");
    int quantity = input.nextInt();

    // Calculate the total purchase price

    double totalPurchasePrice = unitPrice * quantity;

    // Display the result
    System.out.println("The total purchase price is INR "+ totalPurchasePrice+ " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

    // Close the Scanner
    input.close();
}
}
