package javaStrings.BuiltinFunctions;
import java.util.Scanner;
/*
   create a class with recursion to find factorial
 */
public class FactorialRecursive {
    // a mthod to take input
    public static int getInput(){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int userInput=input.nextInt();
        return userInput;
    }

    // a method to check the condition
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    // a method to diplsy
    public static void display(int fact){
        System.out.println("The factorial of the give number is "+fact);
    }

    public static void main(String[] args){
        int userInput=getInput();
        display(factorial(userInput));
    }
}
