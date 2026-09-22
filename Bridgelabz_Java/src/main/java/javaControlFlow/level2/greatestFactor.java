package javaControlFlow.level2;
import java.util.Scanner;
//create a class to print greatest factor of a number
public class greatestFactor {
    public static void main(String[] args){
        //creating scanner onject
        Scanner input=new Scanner(System.in);

        //creating variable and taking user input
        System.out.print("Enter the number :");
        int number=input.nextInt();
        int greatestFactor=1;
        //for loop
        for (int i=number-1;i>=1;i--){
            if(number%i==0){
                greatestFactor=i;
                break;
            }
        }
        System.out.print("The greatest factor of "+number+" is "+greatestFactor);
        input.close();
    }
}
