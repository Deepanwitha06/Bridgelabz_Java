package javaMethods.level2;
import java.util.Scanner;
/*create a class to calculate the bmi
    Formula: bmi=weight/(height*height)
 */
public class bmi {
    //create a method to calculate bmi
    public static double[][] calculateBmi(double[][] info){
        double[] height=new double[10];
        for(int i=0;i<10;i++){
            height[i]=info[i][1]/100;
            info[i][2]=info[i][0]/(height[i]*height[i]);
        }
        return info;
    }

    //create a method to determine bmi status
    public static String[] bmiStatus(double[][] info){
        String[] status=new String[10];
        for(int i=0;i<10;i++){
            if(info[i][2]<=18.4){
                status[i]="Underweight";
            }else if(info[i][2]<=24.9){
                status[i]="Normal";
            }else if(info[i][2]<=39.9){
                status[i]="Overweight";
            }else{
                status[i]="Obese";
            }
        }
        return status;
    }

    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create an 2D array to collect the wight and height
        double[][] info=new double[10][3];
        System.out.println("Enter the weights of everyone:");
        for(int i=0;i<10;i++){
            info[i][0]=input.nextDouble();
        }
        System.out.println("Enter the heights of everyone:");
        for(int i=0;i<10;i++){
            info[i][1]=input.nextDouble();
        }

        info=calculateBmi(info);
        String[] status=bmiStatus(info);
        for(int i=0;i<10;i++){
            System.out.println("The height, weight, BMI and status of Person "+(i+1)+" are "+info[i][1]+", "+info[i][0]+", "+info[i][2]+" and "+status[i]);
        }

        input.close();

    }

}
