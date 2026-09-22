package javaArrays.level2;
import java.util.Scanner;
//create a class to find the first and second largest digit of the number
public class FirstSecondlargestNobreak {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.println("Enter the number: ");
        long number=input.nextLong();
        //Array to store digits
        int maxDigit=10;
        int index=0;
        int[] digits=new int[maxDigit];
        while(number!=0){
            if(index==maxDigit){
                maxDigit=maxDigit*2;
                int[] temp=new int[maxDigit];
                for(int i=0;i<index;i++){
                    temp[i]=digits[i];
                }
                digits=temp;
            }
            digits[index]=(int)number%10;
            number=number/10;
            index++;
        }
        int max=0;
        int secondmax=0;
        for(int i=0;i<index;i++){
            if(digits[i]>max){
                secondmax=max;
                max=digits[i];
            }else{
                if(digits[i]<=max && digits[i]>secondmax){
                    secondmax=digits[i];
                }
            }
        }
        if(max!=secondmax) {
            System.out.println("The first and Second largest digits in the given number are " + max + " and " + secondmax + " respectively");
        }else{
            System.out.println("The first and Second largest digits in the given number are same and is  " + max );
        }
        input.close();
    }
}
