package javaMethods.level3;
import java.util.Scanner;
/* Create a class to calculate the total, average and percentage of students in Physics, Chemistry and Maths.
Methods:
- Generate random PCM scores
- Calculate total, average and percentage
- Display scorecard
*/

public class StudentScore {
    // Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate scores from 10 to 99
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i=0; i<scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%%n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();

        // Generate scores
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average and percentage
        double[][] results = calculateResults(scores);
        // Display scorecard
        displayScorecard(scores, results);

        input.close();
    }
}