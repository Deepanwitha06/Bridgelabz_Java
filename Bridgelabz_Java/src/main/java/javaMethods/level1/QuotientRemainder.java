package javaMethods.level1;
import java.util.Scanner;
/*create a class to find the remainder and quotient for the given numbers
   Logic : for remainder - %  - a%b
           for quotient -  /   - a/b
*/

public class QuotientRemainder {
    //create a method for finding the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder=number%divisor;
        int quotient=number/divisor;

        int[] result={remainder,quotient};
        return result;
    }

    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.println("Enter the dividend and divisor: ");
        int number=input.nextInt();
        int divisor=input.nextInt();
        int[] result=findRemainderAndQuotient(number,divisor);

        //display
        System.out.print("The remainder and quotient for the given numbers are "+result[0]+" and "+result[1]+" respectively ");
        input.close();
    }

}
