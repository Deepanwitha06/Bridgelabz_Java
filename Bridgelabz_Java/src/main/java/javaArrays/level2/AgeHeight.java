package javaArrays.level2;
import java.util.Scanner;
//create class to check greatest and smallest number among the array
public class AgeHeight {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create 3 arrays for name,age and height
        String[] name={"Amar","Akbar","Anthony"};
        System.out.println("Enter Age of Amar, Akbar and Anthony:");
        int[] age=new int[3];
        for(int i=0;i<3;i++){
            age[i]=input.nextInt();
        }
        System.out.println("Enter Heights of Amar, Akbar and Anthony:");
        double[] height=new double[3];
        for(int i=0;i<3;i++){
            height[i]=input.nextDouble();
        }

        //find the youngest
        int youngestIndex=0;
        int tallestIndex=0;
        double maxheight=height[0];
        int minage=age[0];
        for(int i=0;i<3;i++){
            if (age[i]<minage){
                minage=age[i];
                youngestIndex=i;
            }
            if(height[i]>maxheight){
                maxheight=height[i];
                tallestIndex=i;
            }
        }
        System.out.println("The tallest among 3 is "+name[tallestIndex]+" and the youngest is "+name[youngestIndex]);
    }
}
