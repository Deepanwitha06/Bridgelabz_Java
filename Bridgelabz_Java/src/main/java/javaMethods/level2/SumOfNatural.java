package javaMethods.level2;
import java.util.Scanner;
/*  create a class to calculate the sum of n natural numbers
    Condition : use 2 methods - 1 method for calculating the sum using recursion
                              - other method for calculating using the formula n*(n+1)/2
                      and then compare the values from both the methods
 */
public class SumOfNatural {
    //create a recursive method to calculate the sum of n natural numbers
    public static int recursiveSumOfNaturalNo(int n){
        if(n==0){
            return 0;
        }else{
            return 1+recursiveSumOfNaturalNo(n-1);
        }
    }

    //create a method to calculate the sum of natural numbers using the formula
    public static int formulaSumOfNaturalNo(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the number:");
        int number=input.nextInt();
        if(number<1) {
            while (number < 1) {
                System.out.println("Please enter a natural number:");
                number=input.nextInt();
            }
        }

        int recursiveSum=recursiveSumOfNaturalNo(number);
        int formulaSum=formulaSumOfNaturalNo(number);
        if(recursiveSum==formulaSum){
            System.out.println("The sum of "+number+" natural numbers using both recursive method and formula is same and the value is "+ recursiveSum);
        }else{
            System.out.println("The sum of "+number+" natural numbers by Recursive method is "+recursiveSum+"and by formula is "+formulaSum);
        }

        input.close();
    }
}
