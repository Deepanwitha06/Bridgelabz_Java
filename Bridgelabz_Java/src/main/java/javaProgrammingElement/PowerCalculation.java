package javaProgrammingElement;
import java.util.Scanner;

/*
 * Problem 8 (GCR - JAVA Programming Elements assignment)
 * Power Calculation
 *
 * Author: Deepanwitha
 * Date: 18-09-2026
 */

public class PowerCalculation {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter base: ");
 double b = sc.nextDouble();

 System.out.print("Enter exponent: ");
 double exp = sc.nextDouble();

 double result = Math.pow(b, exp);

        System.out.println("Result = " + result);
    }

}