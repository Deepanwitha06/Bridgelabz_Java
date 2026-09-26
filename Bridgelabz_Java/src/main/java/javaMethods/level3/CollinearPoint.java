package javaMethods.level3;
import java.util.Scanner;
import java.lang.Math;
/*Create a class to find whether 3 points are collinear
Methods:
- Check collinear using slope formula
- Check collinear using area of triangle formula
*/

public class CollinearPoint {
    // Create a method to check collinearity using slope
    public static boolean checkCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Create a method to check collinearity using area
    public static boolean checkCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        // Create scanner variable
        Scanner input = new Scanner(System.in);

        // Take input for first point
        System.out.println("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        // Take input for second point
        System.out.println("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        // Take input for third point
        System.out.println("Enter x3 and y3:");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Check using slope method
        boolean slopeResult = checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        if (slopeResult) {
            System.out.println("The points are collinear using slope method.");
        } else {
            System.out.println("The points are not collinear using slope method.");
        }

        // Check using area method
        boolean areaResult = checkCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        if (areaResult) {
            System.out.println("The points are collinear using area method.");
        } else {
            System.out.println("The points are not collinear using area method.");
        }

        input.close();
    }
}