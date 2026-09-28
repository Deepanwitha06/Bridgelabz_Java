package javaStrings.handlingStrings;
import java.util.Locale;
import java.util.Scanner;
/*
     to create a class that compares two strings lexicagraphically without using built in compare methods
 */
public class CompareStrings {
    //a method to compare string in dictionary order
    public static String stringComparision(String s1,String s2){
        String str1=s1.toLowerCase();
        String str2=s2.toLowerCase();
        char[] chs1=str1.toCharArray();
        char[] chs2=str2.toCharArray();
        String res="";
        if(s1.isEmpty()){
            return "first word is empty";
        }
        if(s2.isEmpty()){
            return "Second word is empty";
        }

        int len=(chs1.length>=chs2.length)?chs2.length:chs1.length;
        for(int i=0;i<len;i++){
            if(chs1[i]<chs2[i]){
                res= s1+" come before "+s2;
                break;
            }else if(chs1[i]>chs2[i]){
                res=s2+" come before "+s1;
                break;
            }
            if(i==len-1){
                if(s1.length()==len && s2.length()>len){
                    res= s1+" come before "+s2;
                }else if(s2.length()==len && s1.length()>len){
                    res=s2+" come before "+s1;
                }else{
                    res="Same words";
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user inputs
        System.out.println("Enter the first word:");
        String s1=input.nextLine();
        System.out.println("Enter the second word:");
        String s2=input.nextLine();
        System.out.println(stringComparision(s1,s2));

        input.close();
    }

}
