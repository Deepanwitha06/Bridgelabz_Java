package javaControlFlow.level2;
import java.util.Scanner;
//creating class for calculating bmi
public class bmi {
    public static void main(String[] args){
        //craeting scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.print("Enter weight(kg) and height(cm):");
        double weight=input.nextDouble();
        double cheight=input.nextDouble();
        double mheight=cheight/100;

        //calculating bmi
        double bmi = weight/(mheight*mheight);
        //Status
        if(bmi<=18.4){
            System.out.print("Underweight");
        }else if(bmi>=18.5 && bmi<=24.9){
            System.out.print("Normal");
        }else if(bmi>=25 && bmi<=39.9){
            System.out.print("Overweight");
        }else{
            System.out.print("Obese");
        }
        input.close();
    }
}
