package javaMethods.level1;
import java.util.Scanner;
// create a class to calculate simple interest using method- simpleInterest
public class SimpleInterest {
    //create a method simpleInterest to calculate it by taking the parameter principle,time and rate of interest
    public static double calculateSimpleInterest(double principle,double rate,double time){
       double simpleInterest=(principle*time*rate)/100;
       return simpleInterest;
    }
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //creating variable and take user input
        System.out.println("Enter the principle amount, rate of interest and time: ");
        double principle=input.nextDouble();
        double rate=input.nextDouble();
        double time=input.nextDouble();

        //get the simpleinterest
        double answer = calculateSimpleInterest(principle,rate,time);
        System.out.println("The Simple Interest is "+answer+" for Principal "+principle+", Rate of Interest "+rate+" and Time "+time);
        input.close();
    }
}
