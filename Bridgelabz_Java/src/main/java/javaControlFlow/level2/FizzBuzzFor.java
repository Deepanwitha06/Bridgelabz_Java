package javaControlFlow.level2;
import java.util.Scanner;
//create a class for printing fizz at multiple of 3 and buzz for multiple of 5 and FizzBuzz for multiple of both for the numbers from 1 to user input
public class FizzBuzzFor {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.print("Enter a number:");
        int number=input.nextInt();

        //the pattern
        if (number>0) {
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i%5==0) {        //i%15==0
                    System.out.println("FizzBuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Enter a positive number");
        }
        input.close();
    }
}
