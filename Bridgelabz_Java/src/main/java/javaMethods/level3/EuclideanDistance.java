package javaMethods.level3;
import java.util.Scanner;
import java.lang.Math;
/* Create a class to find Euclidean distance and equation of a line between two points
Methods:
- Find Euclidean distance
- Find slope and y-intercept
*/

public class EuclideanDistance {
    // create a mthod to calculate  Euclidean Distance
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // create a method to calculate slope and y-intercept
    public static double[] findLineEquation(
            double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        double[] result = {slope, yIntercept};
        return result;
    }

    public static void main(String[] args) {
        //create scanner variable
        Scanner input = new Scanner(System.in);

        // Take input for first point
        System.out.println("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        // Take input for second point
        System.out.println("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Find distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance is = " + distance);
        // Find slope and y-intercept
        double[] result = findLineEquation(x1, y1, x2, y2);

        System.out.println("The slope is = " + result[0]);
        System.out.println("The y-intercept is = " + result[1]);
        System.out.println("The equation of the line is: y = " + result[0] + "x + " + result[1]);

        input.close();
    }
}