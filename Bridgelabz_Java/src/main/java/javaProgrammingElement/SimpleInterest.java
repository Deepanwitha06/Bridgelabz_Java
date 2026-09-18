package javaProgrammingElement;
import java.util.Scanner;

/*
 * Problem 6 (GCR - JAVA Programming Elements assignment)
 * Calculate Simple Interest
 *
 * Author: Deepanwitha
 * Date: 18-09-2026
 */


public class SimpleInterest {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter principal amount: ");
 double p = sc.nextDouble();
 System.out.print("Enter time: ");
 double t = sc.nextDouble();
 System.out.print("Enter rate of interest: ");
 double r = sc.nextDouble();

 double si = (p*t*r) / 100;

        System.out.println("Simple Interest = " + si);
    }

}