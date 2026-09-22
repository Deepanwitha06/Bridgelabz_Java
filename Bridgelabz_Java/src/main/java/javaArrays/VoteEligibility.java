package javaArrays;
import java.util.Scanner;
//create a class to check vote eligibility
public class VoteEligibility {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //create an array to collect age of 10 students
        int[] age = new int[10];
        System.out.print("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {            //instead of 10 can use age.length
            age[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (age[i] <= 0) {
                System.out.print("Invalid Age");
            } else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote");
            } else {
                System.out.println("The student with the age " + age[i] + " cannot vote");
            }
        }

        input.close();

    }
}
