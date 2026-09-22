package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name IntOperation to perform integer operations
class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                             // Create Scanner object to take user input

        // Create a variables a,b and c and take user inputs respectively
        System.out.print("Enter the value of a: "); double a = input.nextDouble();
        System.out.print("Enter the value of b: ");double b = input.nextDouble();
        System.out.print("Enter the value of c: ");double c = input.nextDouble();

        // Calculate the operations one by one
        double firstResult = a + b * c;
        double secondResult = a * b + c;
        double thirdResult = c + a / b;
        double fourthResult = a % b + c;

        // Display the results
        System.out.println("The result of a + b * c is " + firstResult);
        System.out.println("The result of a * b + c is " + secondResult);
        System.out.println("The result of c + a / b is " + thirdResult);
        System.out.println("The result of a % b + c is " + fourthResult);

        // Close the Scanner
        input.close();
    }
}