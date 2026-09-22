package javaControlFlow.level3;
import java.util.Scanner;
//create class to check a number is Abundant(Sum of all the divisors of the number is grater than the number itself) or not
public class isAbundant {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.print("Enter the number: ");
        int number=input.nextInt();
        int sum=0;

        //check logic
        for (int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum>number){
            System.out.print("Abundant Number");
        }else{
            System.out.print("Not an Abundant Number");
        }
        input.close();
    }
}
