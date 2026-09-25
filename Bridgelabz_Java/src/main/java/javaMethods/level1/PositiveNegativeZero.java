package javaMethods.level1;
import java.util.Scanner;
/* create a class to check whether the given number by the user is positive,negative or zero
   using methods
   logic: Positive - input>-
          Negative - input<0
          Zero     - input=0
 */
public class PositiveNegativeZero {
    //create a method to check the number is positive , negative or Zero
    public static int ChecktheNumber(int n){
        if(n==0){
            return 0;
        }else if(n>0){
            return 1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable to collect the user input
        System.out.println("Enter the number: ");
        int number=input.nextInt();

        //get the value after comparision
        int result =ChecktheNumber(number);
        System.out.print("The given number is ");
        if(result==0){
            System.out.println("Zero");
        }else if(result>0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
        input.close();
    }
}
