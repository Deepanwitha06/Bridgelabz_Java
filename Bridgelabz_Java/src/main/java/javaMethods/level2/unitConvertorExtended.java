package javaMethods.level2;
import java.util.Scanner;
/*
create a class called unit convertor to convert units(conversion factor):
           - kilometers to miles (0.621371)
           - miles to kilometers (1.60934)
           - meters to feet (3.28084)
           - feet to meters (0.3048)
           - yards to feet (3)
           - feet to yards (0.333333)
           - meters to inches (39.3701)
           - inches to meters (0.0254)
           - inches to centimeters (2.54)
           - Fahrenheit to Celsius
           - Celsius to Fahrenheit
           - pounds to kilograms (0.453592)
           - kilograms to pounds (2.20462)
           - gallons to liters (3.78541)
           - liters to gallons (0.264172)

Logic: new value = old value * conversion factor
*/

public class unitConvertorExtended {

    // create a method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double miles = km * 0.621371;
        return miles;
    }

    // create a method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double km = miles * 1.60934;
        return km;
    }

    // create a method to convert meters to feet
    public static double convertmtofeet(double m) {
        double feet = m * 3.28084;
        return feet;
    }

    // create a method to convert feet to meters
    public static double convertfeettom(double feet) {
        double m = feet * 0.3048;
        return m;
    }

    // create a method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double feet = yards * 3;
        return feet;
    }

    // create a method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double yards = feet * 0.333333;
        return yards;
    }

    // create a method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double inches = meters * 39.3701;
        return inches;
    }

    // create a method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double meters = inches * 0.0254;
        return meters;
    }

    // create a method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    // create a method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // create a method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // create a method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double kilograms = pounds *0.453592;
        return kilograms;
    }

    // create a method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double pounds = kilograms * 2.20462;
        return pounds;
    }

    // create a method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double liters = gallons * 3.78541;
        return liters;
    }

    // create a method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double gallons = liters * 0.264172;
        return gallons;
    }

    public static void main(String[] args) {

        // create a scanner object
        Scanner input = new Scanner(System.in);

        // create a variable and take user input
        System.out.println("Enter the option for the unit conversion");
        System.out.println("option 1: kilometers to miles");
        System.out.println("option 2: miles to kilometers");
        System.out.println("option 3: meters to feet");
        System.out.println("option 4: feet to meters");
        System.out.println("option 5: yards to feet");
        System.out.println("option 6: feet to yards");
        System.out.println("option 7: meters to inches");
        System.out.println("option 8: inches to meters");
        System.out.println("option 9: inches to centimeters");
        System.out.println("option 10: Fahrenheit to Celsius");
        System.out.println("option 11: Celsius to Fahrenheit");
        System.out.println("option 12: pounds to kilograms");
        System.out.println("option 13: kilograms to pounds");
        System.out.println("option 14: gallons to liters");
        System.out.println("option 15: liters to gallons");

        int option = input.nextInt();

        System.out.println("Enter the value: ");
        double value = input.nextDouble();

        double result;

        switch (option) {
            case 1:
                result = convertKmToMiles(value);
                System.out.println(value + " km = " + result + " miles");
                break;

            case 2:
                result = convertMilesToKm(value);
                System.out.println(value + " miles = " + result + " km");
                break;

            case 3:
                result = convertmtofeet(value);
                System.out.println(value + " m = " + result + " feet");
                break;

            case 4:
                result = convertfeettom(value);
                System.out.println(value + " feet = " + result + " m");
                break;

            case 5:
                result = convertYardsToFeet(value);
                System.out.println(value + " yards = " + result + " feet");
                break;

            case 6:
                result = convertFeetToYards(value);
                System.out.println(value + " feet = " + result + " yards");
                break;

            case 7:
                result = convertMetersToInches(value);
                System.out.println(value + " m = " + result + " inches");
                break;

            case 8:
                result = convertInchesToMeters(value);
                System.out.println(value + " inches = " + result + " m");
                break;

            case 9:
                result = convertInchesToCentimeters(value);
                System.out.println(value + " inches = " + result + " cm");
                break;

            case 10:
                result = convertFarhenheitToCelsius(value);
                System.out.println(value + " Fahrenheit = " + result + " Celsius");
                break;

            case 11:
                result = convertCelsiusToFarhenheit(value);
                System.out.println(value + " Celsius = " + result + " Fahrenheit");
                break;

            case 12:
                result = convertPoundsToKilograms(value);
                System.out.println(value + " pounds = " + result + " kg");
                break;

            case 13:
                result = convertKilogramsToPounds(value);
                System.out.println(value + " kg = " + result + " pounds");
                break;

            case 14:
                result = convertGallonsToLiters(value);
                System.out.println(value + " gallons = " + result + " liters");
                break;

            case 15:
                result = convertLitersToGallons(value);
                System.out.println(value + " liters = " + result + " gallons");
                break;

            default:
                System.out.println("Invalid option");
        }

        input.close();
    }
}
