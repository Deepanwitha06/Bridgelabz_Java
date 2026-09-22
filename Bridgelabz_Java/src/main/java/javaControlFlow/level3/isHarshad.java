package javaControlFlow.level3;
import java.util.Scanner;
//create a class to check whether a given number is harshad(integer which is divisible by the sumof its digits)
public class isHarshad {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.print("Enter the number:");
        int number=input.nextInt();
        int temp=number;                            //Initialize variables
        int sum=0;

        //checking the logic
        while(temp!=0){
            int digit=temp%10;
            temp=temp/10;
            sum+=digit;
        }
        if(number%sum==0){
            System.out.print("Given number is Harshad Number");
        }else{
            System.out.print("Given number is not a Harshad Number");
        }
        input.close();

    }
}
