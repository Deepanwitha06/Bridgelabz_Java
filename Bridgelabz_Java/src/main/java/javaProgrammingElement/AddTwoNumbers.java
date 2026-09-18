package javaProgrammingElement;
import java.util.Scanner;
/*
 * Problem 2 (GCR - JAVA Programming Elements assignment)
 * Add Two Numbers
 *
 * Author: Deepanwitha
 * Date: 18-09-2026
 */

public class AddTwoNumbers {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter first number: ");
 int fn = scanner.nextInt();
 System.out.print("Enter second number: ");
 int sn = scanner.nextInt();

 int sum = fn + sn;
 System.out.println("Sum = " + sum);
    }

}