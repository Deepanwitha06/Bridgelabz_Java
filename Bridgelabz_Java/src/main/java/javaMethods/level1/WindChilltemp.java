package javaMethods.level1;
import java.util.Scanner;
import java.lang.Math;
/* Create a class to calculate the wind chille temperature
   logic: windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed^(0.16)
    instruction: Use math.pow for calculating the power hence import java.lang.Math
 */
public class WindChilltemp {
    //create a class to calculate the wind chill temp
    public double calculateWindChill(double temperature, double windSpeed){
        double windchill=35.74+(0.6215*temperature)+((0.4275*temperature)-35.75)*Math.pow(windSpeed,0.16);
        return windchill;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);
        WindChilltemp wct=new WindChilltemp();

        //create variable and take input
        System.out.println("Enter the temperature and the windspeed: ");
        double temperature=input.nextDouble();
        double windSpeed=input.nextDouble();

        //display
        System.out.println("The wind chill spedd for the given information is "+wct.calculateWindChill(temperature,windSpeed));
        input.close();

    }

}
