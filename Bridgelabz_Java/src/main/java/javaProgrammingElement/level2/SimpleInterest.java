package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name SimpleInterest to calculate simple interest
class SimpleInterest {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable principal and take user input
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        // Create a variable rate and take user input
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        // Create a variable time and take user input
        System.out.print("Enter the time in years: ");
        double time = input.nextDouble();

        // Calculate the simple interest
        double simpleInterest = principal * rate * time / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest +" for Principal "+principal+",Rate of Interest "+ rate+" and time "+time);

        // Close the Scanner
        input.close();
    }
}
