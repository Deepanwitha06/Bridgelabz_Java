package javaControlFlow.level2;
import java.util.Scanner;

//creating class to check leap year or not using logocal operators
public class leapyearlogicalop {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //creating variable and take user input
        System.out.print("Enter the year:");
        int year=input.nextInt();

        //checking the condition ( for leap year ..year after 1581 and divisible by 4 but not by 100 unless divisible by 400)
        if(year>1581 && ((year%400==0) || (year %100!=0 && year%4==0))){
            System.out.println("A leap year");
        }else{
            System.out.println("Not a leap year");
        }
        input.close();
    }
}
