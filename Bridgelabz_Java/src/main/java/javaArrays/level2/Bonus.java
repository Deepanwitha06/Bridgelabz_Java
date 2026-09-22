package javaArrays.level2;
import java.util.Scanner;
//create class to calculate bonus of emplyees
public class Bonus {
    public static void main(String[] args){
        //create Scanner object
        Scanner input=new Scanner(System.in);

        //create array and collect the salary and years of experience
        System.out.println("Enter the salary and years of experience of all the employes:");
        double[][] array=new double[10][2];
        double[][] narray=new double[10][2];
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                double temp=input.nextDouble();
                if(temp<0){
                    System.out.println("Invalid input. Please enter again:");
                    j--;
                    continue;
                }
                array[i][j]=temp;
            }
        }
        double totalbonus=0;
        double totalnewsal=0;
        double totaloldsal=0;
        for(int i=0;i<10;i++){
            if (array[i][1]>5){
                narray[i][1]=array[i][0]*0.05;
            }else{
                narray[i][1]=array[i][0]*0.02;
            }
            narray[i][0]=array[i][0]+narray[i][1];
            totalbonus+=narray[i][1];
            totalnewsal+=narray[i][0];
            totaloldsal+=array[i][0];
        }
        for(int i =0;i<10;i++){
            System.out.print("The new salary and bonus of Employee " + (i+1)+" are " );
            for(int j=0;j<2;j++){
                if(j==0) {
                    System.out.print(narray[i][j] + " and ");
                }else{
                    System.out.println(narray[i][j]);
                }
            }
        }
        System.out.println("Total Bonus = "+totalbonus+"\nTotal old Salary = "+totaloldsal+"\nTotal New salary = "+totalnewsal);
        input.close();

    }
}
