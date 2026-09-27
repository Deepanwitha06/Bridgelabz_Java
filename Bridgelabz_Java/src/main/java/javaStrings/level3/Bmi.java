package javaStrings.level3;
import java.util.Scanner;
import java.lang.Math;
/*
   BMI Calculator
   Find Height, Weight, BMI and Status of 10 persons
*/
public class Bmi {
    // method to calculate BMI and status
    public static String[] calculateBMI(double weight,double height) {
        // convert height from cm to meter
        double heightInMeter=height/100;
        //bmi calculation
        double bmi=weight/(heightInMeter*heightInMeter);
        bmi = Math.round(bmi*100.0)/100.0;
        String status;
        if (bmi<18.5){
            status="Underweight";
        } else if (bmi<25){
            status="Normal";
        } else if (bmi<30){
            status="Overweight";
        } else{
            status="Obese";
        }
        String[] result=new String[2];
        result[0]=String.valueOf(bmi);
        result[1]=status;
        return result;
    }

    // method to calculate BMI for all persons
    public static String[][] calculateAllBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i=0;i<data.length;i++) {
            double weight=data[i][0];
            double height=data[i][1];
            String[] bmiResult=calculateBMI(weight, height);
            result[i][0]=String.valueOf(height);
            result[i][1]=String.valueOf(weight);
            result[i][2]=bmiResult[0];
            result[i][3]=bmiResult[1];
        }
        return result;
    }

    // method to display the result
    public static void display(String[][] result) {
        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for(int i=0;i<result.length;i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s%n", i + 1, result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        // create 2D array and take inputs
        double[][] data = new double[10][2];
        for (int i=0;i<data.length;i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (in kg) and height (in cm): ");
            data[i][0] = input.nextDouble();
            data[i][1] = input.nextDouble();
        }

        // calculate BMI
        String[][] result = calculateAllBMI(data);

        // display result
        display(result);

        input.close();
    }
}