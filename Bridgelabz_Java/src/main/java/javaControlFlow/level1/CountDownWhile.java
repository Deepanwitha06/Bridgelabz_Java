package javaControlFlow.level1;
import java.util.Scanner;
//creating a class for countdown
public class CountDownWhile {
    public static void main(String[] args){
        //creating scanner object
        Scanner input=new Scanner(System.in);

        //creating a variable and taking user input
        System.out.print("Enter the counter:");
        int counter=input.nextInt();

        //displaying the counter and decreaments using while
        while(counter>=1){
            System.out.println(counter);
            counter--;
        }
        input.close();
    }
}
