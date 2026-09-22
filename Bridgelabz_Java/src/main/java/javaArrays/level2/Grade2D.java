package javaArrays.level2;
import java.util.Scanner;
//create a class for grading using 1D array
public class Grade2D {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and arrays along with taking user inputs
        System.out.println("Enter no.of students:");
        int count=input.nextInt();
        double[][] marks=new double[count][3];
        double[] percentage=new double[count];
        String[] grade=new String[count];

        //array input
        System.out.print("Enter the physics,chemistry and math marks: ");
        for(int i=0;i<count;i++) {
            for (int j = 0; j < 3; j++) {
                double temp = input.nextDouble();
                if(temp<0){
                    System.out.println("Invalid marks. Please enter Positive marks:");
                    j--;
                    continue;
                }
                marks[i][j]=temp;
            }
        }
        //percentage calculation and gradeing
        for(int i=0;i<count;i++){
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
            if(percentage[i]>=80){
                grade[i]="A";
            }else if(percentage[i]<80 && percentage[i]>=70){
                grade[i]="B";
            }else if(percentage[i]<70 && percentage[i]>=60){
                grade[i]="C";
            }else if(percentage[i]<60 && percentage[i]>50){
                grade[i]="D";
            }else if(percentage[i]<50 && percentage[i]>40){
                grade[i]="E";
            }else{
                grade[i]="R";
            }

        }
        // display result
        System.out.println("Serial No.  Physics  Chemistry  Maths  Percentage  Grade");

        for(int j = 0; j < count; j++) {

            System.out.println((j + 1) + "          "
                    + marks[j][0] + "       "
                    + marks[j][1] + "         "
                    + marks[j][2] + "     "
                    + percentage[j] + "       "
                    + grade[j]);
        }

        input.close();

    }
}
