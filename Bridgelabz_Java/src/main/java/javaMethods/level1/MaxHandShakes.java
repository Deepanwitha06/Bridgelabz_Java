package javaMethods.level1;
import java.util.Scanner;
//create a class to calculate maximum number of handshakes
public class MaxHandShakes {
    //create a method to calculate maximum number of handshakes
    public static int calculateMaxHandshakes(int n){
        return (n*(n-1)/2);
    }
    public static void main(String[] args){
        //create a scanner object
        Scanner input=new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter no.of students:");
        int numberOfStudents=input.nextInt();

        //get maximum number of handshakes
        int maxHandshakes=calculateMaxHandshakes(numberOfStudents);
        System.out.println("The maximum no.of handshakes between "+numberOfStudents+" students are "+maxHandshakes);
        input.close();

    }
}
