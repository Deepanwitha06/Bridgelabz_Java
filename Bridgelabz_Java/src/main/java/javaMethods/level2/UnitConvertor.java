package javaMethods.level2;
import java.util.Scanner;
/*create a class called unit convertor to convert units(conversion factor):
           -  kilometers to miles (0.621371)
           - miles to kilometers   (1.60934)
           - meters to feet        (3.28084)
           - feet to meters        (0.3048)
    Logic: new value= old value* conversion factor
  */
public class UnitConvertor {
    //create a method to convert kilometers to miles
    public static double convertKmToMiles(double km){
        double miles=km* 0.621371;
        return miles;
    }

    //create a method to convert miles to kilometers
    public static double convertMilesToKm(double miles){
        double km=miles* 1.60934;
        return km;
    }

    //create a method to convert meters to feet
    public static double convertmtofeet(double m){
        double feet=m* 3.28084;
        return feet;
    }

    //create a method to convert feet to meters
    public static double convertfeettom(double feet){
        double m=feet* 0.3048;
        return m;
    }

    public static void main(String[] args) {
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the option for the unit conversion \noption 1: kilometers to miles \noption 2:miles to kilometers \noption 3: meters to feet \noption 4:feet to meters ");
        int option = input.nextInt();
        System.out.println("Enter the value: ");
        double value=input.nextDouble();
        double result;
        switch (option) {
            case 1:
                result=convertKmToMiles(value);
                System.out.println(value+" km = "+result+" miles");
                break;
            case 2:
                result=convertMilesToKm(value);
                System.out.println(value+" miles = "+result+" km");
                break;
            case 3:
                result=convertmtofeet(value);
                System.out.println(value+" m = "+result+" feet");
                break;
            case 4:
                result=convertfeettom(value);
                System.out.println(value+" feet = "+result+" m");
                break;
        }
        input.close();
    }

}
