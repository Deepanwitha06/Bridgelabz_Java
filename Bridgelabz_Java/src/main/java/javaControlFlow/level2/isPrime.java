package javaControlFlow.level2;
import java.util.Scanner;
//creating class to a number is prime or not
public class isPrime {
    public static void main(String[] args){
        //creating scanner onject
        Scanner input=new Scanner(System.in);

        //creating variable and take user input
        System.out.print("Enter the number: ");
        int number=input.nextInt();
        boolean isPrime=true;

        //checking prime or not using a isPrime boolean variable and for loop
        if(number<=1){
            System.out.print("Not prime");
        }else {
            for (int i = 2; i < number; i++) {
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.print(number+" is a Prime number");
        }else{
            System.out.print(number+" is not a Prime number");
        }
        input.close();
    }
}
