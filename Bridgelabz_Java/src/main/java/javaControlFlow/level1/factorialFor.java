package javaControlFlow.level1;
import java.util.Scanner;

//creating class for factorial using for loop
public class factorialFor {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //creating variable and taking user input
        System.out.println("Enter the number:");
        int number=input.nextInt();

        //factorial
        if(number>0){
            int fact=1;
            for (int i=number;i>0;i--){
                fact*=i;
            }
            System.out.print("The fatorial of "+number+" is "+fact);
        }else{
            System.out.print("The number is not a natural numer");
        }
        input.close();
    }
}
