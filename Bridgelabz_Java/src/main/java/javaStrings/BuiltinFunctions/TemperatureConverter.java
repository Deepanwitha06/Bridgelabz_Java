package javaStrings.BuiltinFunctions;
import java.util.Scanner;
/*
   create a class to convert temperature
 */
public class TemperatureConverter {
    // a method to take input
    public static double getInput(){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        double userInput=input.nextDouble();
        return userInput;
    }

    // a method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }

    // a method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }

    // a method to display
    public static void display(double temperature){
        System.out.println("The converted temperature is "+temperature);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Choose the conversion:");
        System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");

        int choice=input.nextInt();
        double temperature;
        if(choice==1){
            temperature=getInput();
            display(fahrenheitToCelsius(temperature));
        }else if(choice==2){
            temperature=getInput();
            display(celsiusToFahrenheit(temperature));
        }else{
            System.out.println("Invalid choice");
        }
    }
}