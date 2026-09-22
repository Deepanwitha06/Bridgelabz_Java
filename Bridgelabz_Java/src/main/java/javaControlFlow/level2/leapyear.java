package javaControlFlow.level2;
import java.util.Scanner;

//creating class that checks the year is leap year or not
public class leapyear {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.print("Enter the year: ");
        int year=input.nextInt();

        //checking leay year or not (year after 1581 and divisible by 4 not 100 unless by 400)
        if(year<1582){
            System.out.print("Not a leap year");
        }else if(year % 400==0){
            System.out.print("A leap year");
        }else if(year %100==0){
            System.out.print("Not a leap year");
        }else if(year %4==0){
            System.out.print("A leap year");
        }else{
            System.out.print("Not a leap year");
        }
        input.close();
    }
}
