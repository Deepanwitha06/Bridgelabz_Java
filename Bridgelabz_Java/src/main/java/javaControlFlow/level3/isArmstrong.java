package javaControlFlow.level3;
import java.util.Scanner;
//create class to check whether given number is Armstrong or not
public class isArmstrong {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.print("Enter the number:");
        int number=input.nextInt();
        //initializing variables
        int sum=0;
        int originalNumber=number;

        //checking armstrong or not
        while(number!=0){
            int remainder=number%10;
            sum+=(remainder*remainder*remainder);
            number=number/10;
        }
        if(sum==originalNumber){
            System.out.print(originalNumber+" is a Armstrong number");
        }else{
            System.out.print(originalNumber+" is not a Armstrong number");
        }
        input.close();

    }
}
