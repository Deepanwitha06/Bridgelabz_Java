package javaMethods.level2;
import java.util.Scanner;
import java.lang.Math;
/* create a class to find the roots of quadratic equation
   Formula: delta=(b*b)+(4*a*c)
            root1=(-b+sqrt delta)/(2*a)
            root2=(-b-sqrt delta)/(2*a)
            if delta=0 root=(-b/(2*a))
 */
public class QuadracticRoots {
    //create a method to find the roots
    public static double[] roots(int a,int b,int c){
        double delta=(Math.pow(b,2))-(4*a*c);
        if(delta==0){
            double root=((double)-b/(2*a));
            double[] result={root};
            return result;
        }else if(delta>0){
            double root1=(-b+Math.sqrt(delta))/(2*a);
            double root2=(-b-Math.sqrt(delta))/(2*a);
            double[] result={root1,root2};
            return result;
        }else{
            double[] result={};
            return result;
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.print("Enter a,b and c values:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        double[] result=roots(a,b,c);
        if(result.length==0){
            System.out.println("There are no real roots");
        }else{
            System.out.println("The roots are: ");
            for(int i=0;i<result.length;i++){
                System.out.println(result[i]);
            }
        }

        input.close();
    }
}
