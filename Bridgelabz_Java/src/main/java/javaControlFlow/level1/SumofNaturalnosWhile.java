package javaControlFlow.level1;
import java.util.Scanner;
//creating class to check whether given is natural number(Comparision of Sum of natural number through for loop and formula) or not
public class SumofNaturalnosWhile {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //creating variable and take user input
        System.out.print("Enter number:");
        int number=input.nextInt();

        //check natutral number or not
        if (number<=0){
            System.out.print("Not a natural number");
        }else{
            int temp=number;
            int sum=0;
            while(number>0){
                sum+=number;
                number--;
            }
            int total=(temp*(temp+1)/2);
            if(sum==total) {
                System.out.print("Sum of " + temp + " natural numbers is " + sum+"\n the sum through while loop and formula is same");
            }else{
                System.out.print("Sum of " + number + " natural numbers using while loop is " + sum + " and using formula is "+total);
            }
        }
        input.close();
    }
}
