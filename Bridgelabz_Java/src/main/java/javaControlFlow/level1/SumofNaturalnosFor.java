package javaControlFlow.level1;
import java.util.Scanner;

//creating class for checking natural number(Comparision of Sum of natural number through for loop and formula) or not
public class SumofNaturalnosFor {
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);

        //creating variable and taking user input
        System.out.print("Enter a number:");
        int number = input.nextInt();

        //checking natural (Comparision of Sum of natural number through for loop and formula)or not
        if (number <= 0) {
            System.out.print("Not a natural Number");
        } else {
            int sum = 0;
            for (int i = number; i > 0; i--) {
                sum += i;
            }
            int total = (number * (number + 1) / 2);
            if (total == sum) {
                System.out.print("Sum of " + number + " natural numbers is " + sum + "\n The sum through for loop and formula is same");
            }else{
                System.out.print("Sum of " + number + " natural numbers using for loop is " + sum + " and using formula is "+total);
            }
        }
        input.close();
    }

}
