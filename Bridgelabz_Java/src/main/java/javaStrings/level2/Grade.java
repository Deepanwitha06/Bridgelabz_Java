package javaStrings.level2;
import java.util.Scanner;
import java.lang.Math;
/*
   PCM Scorecard
   Physics, Chemistry and Mathematics ( random marks)
*/
public class Grade {
    // method to generate random 2-digit PCM scores for students
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < scores.length; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    // method to calculate total, average and percentage
    public static double[][] calculate(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double average=(double)total/3;
            double percentage=(double)total/300 * 100;
            result[i][0]=total;
            result[i][1]=Math.round(average * 100.0) / 100.0;
            result[i][2]=Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // method to calculate grade based on percentage
    public static String[][] calculateGrade(double[][] result) {
        String[][] grade=new String[result.length][1];
        for (int i=0;i<result.length;i++) {
            double percentage=result[i][2];
            if (percentage>=80) {
                grade[i][0]="A";
            } else if (percentage>=70) {
                grade[i][0]="B";
            } else if (percentage>=60) {
                grade[i][0]="C";
            } else if (percentage>=50) {
                grade[i][0]="D";
            } else if (percentage>=40) {
                grade[i][0]="E";
            } else {
                grade[i][0]="R";
            }
        }

        return grade;
    }

    // method to display
    public static void display(int[][] scores,double[][] result,String[][] grade) {
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i=0;i<scores.length;i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\t\t%s%n", i + 1, scores[i][0], scores[i][1], scores[i][2], result[i][0], result[i][1], result[i][2], grade[i][0]);
        }
    }

    public static void main(String[] args) {
        //create a scanner object
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no.of students:");
        int n=input.nextInt();
        //calling methods
        int[][] scores=generateScores(n);
        double[][] result=calculate(scores);
        String[][] grade=calculateGrade(result);
        display(scores,result,grade);
    }
}