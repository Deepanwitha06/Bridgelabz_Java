package javaMethods.level1;
import java.util.Scanner;
import java.lang.Math;
/* Create a class to calculate various trigonometric funtions
   logic: convert degrees into radians
          Then use the trigonometric functions from the Math class
    Trigonometric fi=unctions : sine,cosine and tangent
    Functions used            : Math.sin(), Math.cos(),Math.tan(), Math.toRadians(degree)
 */
public class TriginometrcFn {
    //create a method to calculate various trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle){
        double rad=Math.toRadians(angle);
        double sin=Math.sin(rad);
        double cos=Math.cos(rad);
        double tan=Math.tan(rad);

        double[] result={sin,cos,tan};
        return result;
    }

    public static void main(String[] args){
        //create scanner and the class objects
        Scanner input=new Scanner(System.in);
        TriginometrcFn tf=new TriginometrcFn();

        //create variable and take user input
        System.out.print("Enter the angle(in degrees): ");
        double angle=input.nextDouble();

        double[] result= tf.calculateTrigonometricFunctions(angle);
        System.out.print("The sin, cosine and tangent of the given angle are "+result[0]+", "+result[1]+" and "+result[2]+" respectively");
        input.close();
    }
}
