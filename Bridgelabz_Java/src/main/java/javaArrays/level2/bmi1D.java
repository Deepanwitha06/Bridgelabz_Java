package javaArrays.level2;
import java.util.Scanner;
//create a class to calculate BMI using 1D arrays
public class bmi1D {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create arrays for weight,heigh,bmi,status and take user inputs
        System.out.println("Enter no.of persons in the team :");
        int count=input.nextInt();
        double[] weight=new double[count];
        double[] height=new double[count];
        double[] bmi=new double[count];
        String[] status=new String[count];
        //take input
        System.out.println("Enter weight and height of everyone:");
        for(int i=0;i<count;i++){
            weight[i]=input.nextDouble();
            height[i]=input.nextDouble();
        }
        for (int i=0;i<count;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<=18.4){
                status[i]="Underweight";
            }else if(bmi[i]>=18.5 && bmi[i]<=24.9){
                status[i]="Normal";
            }else if(bmi[i]>=25 && bmi[i]<=39.9){
                status[i]="Overweight";
            }else{
                status[i]="Obese";
            }
        }
        System.out.println("Serial No.  Height  Weight  BMI        Weigth Status");
        for(int i=0;i<count;i++){
            System.out.println((i+1)+"    "+height[i]+"    "+weight[i]+"    "+bmi[i]+"    "+status[i]);
        }
        input.close();


    }
}
