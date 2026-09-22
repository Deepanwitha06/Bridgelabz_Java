package javaArrays;
import java.util.Scanner;
//create a class to display factors
public class factors {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create required variables and array and take user input
        System.out.println("Enter the number:");
        int number=input.nextInt();
        int maxFactor=10;
        int [] factors=new int[maxFactor];
        int index=0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                if(index==maxFactor){
                    maxFactor=maxFactor*2;
                    //crate a temp array to copy old values
                    int[] temp=new int[maxFactor];
                    for(int j=0;j<factors.length;j++){
                        temp[j]=factors[j];
                    }
                    factors=temp;
                }
                factors[index]=i;
                index++;
            }
        }
        System.out.println("The factors are: ");
        for(int i=0;i<index;i++){
            System.out.println(factors[i]);
        }
        input.close();
    }
}
