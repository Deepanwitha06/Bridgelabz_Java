package javaMethods.level3;
import java.lang.Math;
/* create a class to display the shortest, tallest and mean height among the team
   formula : mean = sum of heights/no.of people in team
 */
public class MinMaxMean {
    //create a method to calculate the sum of heights
    public static int sumOfHeights(int[] heights){
        int sum=0;
        for(int i=0;i<heights.length;i++){
            sum+=heights[i];
        }
        return sum;
    }

    //create a method to calculate the mean of heights
    public static double meanOfHeights(int sum,int count){
        double mean=(double)sum/(double)count;
        return mean;
    }

    //create a method to calculate the shortest
    public static int minOfHeights(int[] heights){
        int min=heights[0];
        for(int i=0;i<heights.length;i++){
            min=Math.min(min,heights[i]);
        }
        return min;
    }

    //create a method to calculate the tallest
    public static int maxOfHeights(int[] heights){
        int max=heights[0];
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,heights[i]);
        }
        return max;
    }

    public static void main(String[] args){
        //create an array of size 11
        int[] heights=new int[11];

        //get 3 digit randome height in cms between range 150 to 250
        for(int i=0;i<heights.length;i++){
            heights[i]=(int)(Math.random()*100)+150;
        }

        //calling the methods and display the results
        System.out.println("The heights of the team are:");
        for(int i=0;i<heights.length;i++){
            System.out.println(heights[i]+" ");
        }
        int sum=sumOfHeights(heights);
        System.out.println("The sum of heights is "+sum);
        System.out.println("The mean of heights is "+meanOfHeights(sum,heights.length) );
        System.out.println("The shortest height is "+minOfHeights(heights) );
        System.out.println("The tallest height is "+maxOfHeights(heights) );
    }
}
