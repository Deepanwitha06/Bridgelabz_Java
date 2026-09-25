package javaMethods.level1;
import java.util.Scanner;
/* Create a class to find the largest and smallest number among 3 numbers
    Logic: The number greater than other 2 is largest
           The number smaller than other two is smallest
           other way: take the first number as smallest and largest
                      now compare it wth other two and return the smallest and largest
     Process : use an array with index 0 and 1 to store smallest and largest
 */
public class LargestSmallest {
    //create a method to find both smallest and largest in this only
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest=number1;             //for smallest
        if(smallest>number2){
            smallest=number2;
        }
        if(smallest>number3){
            smallest=number3;
        }
        int largest=number1;             // for largest
        if(largest<number2){
            largest=number2;
        }
        if(largest<number3){
            largest=number3;
        }
        int[] result={smallest,largest};
        return result;
    }

    public static void main(String[] main){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable to collect 3 numbers for the comparision
        System.out.println("Enter any 3 numbers: ");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();

        //get the result from input and display smallest and largest
        int[] result=findSmallestAndLargest(number1,number2,number3);
        System.out.print("The smallest among the given numbers is "+result[0]+" and the largest is "+result[1]);
        input.close();
    }


}
