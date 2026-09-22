package javaArrays.level2;
import java.util.Scanner;
//create a class to calculate bmi using 2D array
public class bmi2D {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and 2D array
        System.out.println("Enter no.of people are in the team:");
        int count=input.nextInt();
        double[][] personData=new double[count][3];
        String[] status=new String[count];

        System.out.println("Enter the weights and heights of team members: ");
        for(int i=0;i<count;i++){
            personData[i][0]=input.nextDouble();
            personData[i][1]=input.nextDouble();
            personData[i][2]=(personData[i][0])/(personData[i][1]*personData[i][1]);
            if(personData[i][2]<18.5){
                status[i]="Underweight";
            }else if(personData[i][2]>=18.5 && personData[i][2]<=24.9){
                status[i]="Normal";
            }else if(personData[i][2]>=25 && personData[i][2]<=39.9){
                status[i]="Overweight";
            }else{
                status[i]="Obese";
            }
        }
        System.out.println("Serial No.  Physics  Chemistry  Maths  Percentage  Grade");

        System.out.println("Serial No.  Height  Weight  BMI        Weight Status");

        for(int i = 0; i < count; i++){
            System.out.println((i + 1) + "          "+ personData[i][1] + "      "+ personData[i][0] + "      " + personData[i][2] + "      "+ status[i]);
        }
        input.close();
    }
}
