package javaArrays.level2;
import java.util.Scanner;
// Create a class for grading using 1D arrays
public class Grade1D {
    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Create variable and array
        System.out.println("Enter no. of students:");
        int count = input.nextInt();
        double[] physics = new double[count];
        double[] chemistry = new double[count];
        double[] maths = new double[count];
        double[] percentage = new double[count];
        String[] grade = new String[count];

        // Array input
        for (int i = 0; i < count; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            double temp = input.nextDouble();
            if (temp < 0) {
                System.out.println("Invalid marks. Please enter again.");
                i--;
                continue;
            }
            physics[i] = temp;
            System.out.print("Chemistry: ");
            temp = input.nextDouble();
            if (temp < 0) {
                System.out.println("Invalid marks. Please enter again.");
                i--;
                continue;
            }
            chemistry[i] = temp;
            System.out.print("Maths: ");
            temp = input.nextDouble();
            if (temp < 0) {
                System.out.println("Invalid marks. Please enter again.");
                i--;
                continue;
            }
            maths[i] = temp;
        }

        // Percentage calculation and grading
        for (int i = 0; i < count; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] > 50) {
                grade[i] = "D";
            } else if (percentage[i] > 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }
        // Display result
        for(int j = 0; j < count; j++) {
            System.out.println((j + 1) + "          "+ physics[j] + "       " + chemistry[j] + "         "+ maths[j] + "     "+ percentage[j] + "       "+ grade[j]);
        }

        input.close();
    }
}