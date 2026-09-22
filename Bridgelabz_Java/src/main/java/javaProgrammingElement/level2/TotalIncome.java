package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name TotalIncome to calculate total income
class TotalIncome {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable salary and take user input
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();

        // Create a variable bonus and take user input
        System.out.print("Enter the bonus: ");
        double bonus = input.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary+ " and bonus is INR " + bonus+ ". Hence Total Income is INR " + totalIncome);

        // Close the Scanner
        input.close();
    }
}