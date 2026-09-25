package javaMethods.level2;
import java.util.Scanner;
/* Create a class to check the youngest and tallest among three friend
    Logic: Smallest and largest numbers in two different set of three numbers respectively
            the first number will be taken as the youngest in its set and the first number will be taken as largest in its set later compare with other two
 */
public class YoungestTallest {
    //create a method to find the youngest
    public static int youngest(int[] age){
        int youngest=age[0];
        int youngestIndex=0;
        if(youngest>age[1]){
            youngestIndex=1;
            youngest=age[1];
        }
        if(youngest>age[2]){
            youngestIndex=2;
            youngest=age[2];
        }
        return youngestIndex;
    }

    //create a method to find the tallest
    public static int tallest(double[] height){
        double tallest=height[0];
        int tallestIndex=0;
        if(tallest<height[1]){
            tallestIndex=1;
            tallest=height[1];
        }
        if(tallest<height[2]){
            tallestIndex=2;
            tallest=height[2];
        }
        return tallestIndex;
    }

    public static void main(String[] args){
        //create a scanner variable
        Scanner input=new Scanner(System.in);

        //create arrays and take inputs
        //take age inputs
        int[] age=new int[3];
        System.out.println("Enter the ages of Amar, Akbar and Anthony: ");
        for(int i=0;i<3;i++){
            age[i]=input.nextInt();
        }
        //take height
        double[] height=new double[3];
        System.out.println("Enter the heights of Amar, Akbar and Anthony: ");
        for(int i=0;i<3;i++){
            height[i]=input.nextDouble();
        }
        String[] names={ "Amar", "Akbar","Anthony"};

        int youngestIndex=youngest(age);
        int tallestIndex=tallest(height);
        System.out.println("The youngest among the three is "+names[youngestIndex]+" and the tallest is "+names[tallestIndex]);

        input.close();
    }
}
