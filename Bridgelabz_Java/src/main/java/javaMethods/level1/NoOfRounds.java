package javaMethods.level1;
import java.util.Scanner;
/*create a class to calculate the number of rounds can be doone,
    a triangular park to complete 5km*/
public class NoOfRounds {
    //create a method to calculate the number of rounds by first calculating the perimeter
    //after calculating the perimeter, for the number of rounds divide the distance which is 5km with the perimeter
    public static double calculateNoOfTRounds(double firstSide,double SecondSide,double thirdSide){
        double perimeter=(firstSide+SecondSide+thirdSide);
        return 5/perimeter;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user inputs
        System.out.println("Enter the length of the sides of the park (in km): ");
        double firstSide=input.nextDouble();
        double secondSide=input.nextDouble();
        double thirdSide=input.nextDouble();

        double RoundsCount=calculateNoOfTRounds(firstSide,secondSide,thirdSide);
        System.out.println(RoundsCount+" no.of rounds user needs to do to complete 5km run");
        input.close();

    }
}
