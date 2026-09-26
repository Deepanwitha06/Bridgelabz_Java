package javaMethods.level3;
import java.util.Scanner;
import java.lang.Math;
/* create a utility class named Number Checker
   Methods : - No.of digits in the number
             - digits in the number
             - is a duck Number(number with non zero digits)
             - armstrong
             -largest and second largest
             - smallest and second smallest
 */
public class NumberChecker {
    //create a method to count the digits in number
    public static int countOdDigits(int number){
        int count=0;
        if(number==0){
            return 1;
        }
        while(number!=0){
            int digit=number%10;
            count++;
            number=number/10;
        }
        return count;
    }

    //create a method to store digits
    public static int[] digitsOfNumber(int number,int count){
        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=number%10;
            number=number/10;
        }
        return digits;
    }

    //create to check if the number is duck number or not
    public static boolean isDuck(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    //create a method to check whether number is armstrong or not
    public static boolean isArmstrong(int[] digits){
        int sum=0;
        int number=0;
        for(int i=digits.length-1;i>=0;i--){
            number=(number*10)+digits[i];
        }
        for(int i=0;i<digits.length;i++){
            sum+=Math.pow(digits[i], digits.length);
        }
        return sum==number;
    }

    //create a method to find the largest and second largest
    public static int[] largestSecondLargest(int[] digits){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++){
            if(largest<digits[i]){
                secondLargest=largest;
                largest=digits[i];
            }else if(secondLargest<digits[i]){
                secondLargest=digits[i];
            }
        }
        int[] result={largest,secondLargest};
        return result;
    }

    //create a method to find the smallest and second smallest
    public static int[] smallestSecondSmallest(int[] digits){
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++){
            if(smallest>digits[i]){
                secondsmallest=smallest;
                smallest=digits[i];
            }else if(secondsmallest>digits[i]){
                secondsmallest=digits[i];
            }
        }
        int[] result={smallest,secondsmallest};
        return result;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //Create a variable and take input
        System.out.println("Enter the number: ");
        int number=input.nextInt();
        int noOfDigits=countOdDigits(number);
        int[] digits=digitsOfNumber(number,noOfDigits);
        System.out.println("Pick an option: \n option 1: No.of digits \noption 2:Digits of the number\noption 3:Number is duck number or not \noption 4:Armstrong or not \noption 5:largest and second largest digit \noption 6:smallest and second smallest digit");
        int op=input.nextInt();
        switch (op){
            case 1:
                System.out.println("Number of digits="+noOfDigits);
                break;
            case 2:
                System.out.println("The digits are: ");
                for (int i=0;i<noOfDigits;i++){
                    System.out.println(digits[i]+" ");
                }
                break;
            case 3:
                if(isDuck(digits)){
                    System.out.println("Is a duck number");
                }else{
                    System.out.println("Is not a duck Number");
                }
                break;
            case 4:
                if(isArmstrong(digits)){
                    System.out.println("Is an Armstrong number");
                }else{
                    System.out.println("Is not an Armstrong Number");
                }
                break;
            case 5:
                int[] resultl=largestSecondLargest(digits);
                System.out.println("the largest and second largest digits are: "+resultl[0]+" and "+resultl[1]);
                break;
            case 6:
                int[] results=smallestSecondSmallest(digits);
                System.out.println("the smallest and second smallest digits are: "+results[0]+" and "+results[1]);
                break;
        }
    }
}
