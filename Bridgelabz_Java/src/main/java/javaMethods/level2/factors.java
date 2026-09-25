package javaMethods.level2;
import java.util.Scanner;
/*  create a class to display the factors and do some operations on it
             - sum of the factors
             - sum of squares of factors
             - product of factors
      Logic: using a loop from 1 to n-1 which ever divides the number they are factors
 */
public class factors {
    //create a method to find the factors and stor them in an array
    public static int[] storfactors(int n){
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        int[] result=new int[c];
        int index=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                result[index]=i;
                index++;
            }
        }
        return result;
    }

    //create a method to calculate the sum of factors
    public static int sumOfFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }

    //create a method to calculate the product of factors
    public static int productOfFactors(int[] factors){
        int product=1;
        for(int i=0;i<factors.length;i++){
            product*=factors[i];
        }
        return product;
    }
    //create a method to calculate the sum of squares
    public static double sumOfSquaresOfFactors(int[] factors){
        double SumOfSquares=0;
        for(int i=0;i<factors.length;i++){
            SumOfSquares+=Math.pow(factors[i],2);
        }
        return SumOfSquares;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take input from the user
        System.out.println("Enter the number:");
        int number=input.nextInt();

        //get factors and display them
        int[] factors=storfactors(number);
        System.out.println("The factors of the given number are: ");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+" ");
        }

        //get the sum of factors and display it
        int sum=sumOfFactors(factors);
        System.out.println("\n The sum of the factors is "+sum);

        //get the product of the factors and display it
        int product=productOfFactors(factors);
        System.out.println("The product of the factors is "+product);

        //get the sum of squares of the factors
        double sumofsquares=sumOfSquaresOfFactors(factors);
        System.out.println("The sum of the squares of the factors are "+sumofsquares);

        input.close();

    }
}
