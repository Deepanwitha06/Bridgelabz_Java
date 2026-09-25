package javaMethods.level1;
import java.util.Scanner;
/*create a class to find the no.of chocolates each child gets and chocolates that get remained( remainder and quotient for the given numbers)
   Logic : for no.of chocolates remaining- remainder - %  - a%b
           for no.of chocolates each child get-quotient -  /   - a/b
*/

public class ChocolateDistribution {
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
        System.out.println("Enter the number of chocolates and number of children: ");
        int numberOfchocolates=input.nextInt();
        int numberOfChildren=input.nextInt();
        int[] result=findRemainderAndQuotient(numberOfchocolates,numberOfChildren);

        //display
        System.out.print("Each child gets "+result[1]+" chocolates and "+result[0]+" chocolates will be remaining ");
        input.close();
    }
}





