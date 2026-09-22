package javaArrays;
import java.util.Scanner;
//create class to take odd numbers into odd array and even numbers into even Array and display them
public class OddEvenArray {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take user input
        System.out.print("Enter the number: ");
        int number=input.nextInt();
        int size=(number/2)+1;
        int evenindex=0;
        int oddindex=0;
        int[] evenArray=new int[size];
        int[] oddArray=new int[size];

        if(number<=0){
            System.err.println("An Error");
            System.exit(0);
        }
        //even and odd numbers seperation
        for(int i=0;i<=number;i++){
            if(i%2==0){
                evenArray[evenindex]=i;
                evenindex++;
            }else{
                oddArray[oddindex]=i;
                oddindex++;
            }
        }
        System.out.println("Odd numbers till "+number+" :");
        for(int i=0;i<oddindex;i++){
            System.out.println(oddArray[i]+"\t");
        }
        System.out.println("Odd numbers:"+number+" :");
        for(int i=0;i<evenindex;i++){
            System.out.println(evenArray[i]+"\t");
        }
        input.close();

    }
}
