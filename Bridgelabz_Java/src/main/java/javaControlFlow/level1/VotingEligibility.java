package javaControlFlow.level1;
import java.util.Scanner;

//creating class to check voting eligibility
public class VotingEligibility {
    public static void main(String[] args){
        //creating scanner onject
        Scanner input=new Scanner(System.in);

        //creating variable age and take user input
        System.out.print("Enter Age:");
        int age=input.nextInt();

        System.out.print("The person's Age is "+age);
        //checking vote eligibility
        if (age>=18) {
            System.out.print(" and can vote");
        }else{
            System.out.print("and cannot vote");
        }
        input.close();
    }
}
