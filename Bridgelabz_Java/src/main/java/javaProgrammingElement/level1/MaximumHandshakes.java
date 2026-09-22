package javaProgrammingElement.level1;
import java.util.Scanner;
// Creating Class with name MaximumHandshakes to calculate maximum handshakes
class MaximumHandshakes {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable numberOfStudents and take user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create a variable numberOfPairs and assign value 2
        int numberOfPairs = 2;

        // Calculate the maximum number of handshakes
        int maximumHandshakes = (numberOfStudents
                * (numberOfStudents - 1)) / numberOfPairs;

        // Display the result
        System.out.println("The maximum number of handshakes is "+ maximumHandshakes);

        // Close the Scanner
        input.close();
    }
}
