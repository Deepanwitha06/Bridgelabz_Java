package javaMethods.level1;
import java.util.Scanner;
/* create a class to check whether the given date is Spring season or not
    Condition : Spring Season is from march 20 to june 20
    Logic : when month is march day should be greter than 19
               and when it is june date should be less than 21
               also when month is between march and june the  day can be anything to be spring season
 */
public class SpringSeason {
    //create a method to check whether given date is spring season or not
    public static boolean IsSpring(int day,int month){
        if(month==3 && day>=20){
            return true;
        }else if(month==6 && day<=20){
            return true;
        }else if(month>3 && month<6){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create varaibles and take input for month and day
        System.out.println("Enter the date(1-31): ");
        int day=input.nextInt();
        while(day<1 || day>31){
            System.out.println("Enter valid date again:");
            day=input.nextInt();
        }
        System.out.println("Enter the month(1-12): ");
        int month=input.nextInt();
        while(month<1 || month>12){
            System.out.println("Enter valid month again:");
            month=input.nextInt();
        }

        if(IsSpring(day,month)){
            System.out.println("Its a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
        input.close();

    }
}
