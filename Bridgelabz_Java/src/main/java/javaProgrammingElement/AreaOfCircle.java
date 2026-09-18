package javaProgrammingElement;
import java.util.Scanner;

/*
 * Problem 4 (GCR - JAVA Programming Elements assignment)
 * Area of a Circle
 *
 * Author: Deepanwitha
 * Date: 18-09-2026
 */

public class AreaOfCircle {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter radius: ");
 double r = sc.nextDouble();

 double area = Math.PI*r* r;

 System.out.println("Area of Circle = " + area);
    }

}