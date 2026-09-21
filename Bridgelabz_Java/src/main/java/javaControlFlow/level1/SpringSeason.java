package javaControlFlow.level1;
import java.util.Scanner;
//creating class to check given date in spring season or not
public class SpringSeason {
    public static void main(String[] arsgs){
        //Creating scanner object
        Scanner input=new Scanner(System.in);

        //creating month and day variables and taking user inputs
        System.out.println("Enter month and day in numbers :");
        int month=input.nextInt();
        int day=input.nextInt();

        //checking
        if ((month>0 && month<12) && (day>0 && day<31)) {
            if (month > 3 && month < 6) {
                System.out.print("Its a Spring Season");
            } else if ((month == 3 && day >= 20) || (month == 6 && day <= 20)) {
                System.out.print("Its a Spring Season");
            } else {
                System.out.print("Its not a Spring Season");
            }
        }else{
            System.out.print("Enter proper date");
        }
        input.close();
    }
}
