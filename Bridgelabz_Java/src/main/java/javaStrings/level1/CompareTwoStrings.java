package javaStrings.level1;
import java.util.Scanner;
/* create a class to compare two strings
   methods : compare strings using charAt()
             then check whether the result and the one using string built in method is same or not
 */
public class CompareTwoStrings {
    //create a class to compare two strings using charAt()
    public static boolean isSame(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.println("Enter two strings:");
        String s1=input.next();
        String s2=input.next();

        //calling method
        boolean result=isSame(s1,s2);
        //using built in
        boolean res=s1.equals(s2);
        if(res==result){
            System.out.println("The result through both the built in method and using method charAt() is same and it is "+res);
        }else{
           System.out.println("The result by the built in method is "+res+" and by method using charAt() is "+result);
        }

        input.close();
    }
}
