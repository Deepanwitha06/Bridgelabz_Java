package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name ChocolatesDistribution to divide chocolates among children
class ChocolatesDistribution {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable numberOfChocolates,numberOfChildren and take user inputs respectively
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        // Calculate the remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the result
        System.out.println("Each child gets " + chocolatesPerChild + " chocolates and the remaining chocolates are "+ remainingChocolates);

        // Close the Scanner
        input.close();
    }
}