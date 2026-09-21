package javaControlFlow.level1;
import java.util.Scanner;

//creating class to print even and odd numbers
public class Evenoddnumber {
    public static void main(String[] args) {
        //creating scanner obj
        Scanner input = new Scanner(System.in);
        //creating variables and taking user input
        System.out.print("Enter the number:");
        int number = input.nextInt();
        //display
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " is " +( (i% 2 == 0) ? "even" : "Odd"));
        }
        input.close();
    }

}
