package javaProgrammingElement;
import java.util.Scanner;

/*
 * Problem 7 (GCR - JAVA Programming Elements assignment)
 * Perimeter of a Rectangle
 *
 * Author: Deepanwitha
 * Date: 18-09-2026
 */


public class PerimeterOfRectangle {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter length: ");
 double l= sc.nextDouble();

 System.out.print("Enter width: ");
 double w = sc.nextDouble();

 double perimeter = 2 * (l+w);
 System.out.println("Perimeter of Rectangle = " + perimeter);
    }

}