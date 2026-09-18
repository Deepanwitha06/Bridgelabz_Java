package javaProgrammingElement;
import java.util.Scanner;

/*
 * Problem 10 (GCR - JAVA Programming Elements assignment)
 * Convert Kilometers to Miles
 *
 * Author: Deepanwitha
 * Date: 18-09-2026
 */


public class KilometersToMiles {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter distance in kilometers: ");
 double km = sc.nextDouble();
 double miles = km * 0.621371;

 System.out.println("Distance in miles = " + miles);
    }

}