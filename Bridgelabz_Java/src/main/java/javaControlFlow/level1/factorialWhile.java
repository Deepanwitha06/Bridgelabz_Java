package javaControlFlow.level1;
import java.util.Scanner;

//creating class for factorial using while loop
public class factorialWhile {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //creating variable and take user input
        System.out.print("Enter the number:");
        int number=input.nextInt();

        //factorial
        int fact=1;
        int temp=number;
        if(number>0) {
            while (number > 0) {
                fact *= number;
                number--;
            }
            System.out.print("Factorial of "+temp+" is "+fact);
        }else{
            System.out.print("Number is not positive. Hence no factorial");
        }
        input.close();
    }
}
