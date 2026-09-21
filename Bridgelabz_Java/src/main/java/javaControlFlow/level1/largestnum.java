package javaControlFlow.level1;
import java.util.Scanner;

//creating class to check which number is largest in 3 numers
public class largestnum {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //Creating variables and taking user inputes for 3 numbers
        System.out.println("Enter the three numbers:");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();

        //comparision and display
        System.out.println("Is the first number the largest?" + ((number1>=number2 && number1>=number3)? "Yes":"No"));
        System.out.println("Is the Second number the largest?"+((number2>number1 && number2>=number3)? "Yes":"No"));
        System.out.println("Is the third number the largest?"+((number3>=number1 && number3>=number2)? "Yes":"No"));
        input.close();
    }

}
