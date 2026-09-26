package javaMethods.level3;

import java.util.Scanner;
/* Create a class to find the bonus of 10 employees based on their years of service and calculate the total bonus, old salary and new salary.
Methods:
- Generate salary and years of service
- Calculate new salary and bonus
- Calculate total old salary, new salary and bonus
*/

public class Bonus {
    // Method to generate salary and years of service
    public static int[][] generateEmployeeDetails(int numberOfEmployees) {
        int[][] employeeDetails = new int[numberOfEmployees][2];
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeDetails[i][0] = (int) (Math.random() * 90000) + 10000;
            employeeDetails[i][1] = (int) (Math.random() * 10) + 1;
        }
        return employeeDetails;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeDetails) {
        double[][] result = new double[employeeDetails.length][2];
        for (int i = 0; i < employeeDetails.length; i++) {
            int oldSalary = employeeDetails[i][0];
            int yearsOfService = employeeDetails[i][1];
            double bonus;
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }
            double newSalary = oldSalary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to calculate total old salary, new salary and bonus
    public static double[] calculateTotals(int[][] employeeDetails, double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        for (int i = 0; i < employeeDetails.length; i++) {
            totalOldSalary += employeeDetails[i][0];
            totalNewSalary += result[i][0];
            totalBonus += result[i][1];
        }
        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        int numberOfEmployees = 10;
        // Generate employee details
        int[][] employeeDetails = generateEmployeeDetails(numberOfEmployees);
        // Calculate bonus and new salary
        double[][] result = calculateBonus(employeeDetails);
        // Calculate totals
        double[] totals = calculateTotals(employeeDetails, result);

        // Display employee details
        System.out.println("Employee\tOld Salary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("%d\t\t%.2f\t\t%d\t%.2f\t\t%.2f%n", i + 1, (double) employeeDetails[i][0], employeeDetails[i][1], result[i][0], result[i][1]);
        }
        // Display totals
        System.out.println("\nTotal Old Salary = " + totals[0]);
        System.out.println("Total New Salary = " + totals[1]);
        System.out.println("Total Bonus = " + totals[2]);

        input.close();
    }
}