package javaMethods.level2;
import java.util.Scanner;
/* create a class to check whether the given number is leap year or not
    logic : for a year to be leap year it should be
                       - >=1582
                       - divisible by 4 not 100
                       - if divisible by 100 it should be divisible by 400
 */
public class IsLeapyear {
    //create a method to check whether a year is leap year or not
    public static boolean isLeap(int year){
        if(year<1582){
            return false;
        }else{
            if(year%400==0){
                return true;
            }else if(year%100==0){
                return false;
            }else if(year%4==0){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the year:");
        int year=input.nextInt();

        if(isLeap(year)){
            System.out.println("Given year is a leap year");
        }else{
            System.out.println("Given year is not a leap year");
        }

        input.close();
    }
}
