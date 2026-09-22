package javaControlFlow.level2;
import java.util.Scanner;
//creating class to find power of a number
public class PowerOfNumber {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //create a variables and take user input
        System.out.print("Enter the number and power:");
        int number=input.nextInt();
        int power=input.nextInt();

        int result=1;
        for(int i=1;i<=power;i++){
            result*=number;
        }
        System.out.print("Result is : "+result);
        input.close();
    }
}
