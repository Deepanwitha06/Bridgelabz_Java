package javaClassAndObject.level2;
import java.util.Scanner;
/*
     create a class PalindromChecker
     Attribute: text
     Methods : to verify palindrome status
 */
class PalindromeChecker{
    private String text;

    public PalindromeChecker(String text){
        this.text=text;
    }
    private boolean palindrome=false;
    public void checkPalindrome(){
        String res="";
        for(int i=text.length()-1;i>=0;i--){
            res+=text.charAt(i);
        }
        if(text.equals(res)){
            palindrome=true;
        }
    }

    public void display(){
        if(palindrome){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }

}
public class IsPalindrome {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the string: ");
        String text=input.nextLine();

        //create PalindromeChecker class object
        PalindromeChecker palindromeChecker=new PalindromeChecker(text);
        palindromeChecker.checkPalindrome();
        palindromeChecker.display();

        input.close();
    }
}
