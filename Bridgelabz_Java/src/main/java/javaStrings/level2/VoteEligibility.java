package javaStrings.level2;
import java.lang.Math;
/*
  create a class to check the vote eligibility of 10 students
   2d array usage
 */
public class VoteEligibility {
    //create a method to get ages of 10 students
    public static int[] age(){
        int[] studentAge=new int[10];
        for(int i=0;i<studentAge.length;i++){
            studentAge[i]=(int) ( Math.random()*90)+10;
        }
        return studentAge;
    }

    //create a method to collect the age array and give 2D string array
    public static String[][] eligibilty(int[] age){
        String[][] info=new String[age.length][2];
        for(int i=0;i<age.length;i++){
            info[i][0]=String.valueOf(age[i]);
            if(age[i]>=18){
                info[i][1]="true";
            }else{
                info[i][1]="false";
            }
        }
        return info;
    }

    public static void display(String[][] info){
        System.out.println("Age\t Vote Eligible");
        for(int i=0;i<info.length;i++){
            System.out.printf("%s\t\t%s\n",info[i][0],info[i][1]);
        }
    }

    public static void main(String[] args){
        int[] studentAge=age();
        String[][] info=eligibilty(studentAge);
        display(info);
    }
}
