package javaProgrammingElement;
import java.util.Scanner;

/*
 * Problem 3 (GCR - JAVA Programming Elements assignment)
 * Celsius to Fahrenheit Conversion
 *
 * Author: Deepanwitha
 * Date: 18-09-2026
 */

public class CelsiusToFahrenheit {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter temperature in Celsius: ");
 double c= sc.nextDouble();

 double f = (c * 9 / 5) + 32;

 System.out.println("Temperature in Fahrenheit = " + f);
    }

}