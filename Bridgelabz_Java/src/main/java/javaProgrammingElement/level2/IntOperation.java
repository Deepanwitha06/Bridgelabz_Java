package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name IntOperation to perform integer operations
class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                             // Create Scanner object to take user input

        // Create a variables a,b and c and take user inputs respectively
        System.out.print("Enter the value of a: "); int a = input.nextInt();
        System.out.print("Enter the value of b: ");int b = input.nextInt();
        System.out.print("Enter the value of c: ");int c = input.nextInt();

        // Calculate the integer operations one by one
        int firstResult = a + b * c;
        int secondResult = a * b + c;
        int thirdResult = c + a / b;
        int fourthResult = a % b + c;

        // Display the results
        System.out.println("The result of a + b * c is " + firstResult);
        System.out.println("The result of a * b + c is " + secondResult);
        System.out.println("The result of c + a / b is " + thirdResult);
        System.out.println("The result of a % b + c is " + fourthResult);

        // Close the Scanner
        input.close();
    }
}