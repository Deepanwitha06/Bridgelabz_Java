package javaControlFlow.level1;
import java.util.Scanner;

//creating class to check whether input is divisible by 5 or not
class DivisibleByFive {
    public static void main(String[] args){
        //Creating scanner object
        Scanner input=new Scanner(System.in);
        //Create variable number and take user input
        System.out.print("Enter a number:");
        int number=input.nextInt();

        //check if number is divisible by 5 or not
        if (number%5==0){
            System.out.print(number + " is divisible by 5");
        }
        else{
            System.out.print(number + " is not divisible by 5");
        }
        input.close();
    }
}
