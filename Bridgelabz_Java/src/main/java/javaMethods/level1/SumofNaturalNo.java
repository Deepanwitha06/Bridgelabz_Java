package javaMethods.level1;
import java.util.Scanner;
/*create a class to calculate the sum of n natural numbers
   using method and loop
   logic: using loop the numbers from n to 1 are added
 */
public class SumofNaturalNo {
    //create a method to calculate the sum of natural number
    public static int SumOfNumber(int n){
        int sum=0;
        for(int i=n;i>0;i--){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.println("Enter the number:");
        int number=input.nextInt();
        System.out.println("The sum of "+number+" natural numbers is "+SumOfNumber(number));
        input.close();

    }
}
