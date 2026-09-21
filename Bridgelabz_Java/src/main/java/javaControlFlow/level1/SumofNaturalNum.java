package javaControlFlow.level1;
import java.util.Scanner;

//creating class to check number is nuatural number or not and if it is find the sum of numbers till given natural numbers
public class SumofNaturalNum {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //Creating variable and taking user input
        System.out.print("Enter a number:");
        int number=input.nextInt();
        //checking whether natural number or not
        if (number>=0){
            int sum=(number*(number+1)/2);
            System.out.println("Sum of "+number+" natural numbers is "+sum);
        }else{
            System.out.println("The number "+number+ " is not a natural number");
        }
        input.close();
    }
}
